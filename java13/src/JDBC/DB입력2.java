package JDBC;


import javax.swing.JOptionPane;

public class DB입력2 {

	public static void main(String[] args) {
		MemberDAO db = new MemberDAO();
		String id = JOptionPane.showInputDialog("ID입력");
		String pw = JOptionPane.showInputDialog("pw입력");
		String name = JOptionPane.showInputDialog("name입력");
		String tel = JOptionPane.showInputDialog("tel입력");
		
		MemberDTO dto = new MemberDTO();
		dto.setId(id);
		dto.setPw(pw);
		dto.setName(name);
		dto.setTel(tel);

		try {
			db.insert(dto);
		} catch (Exception e) {
			System.out.println("에러발생");
			e.printStackTrace();
		}
		
		
		String hang1 = JOptionPane.showInputDialog("변경될 항목 입력");
		String value1 = JOptionPane.showInputDialog("변경될 값 입력");
		String hang2 = JOptionPane.showInputDialog("기준 항목 입력");
		String value2 = JOptionPane.showInputDialog("기준 값 입력");
		
		try {
			db.update(hang1, value1, hang2, value2);
		} catch (Exception e) {
			System.out.println("잘 못 입력하셨습니다.");
			e.printStackTrace();
		}
		
//		String value = JOptionPane.showInputDialog("삭제할 id 입력");
//		
//		try {
//			db.delete(value);
//		} catch (Exception e) {
//			System.out.println("존재하지 않는 아이디입니다.");
//			e.printStackTrace();
//		}
		
	}

}
