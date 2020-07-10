package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vo.*;

public class BoardDAO { /// 이거 확인해서 수정
	
	/*
	 * 5. checkPassword
	 * 6. deleteBoard
	 * 7. updateBoard
	 * 
	 */
	
	//5. checkPassword 만들기 ==============================
	public boolean checkPassword(int seq, int password) {
		boolean result = false;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "system", "system");
			//System.out.println("db 연결 성공");
			
			String passwordinput = "select * from board where seq = ? and password = ?"; 
			PreparedStatement pt = conn.prepareStatement(passwordinput);
			pt.setInt(1, seq);
			pt.setInt(2, password);
			ResultSet rs = pt.executeQuery();
			//rs.next();
			if(!rs.next()) {
				System.out.println("암호를 잘못 입력하셨습니다.");
			}
			else {
				//pt.executeUpdate();
			}
			
			conn.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;	
	}
	//==============================================password=================================================

	//5. deletBoard 만들기 ================================
	public void deleteBoard(int seq) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "system", "system");
			//System.out.println("db 연결 성공");
			
			String deleteseq = "delete from board where seq = ?"; 
			PreparedStatement pt = conn.prepareStatement(deleteseq);
			pt.setInt(1, seq);
			ResultSet rs = pt.executeQuery();
			
			if(!rs.next()) {
				System.out.println("입력하신 번호가 없습니다.");
			}
			
			conn.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
			
	}
	//==============================================delete=================================================

	//5. updateBoard 만들기 ============================
	
	public ArrayList<boardVO> updateBoard(int seq, String column, String value) {
		
		ArrayList<boardVO> columnlist = new ArrayList<boardVO>();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "system", "system");
			
			String columntitle = "update board set title = ? where ? like %제목% ";   // title, contents
			String columncontents = "update board set contents = ? where ? like %내용% ";
			String columnall = "update board set title = ? , contents = ? where ? like %*% ";
			PreparedStatement ptt = conn.prepareStatement(columntitle);
			PreparedStatement ptc = conn.prepareStatement(columncontents);
			PreparedStatement pta = conn.prepareStatement(columnall);			
			ptt.setString(1, value);
			ptt.setString(2, column);
			ptc.setString(1, value);
			ptc.setString(2, column);
			pta.setString(1, value);
			pta.setString(2, value);
			pta.setString(3, column);
			
			ResultSet rst = ptt.executeQuery();
			ResultSet rsc = ptc.executeQuery();
			ResultSet rsa = pta.executeQuery();
			
			if(column.equals("제목")) {
				while(rst.next()) {
					boardVO votitle = new boardVO(rst.getString("title"));
					columnlist.add(votitle);
				}
			}//rst
			else if(column.equals("내용")) {
				while(rsc.next()) {
					boardVO vocontents = new boardVO(rst.getString("contents"));
					columnlist.add(vocontents);
				}
			}//rsc
			else if(column.equals("*")) {
				while(rsa.next()) {
					boardVO voall = new boardVO(rsa.getString("title"), rsa.getString("contents"));
					columnlist.add(voall);
					
				}
			}//rsa
			
			conn.close();
			
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		} //try
		
		
		return columnlist;
	}
	//==============================================update=================================================
	
	//4. 1개의 게시물 조회 (insert into ~ viewcount = 3)
	public boardVO getDetailBoard(int seq) {
		boardVO vo = new boardVO();
		//3-1. viewcount 를 1개 증가 sql update sql
		//3-2. 조회한 sql select sql 리턴
		int resultview = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "system", "system");
			//System.out.println("db 연결 성공");
			
			String updatesql = "update board set viewcount = viewcount + 1 where seq = ?";
			String selectsql = "select * from board where seq = ?";
			PreparedStatement pt = conn.prepareStatement(updatesql);
			pt.setInt(1, seq);
			int t = pt.executeUpdate();
			System.out.println("업뎃 확인 : " +t);
			// 업뎃 sql 이 종료된다면 아래처럼 pt를 또 써도된다.
			
			pt = conn.prepareStatement(selectsql);
			pt.setInt(1, seq);
			ResultSet rs = pt.executeQuery();
			
			//seq 레코드는 1개 출력되도록. 또는 없도록
			if(!rs.next()) {
				vo = new boardVO(rs.getInt("seq"),
						rs.getString("title"),
						rs.getString("contents"),
						rs.getString("writer"),
						rs.getString("time"),
						rs.getInt("password"),
						rs.getInt("viewcount"));
			}
			else {
				
			}
			
			conn.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return vo;
	}

	
	//3. 전체 게시물 갯수 조회
	 public int getBoardCount(){
	 {
		 int resultcount = 0;
		 
		try {
			//0.오라클 드라이버 등록
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "system", "system");
			//System.out.println("db 연결 성공");
			
			String sql = "select count(*) from board";
			PreparedStatement pt = conn.prepareStatement(sql);
			ResultSet rs = pt.executeQuery();
			rs.next();
			resultcount = rs.getInt("count(*)");
			conn.close();

		}

			catch(SQLException e) {
				e.printStackTrace();
			}
			
			catch(ClassNotFoundException e) {
				System.out.println("드라이버 등록");
			}
	
		return resultcount;
}
}
		
	public int insertBoard(boardVO vo){ // 게시물 글쓰기
		//board 테이블 insert
		int result = 0;
		
		try {
			//0.오라클 드라이버 등록
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "system", "system");
			//System.out.println("db 연결 성공");
			
			String selectSQL = "select memberid from member where memberid = ?";//결과 안나왔을때 행이동 하면 false 나올꺼다.
			PreparedStatement pt2 = conn.prepareStatement(selectSQL);
			pt2.setString(1, vo.getWriter());
			ResultSet rs = pt2.executeQuery();
			rs.next();
			
			if(!rs.next()) {//존재하지 않으면
				System.out.println("회원가입 ㄱㄱ");
			}		
		
			
			String insertSQL = "insert into board values((select max(seq) + 1 from board), ?, ?, ?, sysdate, ?, 0)";//세미콜론 없ㅇ다. // 오라클 함수 보내주는 것
			PreparedStatement pt = conn.prepareStatement(insertSQL);//준비하고 기달려.
			
			//작성자 맴버 테이블에 존재해야만이 글을 쓸 수 있다.
			//존재하면 그대로 사용
			//존재 않으면 회원가입하라고 출력시키기.
			
			//입력 파라미터값 설정
			pt.setString(1, vo.getTitle());
			pt.setString(2, vo.getContents());
			pt.setString(3, vo.getWriter());
			pt.setInt(4, vo.getPassword());
			
			result = pt.executeUpdate(); // 전송 실행.
			System.out.println(result + " 개의 행 삽입");
			conn.close();

		}

			catch(SQLException e) {
				e.printStackTrace();
			}
			
			catch(ClassNotFoundException e) {
				System.out.println("드라이버 등록");
			}
		
		return result;
			
		}
	
	
	public ArrayList<boardVO> getBoardList(int currentpage, int boardcount){ // 게시물 리스트 조회
	
	//	this.currentpage = currentpage;
	//	this.boardcount = boardcount;
		
		ArrayList<boardVO> resultlist = new ArrayList<boardVO>();


		
		try {
			

			//0.오라클 드라이버 등록
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "system", "system");
			//System.out.println("db 연결 성공");
			
			String sql = "select from seq, title, time (select rowum r, seq, title, time from(select * from board order by time desc)) where r >= ? and r <= ?";
			
			PreparedStatement pt = conn.prepareStatement(sql);
			
			int first = (currentpage-1)*boardcount + 1;
			int second = currentpage*boardcount;
			
			System.out.println(first + ":" + second);
			
			pt.setInt(1,first); // 입력 받아서 ㅇㅇ
			pt.setInt(2,second); //
			
			ResultSet rs = pt.executeQuery();
			
			 while(rs.next()) {
				 boardVO vo = new boardVO(rs.getInt("seq"), rs.getString("title"), rs.getString("time"));
			     
				 /*vo.setSeq(rs.getInt("seq"));
				  vo.setTitle(rs.getString("title")); 
				  vo.setTime(rs.getString("time"));*/ 
				  resultlist.add(vo);
			 }
			//데이처 조회를 위한 반복 rs 에 5개 레코드 들을 조회해서 - Baoard VO 객체 생성해서  resultlist 에 저장
			conn.close();

		}

			catch(SQLException e) {
				e.printStackTrace();
			}
			
			catch(ClassNotFoundException e) {
				System.out.println("드라이버 등록");
			}
		
		return resultlist;
			
		}//getBoardList
		
	}

		
	
	

	

