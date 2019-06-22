package bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ResaDAO {
	DBConnectionMgr mgr;
	ResultSet rs;
	Connection con;
	PreparedStatement ps;
	
	public ResaDAO() {
		mgr = DBConnectionMgr.getInstance();
	}
	public void insert(ResaDTO dto) {
		try {
			con = mgr.getConnection();
			
			String sql = "insert into resa values(?,?,?,?,?,?,?,default)";
			
			ps = con.prepareStatement(sql);
			
			ps.setString(1, dto.getName());
			ps.setString(2, dto.getHospital());
			ps.setString(3, dto.getAddress());
			ps.setString(4, dto.getBody());
			ps.setString(5, dto.getDoctor());
			ps.setString(6, dto.getDate());
			ps.setString(7, dto.getPrice());
			
			
			ps.executeUpdate();

			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				ps.close();
				mgr.freeConnection(con);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
