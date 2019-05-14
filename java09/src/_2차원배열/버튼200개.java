package _2차원배열;

//import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 버튼200개 {

	public static void main(String[] args) {
		JButton[] buttons = new JButton[100];
		for(int i = 0; i<buttons.length;i++) {
			buttons[i] = new JButton("나는 버튼"+(i+1));
		}
		
		JFrame f = new JFrame("100개버튼만들기");
//		FlowLayout flow = new FlowLayout();
		int x=50,y=50,ga=100,se=50;
		f.setSize(1000,400);
		f.setLayout(null);//레이아웃 지정하지 않음.
		for(int i=0;i<buttons.length;i++) {
			f.add(buttons[i]);
			buttons[i].setBounds(x,y,ga,se);
			x+=100;
			if(i%9==0&&i!=0) {
				y+=50;
				x=50;
			}
		}
		
		
		
		f.setVisible(true);
	}
	

}
