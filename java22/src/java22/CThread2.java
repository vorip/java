package java22;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class CThread2 extends Thread{
	JLabel label;
	Random r1 = new Random();
	ImageIcon[] icons = {new ImageIcon("1.png"),new ImageIcon("2.png"),new ImageIcon("3.png")
			,new ImageIcon("4.png"),new ImageIcon("5.png"),new ImageIcon("6.png"),new ImageIcon("7.png")};
	
	CThread2(){
//		label.setSize(100, 100);
		label = new JLabel(icons[0]);
	}
	@Override
	public void run() {
		while(true) {
			label.setIcon(icons[r1.nextInt(7)]);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
