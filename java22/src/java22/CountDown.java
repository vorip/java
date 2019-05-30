package java22;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public class CountDown extends JFrame{
	FlowLayout flow = new FlowLayout();
	CountDown(){
		setSize(400,300);
		setLayout(flow);
		CThread1 t1 = new CThread1();
		CThread2 t2 = new CThread2();
		CThread3 t3 = new CThread3();
		
		add(t1.label);
		add(t2.label);
		add(t3.label);
		
		t1.start();
		t2.start();
		t3.start();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		CountDown name = new CountDown();
	}

}
