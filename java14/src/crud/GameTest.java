package crud;

import javax.swing.JOptionPane;

public class GameTest {

	public static void main(String[] args) {
		GameTable gt = new GameTable();
		
		String name = JOptionPane.showInputDialog("name");
		String theme = JOptionPane.showInputDialog("theme");
		int price = Integer.parseInt(JOptionPane.showInputDialog("price"));
		int spec = Integer.parseInt(JOptionPane.showInputDialog("spec"));
		int rate = Integer.parseInt(JOptionPane.showInputDialog("rate"));
		
		try {
			gt.insert(name, theme, price, spec, rate);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String hang1 = JOptionPane.showInputDialog("바꿀 항목 : 이름, 장르, 가격, 사양, 평점");
		String value1 = JOptionPane.showInputDialog("바꿀 값");
		String value2 = JOptionPane.showInputDialog("바꿀 게임의 이름");
		
		try {
			gt.update(hang1, value1, value2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		//바뀔 값이 int형인 경우
//		String hang1 = JOptionPane.showInputDialog("바꿀 항목");
//		int value1 = JOptionPane.showInputDialog("바꿀 값");
//		String value2 = JOptionPane.showInputDialog("바꿀 게임의 이름");
//		
//		try {
//			gt.update(hang1, value1, value2);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		//delete시 삭제할 게임 이름 입력
		String value = JOptionPane.showInputDialog("삭제할 게임 이름");
		
		try {
			gt.delete(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
