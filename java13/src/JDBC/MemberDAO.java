package JDBC;

//import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class MemberDAO {
	//멤버변수
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	String url;
	String user;
	String password;
	
	

	public String[] select(String id) throws Exception {
//		1. 드라이버 설정
		Class.forName("com.mysql.jdbc.Driver");//www.naver.com->com.naver.www
		System.out.println("1. 드라이버 설정 OK....");

//		2. DB연결(DB명,id,pw)
		url = "jdbc:mysql://localhost:3306/bigdata";
		user = "root";
		password = "1234";
		con = DriverManager.getConnection(url, user, password);
		//자동 import(컨트롤 쉬프트 O)
		System.out.println("2. DB연결 OK");
		
//		3. SQL결정
		String sql = "select * from member where id = ?";
		ps = con.prepareStatement(sql);
		ps.setString(1, id);//setString()메소드는 값을 전달할 때 
//		그 값이 String이기 때문에 setString인 것. 항목의 이름을 전달 할 때 이 메소드를 사용할 수 없음.
		System.out.println("3. SQL문 결정 OK");
		
		//객체화
//		String url = "http://www.naver.com";
//		URL url2 = new URL(url);
		
//		4. SQL 전송
		rs = ps.executeQuery();//결과값 받아오기
		System.out.println("4. SQL문 전송 OK");		
		String[] mem = null;
		if(rs.next()) {//rs.next() : 레코드가 있으면 true 없으면 false 반환
			String s1 = rs.getString(1);//id
			String s2 = rs.getString(2);//pw
			String s3 = rs.getString(3);//name
			String s4 = rs.getString(4);//tel
//			System.out.println("검색된 ID : "+s1);
//			System.out.println("검색된 pw : "+s2);
//			System.out.println("검색된 name : "+s3);
//			System.out.println("검색된 tel : "+s4);
			mem = new String[4];
			mem[0] = s1;
			mem[1] = s2;
			mem[2] = s3;
			mem[3] = s4;
			
		}else {
			System.out.println("검색 결과가 없음");
		}
		return mem;
	}
	
	
	//멤버메소드
	public void insert(MemberDTO dto) throws Exception {
//		1. 드라이버 설정
		Class.forName("com.mysql.jdbc.Driver");//www.naver.com->com.naver.www
		System.out.println("1. 드라이버 설정 OK....");

//		2. DB연결(DB명,id,pw)
		url = "jdbc:mysql://localhost:3306/bigdata";
		user = "root";
		password = "1234";
		con = DriverManager.getConnection(url, user, password);
		//자동 import(컨트롤 쉬프트 O)
		System.out.println("2. DB연결 OK");
		
//		3. SQL결정
		String sql = "insert into member values(?,?,?,?)";
		ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());//setString()메소드는 값을 전달할 때 
//		그 값이 String이기 때문에 setString인 것. 항목의 이름을 전달 할 때 이 메소드를 사용할 수 없음.
		ps.setString(2, dto.getPw());
		ps.setString(3, dto.getName());
		ps.setString(4, dto.getTel());
		System.out.println("3. SQL문 결정 OK");
		
		//객체화
//		String url = "http://www.naver.com";
//		URL url2 = new URL(url);
		
//		4. SQL 전송
		ps.executeUpdate();
		System.out.println("4. SQL문 전송 OK");		
	}
	public void update(String hang1,String value1, String hang2,String value2) throws Exception {
//		update [테이블명] set [항목]=[변경값] where [항복]=[변경될값];
//		1. 드라이버 설정
		Class.forName("com.mysql.jdbc.Driver");//www.naver.com->com.naver.www
		System.out.println("1. 드라이버 설정 OK....");

//		2. DB연결(DB명,id,pw)
		url = "jdbc:mysql://localhost:3306/bigdata";
		user = "root";
		password = "1234";
		con = DriverManager.getConnection(url, user, password);
		//자동 import(컨트롤 쉬프트 O)
		System.out.println("2. DB연결 OK");
		
//		3. SQL결정
		String sql = "update member set "+hang1+"=? where "+hang2+"=?";
		ps = con.prepareStatement(sql);
		ps.setString(1, value1);
		ps.setString(2, value2);
		System.out.println("3. SQL문 결정 OK");
		
		//객체화
//		String url = "http://www.naver.com";
//		URL url2 = new URL(url);
		
//		4. SQL 전송
		ps.executeUpdate();
		System.out.println("4. SQL문 전송 OK");
		
	}
	public void delete(String value) throws Exception {
//		delete from [테이블명] where [항목]=[값];
//		1. 드라이버 설정
		Class.forName("com.mysql.jdbc.Driver");//www.naver.com->com.naver.www
		System.out.println("1. 드라이버 설정 OK....");

//		2. DB연결(DB명,id,pw)
		url = "jdbc:mysql://localhost:3306/bigdata";
		user = "root";
		password = "1234";
		con = DriverManager.getConnection(url, user, password);
		//자동 import(컨트롤 쉬프트 O)
		System.out.println("2. DB연결 OK");
		
//		3. SQL결정
		String sql = "delete from member where id=?";
		ps = con.prepareStatement(sql);
		ps.setString(1, value);
		System.out.println("3. SQL문 결정 OK");
		
		//객체화
//		String url = "http://www.naver.com";
//		URL url2 = new URL(url);
		
//		4. SQL 전송
		ps.executeUpdate();
		System.out.println("4. SQL문 전송 OK");
	}
}
