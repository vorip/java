package control;

import javax.swing.JOptionPane;

public class 다이얼로그테스트 {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,"내가 바로 다이얼로그예요.");
		String name = JOptionPane.showInputDialog("당신의 이름을 입력하세요");
		
		System.out.printf("당신의 이름은 : %s",name);
		String age = JOptionPane.showInputDialog("당신의 나이을 입력하세요");
		int data = Integer.parseInt(age);
		JOptionPane.showMessageDialog(null,"내년 내 나이는" + (data + 1) + "입니다.");
	
	
	}

}
