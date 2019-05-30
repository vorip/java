package java22;

import java.util.Random;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class CThread1 extends Thread{
	JLabel label;
	String name;
	Random r1 = new Random();
	CThread1(){
		label = new JLabel();
		name =JOptionPane.showInputDialog("이름 : ");
		label.setText(name+"의 게임 시작 : 500");
	}
	
	@Override
	public void run() {
		int i=500;
		while(true) {
			i-= r1.nextInt(5);
			if(i>0) {
				this.label.setText(name+"의 게임 시작 : "+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else {
				this.label.setText(name+"의 게임 시작 : 0");
				break;
			}
		}
	}

}
