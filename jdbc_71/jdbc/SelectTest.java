package jdbc;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.spi.DirStateFactory.Result;

import java.sql.Connection;

//데이터베이스와 연결
public class SelectTest {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection
					("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr", "hr");
			//서버 IP:1521:설치했을때 이름, ㄱㅖ정
			System.out.println("db연결 성공");

			// count 써보는 조회
	/*		String sql = "select count(*) cnt from board";
			rs.next(); 
			System.out.println(rs.getInt("cnt")); // rs.getInt("count(*)") 와 같은 의미다	
	*/
		
			//3. ?는 비교연산자에서만 사용 가능하다 where같은 아래는 그 예제이다.
	/*		String sql = "select * from board where title like ?";
			PreparedStatement pt = conn.prepareStatement(sql);
			pt.setString(1, "%오호%"); //String --> jdbc driver --> varchar2 로 변환--> 그래서 ? >> '' 안붙여도 된다.
	*/
			
			//select * from board; 조회하기 ============================================
			//1.			
			String sql = "select * from board where title like ?";
			PreparedStatement pt = conn.prepareStatement(sql);
			pt.setString(1, "%오호%"); //String --> jdbc driver --> varchar2 로 변환--> 그래서 ? >> '' 안붙여도 된다.
			
			ResultSet rs = pt.executeQuery();
			//rs 첫번째 레코드 이전 참조 위치 세팅
		
			while(rs.next()) {
				int seq = rs.getInt("seq"); //1번 컬럼의 이름
				String title = rs.getString("title");
				String contents = rs.getString("contents");
				String writer = rs.getString("writer");
				String time = rs.getString("time");
				int password = rs.getInt("password");
				int viewcount = rs.getInt(7);
				System.out.println(seq + " : " + title + " : " + contents + " : " + writer + " : " 
						+ time + " : " + password + " : " + viewcount);
			}
			//========================================= 2-3 ==========================
			
			
			/* 연결 해제
			 * rs.close();
			 * pt.close();
		
			 * conn.close();
			 * System.out.println("db 연결해제 성공");
			 * conn만 끊어도 되지만 베스트는 위의 세개를 다 쓰는 것이다.
			 */
		}catch(SQLException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			System.out.println("드라이버 등록 확인하라.");
		}
	}

}
