package JDBC;

import javax.swing.JOptionPane;

public class 검색처리2 {

	public static void main(String[] args) {
		MemberDAO db = new MemberDAO();
		
		String id = JOptionPane.showInputDialog("아이디입력");
		try {
			String[] mem = db.select(id);
				JOptionPane.showMessageDialog(null, mem[0]
						+", "+mem[1]+", "+mem[2]+", "+mem[3]);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
