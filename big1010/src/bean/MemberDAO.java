package bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDAO {
	DBConnectionMgr mgr;

	public MemberDAO() {
		mgr = DBConnectionMgr.getInstance();
	}

	public void insert(MemberDTO dto) {
		try {
			Connection con = mgr.getConnection();
			con = mgr.getConnection();
			String sql = "insert into member values(?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getPw());
			ps.setString(3, dto.getName());
			ps.setString(4, dto.getTel());

			ps.executeUpdate();
		} catch (Exception e) {
			System.out.println("insert 에러");
		}

	}
	public MemberDTO select(String inputId) {
		MemberDTO dto=null;
		try {
			Connection con = mgr.getConnection();
			con = mgr.getConnection();
			String sql = "select * from member where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, inputId);

			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				dto = new MemberDTO();
				
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				String tel = rs.getString(4);
				
				dto.setId(id);
				dto.setPw(pw);
				dto.setName(name);
				dto.setTel(tel);
				System.out.println(dto.getTel());
			}
		} catch (Exception e) {
			System.out.println("select 에러");
		}
		return dto;
	}
	public void update(MemberDTO dto) {
		try {
			Connection con = mgr.getConnection();
			con = mgr.getConnection();
			String sql = "update member set pw=?,name=?,tel=? where id =?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, dto.getPw());
			ps.setString(2, dto.getName());
			ps.setString(3, dto.getTel());
			ps.setString(4, dto.getId());

			ps.executeUpdate();
		} catch (Exception e) {
			System.out.println("update 에러");
		}

	}
}
