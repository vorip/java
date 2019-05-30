package 인터페이스;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyWindow2 extends JFrame implements ActionListener{
	
	MyWindow2(){
		setSize(300,300);
		JButton	b = new JButton("나를 눌러요");
		add(b);
		
		b.addActionListener(this);
		setVisible(true);
	}

	public static void main(String[] args) {
		MyWindow2 name = new MyWindow2();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());//e.getActionCommand : 버튼의이름가져오기
	}

}
