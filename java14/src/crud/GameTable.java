package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class GameTable {
		Connection con;
		PreparedStatement ps;
		String url;
		String user;
		String password;
		
		
		
		//game의 필수항목 name theme price만을 입력값으로 받는 메소드 추가하기!!
		//3개+spec
		//3개+rate
		public void insert(String name,String theme,int price,int spec,int rate) throws Exception {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. 드라이버 설정 OK....");

			url = "jdbc:mysql://localhost:3306/steam";
			user = "root";
			password = "1234";
			con = DriverManager.getConnection(url, user, password);
			System.out.println("2. DB연결 OK");
			
			String sql = "insert into game values(?,?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, name); 
			ps.setString(2, theme);
			ps.setInt(3, price);
			ps.setInt(4, spec);
			ps.setInt(5, rate);
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
			case "이름" : hang1="gname";break;
			case "장르" : hang1="gtheme";break;
			default : 
			}
			String sql = "update game set "+hang1+"=? where gname =?";
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
			case "가격" : hang1="gprice";break;
			case "사양" : hang1="gspec";break;
			case "평점" : hang1="grate";break;
			default : 
			}
			String sql = "update game set "+hang1+"=? where gname =?";
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
			
			String sql = "delete from game where gname=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, value);
			System.out.println("3. SQL문 결정 OK");
			
			ps.executeUpdate();
			System.out.println("4. SQL문 전송 OK");
		}
}
