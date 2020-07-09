package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import vo.MemberVO;

public class MemberDAO {
	String driver, url, account, password;

	public MemberDAO() { }
	public MemberDAO(String driver, String url, String account, String password) {
		super();
		this.driver = driver;
		this.url = url;
		this.account = account;
		this.password = password;
	}
	
	public void insertMember(MemberVO vo) {
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, account, password);
			PreparedStatement pt = conn.prepareStatement
					("insert into member values(?,?,?,?,?,?,?)");
			pt.setString(1, vo.getId());
			pt.setString(2, vo.getPassword());
			pt.setString(3, vo.getName());
			pt.setString(4, vo.getEmail());
			pt.setString(5, vo.getPhone());
			pt.setString(6, vo.getGender());
			pt.setString(7, vo.getAddress());
			
			pt.executeUpdate();
			pt.close();
			conn.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
