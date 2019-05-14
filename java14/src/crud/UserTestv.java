package crud;

import javax.swing.JOptionPane;

public class UserTestv {
	public static void main(String[] args) {
		UserTable ut = new UserTable();
		
		String name = JOptionPane.showInputDialog("이름");
		String id = JOptionPane.showInputDialog("아이디");
		String pw = JOptionPane.showInputDialog("pw");
		
		try {
			ut.insertB(name, id, pw);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String hang1 = JOptionPane.showInputDialog("바꿀 항목 : 아이디,비밀번호,이름,이메일,관심분야,현금,사양");
		String value1 = JOptionPane.showInputDialog("바꿀값");
		String value2 = JOptionPane.showInputDialog("아이디");
		
		try {
			ut.update(hang1, value1, value2);
		} catch (Exception e) {
			e.printStackTrace();
		}
//		String hang1 = JOptionPane.showInputDialog("바꿀 항목 : 아이디,비밀번호,이름,이메일,관심분야,현금,사양");
//		int value1 = JOptionPane.showInputDialog("바꿀값");
//		String value2 = JOptionPane.showInputDialog("아이디");
//		
//		try {
//			ut.update(hang1, value1, value2);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		String value = JOptionPane.showInputDialog("삭제할 아이디");
		try {
			ut.delete(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
