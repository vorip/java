package JDBC;

import javax.swing.JOptionPane;

public class 검색처리 {

	public static void main(String[] args) {
		MemberDAO db = new MemberDAO();
		
		String id = JOptionPane.showInputDialog("아이디입력");
		try {
			String[] mem = db.select(id);
			for (String s : mem) {
				System.out.println(s);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
