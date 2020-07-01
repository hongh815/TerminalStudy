package jdbc;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;

//데이터베이스와 연결
public class ConnectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 1.오라클 드라이버 등록
		 * 자바 - 자바 드라이버 등록
		 * 2. 데이터베이스 등록
		 * 3. 디비 연결 해제
		 * ojdbc6.jar = 자바클래스들
		 */
		
		//101 자바제목2 자바내용2 kitri 2222
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection
					("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr", "hr");
			//서버 IP:1521:설치했을때 이름, ㄱㅖ정
			System.out.println("db연결 성공");
			
			//conn.close(); -  연결해제
			//1-제목1-내용1-작성자1 1111
			//board 테이블 : seq title contents writer password 저장
			//time : 현재시각
			//viewcount : 0
			
			/*insert into 테이블명(컬럼,,,) values(값) ->(세미콜론 넣지않는다.)*/
			
			//2. sql 생성 - 저장
/*			String insertSQL = "insert into board values(100, '제목1', '내용1', 'id5', sysdate, 1111, 0)";
 기본적인 sql 정보 입력 방법*/		
			String insertSQL = 
					"insert into board values(?,?,?,?,sysdate,?,0)";
			// 매번 입력해야 하는 명령이 아니라 그때그때 입력해서 더 쉽게 코딩이 가능하다 
			// 위의 저 물음표를 입력 파라미터값이라 한다. 이걸 설정하는 법은 아래와 같다
			PreparedStatement pt = conn.prepareStatement(insertSQL); //sql에 값 적용하고 준비해라
			pt.setInt(1, Integer.parseInt(args[0]));
			pt.setString(2, args[1]);
			pt.setString(3, args[2]);
			pt.setString(4, args[3]);
			pt.setInt(5, Integer.parseInt(args[4]));
			
			
			//3. 실행 결과 검색
			int cnt = pt.executeUpdate(); //전송 - 실행해라
			System.out.println(cnt + " 개의 행 삽입");
			
			//insert into board select * from aa;
		}catch(SQLException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			System.out.println("드라이버 등록 확인하라.");
			// TODO: handle exception
		}
	}

}
