package board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BoardDAO {
	
	
// 2. 게시물리스트 조회
public ArrayList<BoardVO> getBoardList
(int currentpage , int boardcount){
	
	ArrayList<BoardVO> resultlist = new ArrayList<BoardVO>();
		//board 테이블 select
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn =
		DriverManager.getConnection
		("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr", "hr");
        
		String sql=
		"select seq, title, time "
		+ "from (select rownum r, seq, title, time "
		+ "      from (select * from board order by time desc)"
		+ "     ) "
		+ "where r >= ? and r <= ?";
		
		PreparedStatement pt = conn.prepareStatement(sql);
        
		//1 5 : 1-5
		//2 5 : 6-10
		//3 5 : 11-15
		
		int first = (currentpage-1)*boardcount + 1  ;
		int second = currentpage*boardcount ;
	    
		System.out.println(first+":"+second);
	    
		pt.setInt(1, first);
		pt.setInt(2,  second);
		
		ResultSet rs = pt.executeQuery();
		// rs 레코드 조회해서 - BoardVO 객체 생성 - resultlist 저장 구현
        while(rs.next()) {
        	BoardVO vo = new BoardVO
        	(rs.getInt("seq"), 
        	rs.getString("title"), 
        	rs.getString("time"));
        	//vo.setSeq(rs.getInt("seq"));
        	//vo.setTitle(rs.getString("title"));
        	//vo.setTime(rs.getString("time"));
        	resultlist.add(vo);
        	//vo=null;
        }
        rs.close();
		conn.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			System.out.println("드라이버 등록 확인하세요.");
		}
		
		return resultlist;
} //getBoardList end 	
	
// 1. 게시물글쓰기 
public int insertBoard(BoardVO vo){
	int result = 0;
	//board 테이블 insert
	try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection conn =
	DriverManager.getConnection
	("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr", "hr");
	/* 1. vo.getWriter() 값이 member 테이블 memberid 존재하는지 여부 판단
	 * 1-1. 존재하면 board insert(구현 완료)
	 * 1-2. 존재하지 않으면 회원가입부터 하세요 출력
	 * */
	// rs.next(); true
	String selectSQL = 
	"select memberid from member where memberid=?";
	PreparedStatement pt2 = conn.prepareStatement(selectSQL);
	pt2.setString(1, vo.getWriter());
	ResultSet rs = pt2.executeQuery();
	if(!rs.next()) {//존재하지 않으면
		System.out.println("회원가입부터 하세요");
		return 0;
	}


	String insertSQL = 
	"insert into board values("
	+ "(select max(seq) + 1 from board), ?,?,?,sysdate,?,0)";
	PreparedStatement pt = conn.prepareStatement(insertSQL);
	pt.setString(1, vo.getTitle());
	pt.setString(2, vo.getContents());
	pt.setString(3, vo.getWriter());
	pt.setInt(4, vo.getPassword());
	result = pt.executeUpdate();//전송 - 실행 
	System.out.println(result + " 개의 행 삽입");
	conn.close();
	}catch(SQLException e) {
		e.printStackTrace();
	}catch(ClassNotFoundException e) {
		System.out.println("드라이버 등록 확인하세요.");
	}
	
	return result;
} //insertBoard end 


}
