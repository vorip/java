package _2차원배열;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 버튼100개 {

	public static void main(String[] args) {
		//버튼 들어갈 자리 100개를 만들어 둠.
		JButton[] buttons = new JButton[100];
		for(int i = 0; i<buttons.length;i++) {
			buttons[i] = new JButton("나는 버튼");
		}
		JFrame f = new JFrame("100개버튼만들기");
		FlowLayout flow = new FlowLayout();
		
		f.setSize(1000,400);
		f.setLayout(flow);
		for(int i=0;i<buttons.length;i++) {
			f.add(buttons[i]);
		}
		
		
		
		f.setVisible(true);
	}

}
