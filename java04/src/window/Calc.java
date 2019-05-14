package window;

import java.awt.FlowLayout;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calc {

	public static void main(String[] args) {
		JFrame f = new JFrame("사칙연산 계산기");
		FlowLayout flow = new FlowLayout();
		JLabel l1 = new JLabel();
		l1.setFont(new Font("굴림", Font.BOLD, 17));
		l1.setText("숫자1");
		JLabel l2 = new JLabel();
		l2.setText("숫자 2");
		l2.setFont(new Font("굴림", Font.BOLD, 17));
		JLabel l3 = new JLabel();
		l3.setFont(new Font("굴림", Font.BOLD, 17));
		l3.setText("기호>>");
		TextField n1 = new TextField();
		n1.setFont(new Font("굴림", Font.BOLD, 17));
		n1.setColumns(17);
		TextField n2 = new TextField();
		n2.setFont(new Font("굴림", Font.BOLD, 17));
		n2.setColumns(17);
		TextField c1 = new TextField();
		c1.setFont(new Font("굴림", Font.PLAIN, 17));
		c1.setColumns(17);
		JButton b1 = new JButton();
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(n1.getText());
				int num2 = Integer.parseInt(n2.getText());
				if(c1.getText().equals("+")) {
					System.out.println(num1+num2);
				}
				else if(c1.getText().equals("-")) {
					System.out.println(num1-num2);
				}
				else if(c1.getText().equals("*")) {
					System.out.println(num1*num2);					
				}
				else if(c1.getText().equals("/")) {
					if(num2!=0){
						System.out.println(num1/num2);								
					}else {
						System.out.println("0으로 나눌 수 없습니다.");
					}
				}else {
					System.out.println("사칙연산 기호만 입력해주세요");
				}
			}
		});
		b1.setFont(new Font("굴림", Font.BOLD, 17));
		b1.setText("계산!!");
		
		f.setSize(300,300);
		f.getContentPane().setLayout(flow);
		f.getContentPane().add(l1);
		f.getContentPane().add(n1);
		f.getContentPane().add(l2);
		f.getContentPane().add(n2);
		f.getContentPane().add(l3);
		f.getContentPane().add(c1);
		f.getContentPane().add(b1);
		f.setVisible(true);
		
		
	}

}
