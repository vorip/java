package JDBC;

//import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class DBTest {
	public static void main(String[] args) throws Exception {
//		1. 드라이버 설정
		Class.forName("com.mysql.jdbc.Driver");//www.naver.com->com.naver.www
		System.out.println("1. 드라이버 설정 OK....");

//		2. DB연결(DB명,id,pw)
		String url = "jdbc:mysql://localhost:3306/bigdata";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		//자동 import(컨트롤 쉬프트 O)
		System.out.println("2. DB연결 OK");
		
//		3. SQL결정
		String sql = "insert into member values('choi','choi','choi','choi')";
		PreparedStatement ps = con.prepareStatement(sql);
		System.out.println("3. SQL문 결정 OK");
		
		//객체화
//		String url = "http://www.naver.com";
//		URL url2 = new URL(url);
		
//		4. SQL 전송
		ps.executeUpdate();
		System.out.println("4. SQL문 전송 OK");
		
		
	}
}
