package 인터페이스;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyWindow3 extends JFrame {
	JButton b = new JButton("나를 눌러요");
	JButton b2 = new JButton("나도 눌러요");

	MyWindow3() {
		setSize(300, 300);
		setLayout(new FlowLayout());
		add(b);
		add(b2);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(b.getText()+"를 누르셨군요");
			}
		});
		setVisible(true);
	}

	public static void main(String[] args) {
		MyWindow3 name = new MyWindow3();
	}
}
