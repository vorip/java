package window;

import java.awt.FlowLayout;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의첫계산기 {
	static JTextField n1;
	static JTextField n2;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(100, 149, 237));
		f.setSize(359,400);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("<나의 계산기>");
		lblNewLabel.setForeground(new Color(34, 139, 34));
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 40));
		f.getContentPane().add(lblNewLabel);
		
		JLabel label1 = new JLabel("숫자1>>");
		label1.setForeground(new Color(255, 218, 185));
		label1.setFont(new Font("굴림", Font.BOLD, 23));
		f.getContentPane().add(label1);
		
		n1 = new JTextField();
		n1.setFont(new Font("굴림", Font.PLAIN, 16));
		n1.setBackground(new Color(255, 255, 240));
		f.getContentPane().add(n1);
		n1.setColumns(16);
		
		JLabel label = new JLabel("숫자1>>");
		label.setForeground(new Color(255, 218, 185));
		label.setFont(new Font("굴림", Font.BOLD, 23));
		f.getContentPane().add(label);
		
		n2 = new JTextField();
		n2.setFont(new Font("굴림", Font.PLAIN, 16));
		n2.setColumns(16);
		f.getContentPane().add(n2);
		
		JButton b1 = new JButton("+");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(n1.getText());
				int num2 = Integer.parseInt(n2.getText());
				
				
				System.out.println(num1 + num2);
			}
		});
		b1.setFont(new Font("굴림", Font.BOLD, 22));
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("-");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(n1.getText());
				int num2 = Integer.parseInt(n2.getText());
				
				
				System.out.println(num1 - num2);
			}
		});
		b2.setFont(new Font("굴림", Font.BOLD, 22));
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("x");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(n1.getText());
				int num2 = Integer.parseInt(n2.getText());
				
				
				System.out.println(num1 * num2);
			}
		});
		b3.setFont(new Font("굴림", Font.BOLD, 22));
		f.getContentPane().add(b3);
		
		JButton b4 = new JButton("/");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(n1.getText());
				int num2 = Integer.parseInt(n2.getText());
				
				if(num2 ==0) {
					System.out.println("0으로 나눌 수 없습니다.");
				}else {
					System.out.println(num1 / num2);
				}
			}
		});
		b4.setFont(new Font("굴림", Font.BOLD, 22));
		f.getContentPane().add(b4);
		f.setVisible(true);
	}

}
