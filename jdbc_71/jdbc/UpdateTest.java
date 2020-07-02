package jdbc;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;

//데이터베이스와 연결
public class UpdateTest {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection
					("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr", "hr");
			//서버 IP:1521:설치했을때 이름, ㄱㅖ정
			System.out.println("db연결 성공");

			/*"insert into 테이블명"
			 *  + " values(?,? , ....)"
			 *  
			 *  update 테이블명
			 *  set 변경 컬럼명 = 변경값[, 변경컬럼명 = 변경값]
			 *  [where 변경조건식]
			 *  
			 *  delete 테이블명 [where 삭제 조건식]
			 *  ====> DML : 레코드 1개 대상으로 SQL
			 *  
			 *  DDL : CREATE TABLE : 테이블 1개를 대상
			 *  
			*/
			
			//102 게시판 내용 수정 해보겟다
			//==> board 테이블에서 102번 글의 내용을 게시판 수정내용, time 현재수정시각으로
			 
			//2-1. sql전송하는 과정
			/*String sql = "update board set contents = ?, time = sysdate "
					+ "where seq = ? ";
			PreparedStatement pt = conn.prepareStatement(sql);
			pt.setString(1, args[1]);
			pt.setInt(2, Integer.parseInt(args[0]));
			*/
			// ============================================ 2-1 =====================
			
			//2-2. 명령행 매개변수 2개 입력 예> 내용 수정
			//	게시물 내용이나 제목에 내용이 포함되었다면 수정으로 변경
			String sql = "update board "
					+ "set title=? , contents=? "
					+ "where lower(title) like '%' "
					+ "and lower(contents) like '%' "
					+ "and seq=? ";
			//============================================ 2-2 ======================
			
			// 위의 sql문장에서 ? 되어있는 부분들을 받아오고 args의 입력값으로 받아오는 과정
			PreparedStatement pt = conn.prepareStatement(sql);
			pt.setString(1, args[0]);
			pt.setString(2, args[1]);
			pt.setInt(3, Integer.parseInt(args[2]));
			
			//3.전송 sql 실행 - 결과 리턴
			int rows = pt.executeUpdate(); // 저장, 변경, 삭제행 갯수를 표현하기 위해 선언 사용
			System.out.println(rows + " 개의 행 변경.");
			
			/* 연결 해제
			 * conn.close();
			 * System.out.println("db 연결해제 성공")
			 */
		}catch(SQLException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			System.out.println("드라이버 등록 확인하라.");
			// TODO: handle exception
		}
	}

}
