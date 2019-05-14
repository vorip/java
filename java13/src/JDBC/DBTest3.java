package JDBC;

//import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;


public class DBTest3 {
	public static void main(String[] args) throws Exception {
//		1. 드라이버 설정
		Class.forName("com.mysql.jdbc.Driver");//www.naver.com->com.naver.www
		System.out.println("1. 드라이버 설정 OK....");

//		2. DB연결(DB명,id,pw)
		String url = "jdbc:mysql://localhost:3306/phone";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		//자동 import(컨트롤 쉬프트 O)
		System.out.println("2. DB연결 OK");
		
//		3. SQL결정
		String id = JOptionPane.showInputDialog("ID입력");
		String title = JOptionPane.showInputDialog("title입력");
		String price = JOptionPane.showInputDialog("price입력");
		String company = JOptionPane.showInputDialog("company입력");
		String sql = "insert into product values(?,?,?,?)";//?를 좌표로 취급
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1, id);//DB에서는1부터시작
		ps.setString(2, title);
		ps.setString(3, price);
		ps.setString(4, company);
		System.out.println("SQL문 결정 OK");
		
//		4. SQL 전송
		ps.executeUpdate();
		System.out.println("SQL문 전송 OK");
		id = JOptionPane.showInputDialog("ID입력");
		title = JOptionPane.showInputDialog("title입력");
		price = JOptionPane.showInputDialog("price입력");
		company = JOptionPane.showInputDialog("company입력");
		String sql2 = "insert into product values(?,?,?,?)";
		PreparedStatement ps2 = con.prepareStatement(sql2);
		
		ps.setString(1, id);//DB에서는1부터시작
		ps.setString(2, title);
		ps.setString(3, price);
		ps.setString(4, company);
		System.out.println("SQL문 결정 OK");
		
		//객체화
//		String url = "http://www.naver.com";
//		URL url2 = new URL(url);
		
//		4. SQL 전송
		ps.executeUpdate();
		System.out.println("SQL문 전송 OK");
		
		
	}
}
