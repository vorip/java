package java15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class BbsDAO {
	
	String url = "jdbc:mysql://localhost:3306/bigdata";
	String user = "root";
	String password = "1234";
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	//CRUD
	//각각을 메소드로 만들어야 함
	//SQL문 select * from bbs where id = ?
	public BbsDTO select(String inputId)  {
		BbsDTO dto = null;
		try {
			//1. 드라이버 설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. 드라이버 설정 ok");
			//2. DB연결
			con = DriverManager.getConnection(url,user,password);
			System.out.println("2. DB 연결 ok");
			
			//3. SQL문 결정(객체화)
			String sql = "select * from bbs where id = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, inputId);
			System.out.println("3. SQL문 결정 ok");
			//4. SQL문 전송
			rs = ps.executeQuery();
			System.out.println("4. SQL문 전송 ok");
			//SQL문의 결과가 있으면, 받아서 처리
			if(rs.next()) {
				dto = new BbsDTO();
				String id = rs.getString(1);
				String title = rs.getString(2);
				String content = rs.getString(3);
				String etc = rs.getString(4);
				dto.setId(id);
				dto.setTitle(title);
				dto.setContent(content);
				dto.setEtc(etc);
			}else {
				System.out.println("검색결과가 없습니다.");
			}
		} catch (Exception e) {
			System.out.println("DB처리 중 에러 발생");
			System.out.println(e.getMessage());
		}finally {
			//에러 발생 여부와 상관없이 무조건 실행시켜야 하는 코드.
			try {
				rs.close();
				ps.close();
				con.close();
			} catch (SQLException e) {
				System.out.println("자원 해제 중 에러 발생");
			}
		}
		return dto;
		
		
	}
	public void insert(BbsDTO dto) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. 드라이버 설정 ok");
			
			con = DriverManager.getConnection(url,user,password);
			System.out.println("2. DB 연결 ok");
			
			String sql = "insert into bbs values(?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getTitle());
			ps.setString(3, dto.getContent());
			ps.setString(4, dto.getEtc());
			System.out.println("3. SQL문 결정 ok");
			
			ps.executeUpdate();
			System.out.println("4. SQL문 전송 ok");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public void update(BbsDTO dto) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. 드라이버 설정 ok");
			
			con = DriverManager.getConnection(url,user,password);
			System.out.println("2. DB 연결 ok");
			
			String sql = "update bbs set title=?,content=?,etc=? where id=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getTitle());
			ps.setString(2, dto.getContent());
			ps.setString(3, dto.getEtc());
			ps.setString(4, dto.getId());
			System.out.println("3. SQL문 결정 ok");
			
			ps.executeUpdate();
			System.out.println("4. SQL문 전송 ok");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void delete(String id) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. 드라이버 설정 ok");
			
			con = DriverManager.getConnection(url,user,password);
			System.out.println("2. DB 연결 ok");
			
			String sql = "delete from bbs where id = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			
			System.out.println("3. SQL문 결정 ok");
			
			ps.executeUpdate();
			System.out.println("4. SQL문 전송 ok");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}