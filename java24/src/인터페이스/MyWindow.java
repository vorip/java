package 인터페이스;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyWindow extends JFrame{
	
	MyWindow(){
		setSize(300,300);
		JButton	b = new JButton("나를 눌러요");
		add(b);
		
		b.addActionListener(new ActionProcess());
		
		setVisible(true);
	}

	public static void main(String[] args) {
		MyWindow name = new MyWindow();
		
	}

}
