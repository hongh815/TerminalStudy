package board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardDAO {
	// 1.게시물의 글쓰기 기능 수행
	// int : 게시물이 들어갓는지 나중에 리턴으로 갯수를 보기 위해서는 int 아니라 그냥 내용만 볼라면 void
	public int insertBoard(BoardVO vo) {
		
		int result = 0; // try 밖으로 해야 나중에 리턴반환 가능
		
		//board 테이블 insert
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection
					("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr", "hr");	
			/*1. vo.getWriter() 값이 member 테이블 memberid 존재하는지 여부 판단한다
			 * 1-1. 존재하면 board insert(구현 완료)
			 * 1-2. 존재 하지 않으면 회원가입부터 하세요라고 출력
			 * 
			 * rs.next();
			 * select memberid from member where memberid='kitri'
			 */
   // 멤버식별 메소드 라인 ==============================================================
			String selectSQL = "select memberid from member where memberid=?";
			PreparedStatement pt2 = conn.prepareStatement(selectSQL);
			pt2.setString(1, vo.getWriter());
			ResultSet rs = pt2.executeQuery();
			//rs.next(); //1개 레코드 검색 보장할때 쓴다
			if(!rs.next()) { // 1개의 레코드 그 이상일때 쓴다
				//존재하지 않으면
				System.out.println("회원가입 하세요.");
				return 0; //현재 메소드 0으로 리턴
			}
			else {
				//존재
			}
	// ====================================== MEMBER 식별 메소드 =====================		
			String insertSQL = 
					"insert into board values((select max(seq)+1 from board)"
					+ ",?,?,?,sysdate,?,0)";
			// 매번 입력해야 하는 명령이 아니라 그때그때 입력해서 더 쉽게 코딩이 가능하다 
			// 위의 저 물음표를 입력 파라미터값이라 한다. 이걸 설정하는 법은 아래와 같다
			PreparedStatement pt = conn.prepareStatement(insertSQL); //sql에 값 적용하고 준비해라
			pt.setString(1, vo.getTitle());
			pt.setString(2, vo.getContents());
			pt.setString(3, vo.getWriter());
			pt.setInt(4, vo.getPassword());
			
			//3. 실행 결과 검색
			result = pt.executeUpdate(); //전송 - 실행해라
			System.out.println(result + " 개의 행 삽입");
			
			//insert into board select * from aa;
		}catch(SQLException e) {
			e.printStackTrace();
			//System.out.println("회원가입부터 하세요.");
		}catch (ClassNotFoundException e) {
			System.out.println("드라이버 등록 확인하라.");
			// TODO: handle exception
		}

		return result;
	}

}
