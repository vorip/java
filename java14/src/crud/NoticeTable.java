package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class NoticeTable {
	
	Connection con;
	PreparedStatement ps;
	String url;
	String user;
	String password;
	static int num =1;
	
	
	public void insert(String title,String contents,String time) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 드라이버 설정 OK....");

		url = "jdbc:mysql://localhost:3306/steam";
		user = "root";
		password = "1234";
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 OK");
		
		String sql = "insert into notice values(?,?,?,"+num+")";
		ps = con.prepareStatement(sql);
		ps.setString(1, title);//setString()메소드는 값을 전달할 때 
		ps.setString(2, contents);
		ps.setString(3, time);
		System.out.println("3. SQL문 결정 OK");
		
		ps.executeUpdate();
		System.out.println("4. SQL문 전송 OK");	
		num++;
	}
	//원래는 글번호로 찾을것.
	public void update(String hang1,String value1,String value2) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 드라이버 설정 OK....");

		url = "jdbc:mysql://localhost:3306/steam";
		user = "root";
		password = "1234";
		con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 OK");
		switch(hang1) {
		case "제목" : hang1="title";break;
		case "내용" : hang1="contents";break;
		case "시간" : hang1="time";break;
		default : 
		}
		String sql = "update notice set "+hang1+"=? where  title=?";
		ps = con.prepareStatement(sql);
		ps.setString(1, value1);
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
		
		String sql = "delete from notice where title=?";
		ps = con.prepareStatement(sql);
		ps.setString(1, value);
		System.out.println("3. SQL문 결정 OK");
		
		ps.executeUpdate();
		System.out.println("4. SQL문 전송 OK");
	}

}
