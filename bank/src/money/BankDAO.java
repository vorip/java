package money;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class BankDAO {
	private String url = "jdbc:mysql://localhost:3306/bank";
	private String user = "root";
	private String password = "1234";
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	
	ArrayList<BankDTO> selectAll() {
		ArrayList<BankDTO> list = new ArrayList<BankDTO>();
		BankDTO dto = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection(url,user,password);
			
			String sql = "select * from member";
			ps = con.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				dto = new BankDTO();
				String id = rs.getString(1);
				String name = rs.getString(2);
				int age = rs.getInt(3);
				String tel = rs.getString(4);
				dto.setId(id);
				dto.setName(name);
				dto.setAge(age);
				dto.setTel(tel);
				
				list.add(dto);
			} 
		} catch (Exception e) {
			System.out.println("DB처리 에러");
		}finally {
			try {
				rs.close();
				ps.close();
				con.close();
			} catch (SQLException e) {
				System.out.println("자원해제에러");
			}
		}
		
		return list;
	}
	BankDTO select(String inputId)  {
		BankDTO dto = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection(url,user,password);
			
			String sql = "select * from member where id = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, inputId);

			rs = ps.executeQuery();

			if(rs.next()) {
				dto = new BankDTO();
				String id = rs.getString(1);
				String name = rs.getString(2);
				int age = rs.getInt(3);
				String tel = rs.getString(4);
				dto.setId(id);
				dto.setName(name);
				dto.setAge(age);
				dto.setTel(tel);
			}
			
		} catch (Exception e) {
			System.out.println("DB처리에러");
		}finally {
			try {
				rs.close();
				ps.close();
				con.close();
			} catch (SQLException e) {
				System.out.println("자원해제에러");
			}
		}
		return dto;
		
		
	}
	void insert(BankDTO dto) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url,user,password);
			
			String sql = "insert into member values(?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getName());
			ps.setInt(3, dto.getAge());
			ps.setString(4, dto.getTel());
			
			
			ps.executeUpdate();
		} catch (Exception e) {
			System.out.println("DB처리에러");
		}finally {
			try {
				ps.close();
				con.close();				
			}catch(SQLException e) {
				System.out.println("자원해제에러");
			}
		}
	}
	void update(String id, String tel) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url,user,password);
			
			String sql = "update member set tel=? where id=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, tel);
			ps.setString(2, id);
			
			ps.executeUpdate();
		} catch (Exception e) {
			System.out.println("DB처리 에러");
		}finally {
			try {
				ps.close();
				con.close();				
			}catch(SQLException e) {
				System.out.println("자원해제 에러");
			}
		}
	}
	void delete(String id) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url,user,password);
			
			String sql = "delete from member where id = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			
			
			ps.executeUpdate();
		} catch (Exception e) {
			System.out.println("DB처리 에러");
		}finally {
			try {
				ps.close();
				con.close();				
			}catch(SQLException e) {
				System.out.println("자원해제 에러");
			}
		}
	}
	
}


