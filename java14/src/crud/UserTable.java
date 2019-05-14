package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UserTable {
	Connection con;
	PreparedStatement ps;
	String url;
	String user;
	String password;
	
	
	//일단은 notnull인 이름,id,pw만을 입력받아서 만드는 기본 insert메소드
	public void insertB(String name,String id,String pw) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 드라이버 설정 OK....");

		url = "jdbc:mysql://localhost:3306/steam";
		user = "root";
		password = "1234";
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 OK");
		String sql = "insert into user values(?,?,?,?,?,?,?)";
		ps = con.prepareStatement(sql);
		ps.setString(1, name); 
		ps.setString(2, id);
		ps.setString(3, pw);
		ps.setInt(4, 1);
		ps.setString(5, "default");
		ps.setInt(6, 1);
		ps.setString(7, "default");
		System.out.println("3. SQL문 결정 OK");
		
		ps.executeUpdate();
		System.out.println("4. SQL문 전송 OK");	
	}

	public void update(String hang1,String value1,String value2) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 드라이버 설정 OK....");

		url = "jdbc:mysql://localhost:3306/steam";
		user = "root";
		password = "1234";
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 OK");
		switch(hang1) {
		case "아이디" : hang1="uid";break;
		case "password" :
		case "비밀번호" : hang1="pw";break;
		case "이름" : hang1="uname";break;
		case "이메일" : hang1="uemail";break;
		case "관심분야" : hang1="utheme";break;
		default : 
		}
		String sql = "update user set "+hang1+"=? where  uid=?";
		ps = con.prepareStatement(sql);
		ps.setString(1, value1);
		ps.setString(2, value2);
		System.out.println("3. SQL문 결정 OK");
		
		ps.executeUpdate();
		System.out.println("4. SQL문 전송 OK");
		
	}
	public void update(String hang1,int value1,String value2) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 드라이버 설정 OK....");
		
		url = "jdbc:mysql://localhost:3306/steam";
		user = "root";
		password = "1234";
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 OK");
		switch(hang1) {
		case "현금" : hang1="ucash";break;
		case "사양" : hang1="uspec";break;
		default : 
		}
		String sql = "update user set "+hang1+"=? where  uid=?";
		ps = con.prepareStatement(sql);
		ps.setInt(1, value1);
		ps.setString(2, value2);
		System.out.println("3. SQL문 결정 OK");
		
		ps.executeUpdate();
		System.out.println("4. SQL문 전송 OK");
		
	}
	
	
	public void delete(String value) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 드라이버 설정 OK....");

		url = "jdbc:mysql://localhost:3306/steam";
		user = "root";
		password = "1234";
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 OK");
		
		String sql = "delete from user where uid=?";
		ps = con.prepareStatement(sql);
		ps.setString(1, value);
		System.out.println("3. SQL문 결정 OK");
		
		
		ps.executeUpdate();
		System.out.println("4. SQL문 전송 OK");
	}

}
