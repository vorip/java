package bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BbsDAO {
	DBConnectionMgr mgr;

	public BbsDAO() {
		mgr = DBConnectionMgr.getInstance();
	}

	public void insert(BbsDTO dto) {
		try {
			Connection con = mgr.getConnection();
			con = mgr.getConnection();
			String sql = "insert into bbs values(?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getTitle());
			ps.setString(3, dto.getContent());
			ps.setString(4, dto.getEtc());

			ps.executeUpdate();
		} catch (Exception e) {
			System.out.println("insert 에러");
		}

	}

	public BbsDTO select(String inputId) {
		BbsDTO dto = null;
		try {
			Connection con = mgr.getConnection();
			con = mgr.getConnection();
			String sql = "select * from bbs where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, inputId);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				dto = new BbsDTO();

				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				String tel = rs.getString(4);

				dto.setId(id);
				dto.setTitle(pw);
				dto.setContent(name);
				dto.setEtc(tel);
			}
		} catch (Exception e) {
			System.out.println("select 에러");
		}
		return dto;
	}

	public void update(BbsDTO dto) {
		try {
			Connection con = mgr.getConnection();
			con = mgr.getConnection();
			String sql = "update bbs set title=?,content=?,etc=? where id =?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, dto.getTitle());
			ps.setString(2, dto.getContent());
			ps.setString(3, dto.getEtc());
			ps.setString(4, dto.getId());

			ps.executeUpdate();
		} catch (Exception e) {
			System.out.println("update 에러");
		}

	}

	public void delete(String id) {
		try {
			Connection con = mgr.getConnection();
			con = mgr.getConnection();
			String sql = "delete from bbs where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);

			ps.executeUpdate();
		} catch (Exception e) {
			System.out.println("delete 에러");
		}

	}
}
