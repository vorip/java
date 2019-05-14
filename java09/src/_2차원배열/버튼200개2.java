package _2차원배열;

import java.util.Random;

//import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 버튼200개2 {

	public static void main(String[] args) {
		JButton[] buttons = new JButton[100];
		for(int i = 0; i<buttons.length;i++) {
			buttons[i] = new JButton("나는 버튼"+(i+1));
		}
		Random r1 = new Random();
		JFrame f = new JFrame("100개버튼만들기");
//		FlowLayout flow = new FlowLayout();
		int x, y;
		f.setSize(1000,400);
		f.setLayout(null);//레이아웃 지정하지 않음.
		for(int i=0;i<buttons.length;i++) {
			f.add(buttons[i]);
			x = r1.nextInt(850);
			y = r1.nextInt(300);
			buttons[i].setBounds(x, y, 100, 50);	
		}
		
		
		
		f.setVisible(true);
	}
	

}
