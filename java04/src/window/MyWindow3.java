package window;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class MyWindow3 {

	public static void main(String[] args) {
		JFrame f = new JFrame("입력받는프로그램");
		JLabel label = new JLabel("당신이 사용하는 개발 툴을 입력하세요.");
		label.setFont(new Font("굴림", Font.BOLD, 14));
		JLabel label2 = new JLabel("당신이 사용하는 프로그래밍 언어를 입력하세요.");
		label2.setForeground(Color.BLACK);
		label2.setFont(new Font("굴림", Font.BOLD, 14));
		JTextField field = new JTextField();
		field.setBackground(Color.PINK);
		field.setForeground(Color.WHITE);
		JTextField field2 = new JTextField();
		field2.setForeground(Color.WHITE);
		field2.setBackground(Color.PINK);
		FlowLayout flow = new FlowLayout();
		field.setColumns(20);
		field2.setColumns(20);
		f.setSize(357,383);
		f.getContentPane().setLayout(flow);
		f.getContentPane().add(label2);
		f.getContentPane().add(field2);
		f.getContentPane().add(label);
		f.getContentPane().add(field);
		JButton button = new JButton("나를 눌러주세요");
		button.setFont(new Font("굴림", Font.PLAIN, 20));
		button.setBackground(Color.WHITE);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("당신이 사용하는 프로그래밍 언어는 : "+field2.getText());
				
				
			}
		});
		f.getContentPane().add(button);
		
		JButton button2 = new JButton("나도 눌러요");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("당신이 사용하는 개발 툴은 : "+field.getText());
			}
		});
		button2.setFont(new Font("굴림", Font.PLAIN, 20));
		f.getContentPane().add(button2);
		f.setVisible(true);
		
		
		
		
		
		
		
	}

}
