package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import vo.MemberVO;

public class MemberDAO {
	public String selectMember(String id, String pw) throws Exception{
		String result = "";
		Class.forName("driver");
		Connection conn = 
				DriverManager.getConnection("url", "account", "password");
		PreparedStatement pt = conn.prepareStatement
				("select memberid, pasword from member where memberid=?");
		pt.setString(1, id);
		ResultSet rs = pt.executeQuery();
		
		
		//member 테이블 : memberid 컬럼 : pk
		if(rs.next()) {
			if(rs.getString("password").equals(pw)) {
				//암호 일치하는 지
				result = "<h1> 정상 로그인 시발것 </h1>";
			} else {
				result = "<a href='insertform.jsp'> 회원가입화면 이동 </a>";
			}
			
		} else { //암호 불일치
			result = "<a href='insertform.jsp'> 회원가입화면 이동 </a>";
		}
		conn.close();
		return result;
	}

}
