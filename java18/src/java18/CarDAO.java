package java18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CarDAO {
	String url = "jdbc:mysql://localhost:3306/car";
	String user = "root";
	String password = "1234";
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	public ArrayList selectAll() {
		ArrayList list = new ArrayList();
		CarDTO dto = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection(url,user,password);
			
			String sql = "select * from carsale";
			ps = con.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				dto = new CarDTO();
				String id = rs.getString(1);
				String name = rs.getString(2);
				String content = rs.getString(3);
				String price = rs.getString(4);
				
				dto.setId(id);
				dto.setName(name);
				dto.setContent(content);
				dto.setPrice(price);
				
				
				list.add(dto);
			} 
		} catch (Exception e) {
			System.out.println("DB처리 중 에러");
			System.out.println(e.getMessage());
		}finally {
			try {
				rs.close();
				ps.close();
				con.close();
			} catch (SQLException e) {
				System.out.println("자원 해제 중 에러 발생");
			}
		}
		
		return list;
	}
	public CarDTO select(String inputId)  {
		CarDTO dto = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection(url,user,password);
			
			String sql = "select * from carsale where id = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, inputId);

			rs = ps.executeQuery();

			if(rs.next()) {
				dto = new CarDTO();
				String id = rs.getString(1);
				String name = rs.getString(2);
				String content = rs.getString(3);
				String price = rs.getString(4);

				dto.setId(id);
				dto.setName(name);
				dto.setContent(content);
				dto.setPrice(price);
				
				
			}else {
				System.out.println("검색결과가 없습니다.");
			}
		} catch (Exception e) {
			System.out.println("DB처리 중 에러");
			System.out.println(e.getMessage());
		}finally {
			try {
				rs.close();
				ps.close();
				con.close();
			} catch (SQLException e) {
				System.out.println("자원 해제 중 에러");
			}
		}
		return dto;
		
		
	}
	public void insert(CarDTO dto) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url,user,password);
			
			
			String sql = "insert into carsale values(?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getName());
			ps.setString(3, dto.getContent());
			ps.setString(4, dto.getPrice());
			
			ps.executeUpdate();
		} catch (Exception e) {
			System.out.println("DB처리 중 에러");
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				con.close();				
			}catch(SQLException e) {
				System.out.println("자원 해제 중 에러");
			}
		}
		
	}
	public void update(String id, String price) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url,user,password);
			
			String sql = "update carsale set price=? where id=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, price);
			ps.setString(2, id);
			
			ps.executeUpdate();
		} catch (Exception e) {
			System.out.println("DB처리 중 에러 발생");
			e.printStackTrace();
		}finally {
			try {
				ps.close();
				con.close();				
			}catch(SQLException e) {
				System.out.println("자원 해제 중 에러 발생");
			}
		}
	}
	public void delete(String inputId) {
		CarDTO dto = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection(url,user,password);
			
			String sql = "select * from carsale where id = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, inputId);

			rs = ps.executeQuery();

			if(rs.next()) {
				sql = "delete from carsale where id = ?";
				ps = con.prepareStatement(sql);
				ps.setString(1, inputId);
				
				
				ps.executeUpdate();
				System.out.println("판매가 완료되었습니다.");
			}else {
				System.out.println("존재하지 않는 차량입니다.");
			}
		} catch (Exception e) {
			System.out.println("DB처리 중 에러");
			System.out.println(e.getMessage());
		}finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				System.out.println("자원 해제 중 에러");
			}
		}
		
	}
}
