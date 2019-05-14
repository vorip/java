package control;

import javax.swing.JOptionPane;

public class Test1 {
	public static void main(String[] args) {
		
		String lFood = JOptionPane.showInputDialog("먹고 싶은 음식 입력하기");
		String hFood = JOptionPane.showInputDialog("먹기 싫은 음식 입력하기");
		
		System.out.printf("내가 먹고 싶은 음식은 %s 이고 먹기 싫은 음식은 %s이다.",lFood,hFood);
		JOptionPane.showMessageDialog(null,"내가 먹고 싶은 음식은 "+lFood+"이고 먹기 싫은 음식은 "+hFood+"이다." );
		
		
	}
}
