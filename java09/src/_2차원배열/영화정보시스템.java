package _2차원배열;

import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
//import javax.swing.JTextField;
//import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class 영화정보시스템 {

	public static void main(String[] args) {
		String[] movies = {"돈.PNG","생일.PNG","어스.PNG","파이브피트.PNG","헬보이.PNG"};
		
		//자바는 필요한 부분의 부품(class)를 복사해서
		//조립해서 코딩하는 방식
		//부품(객체, 대상)조립식 프로그램
		//객체지향형 프로그램(Object-Oriented Program, OOP)
		
		// Color.ted : static(정적)
		// new Button : instance
		JFrame f = new JFrame();
		FlowLayout flow = new FlowLayout();
//		JTextPane f1 = new JTextPane();
//		JTextField t1 = new JTextField();
		ImageIcon icon = new ImageIcon("돈.PNG");
		JButton img = new JButton(icon);
		JButton b1 = new JButton("<돈(money)>");
		b1.setFont(new Font("굴림", Font.BOLD, 17));
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ImageIcon icon1 = new ImageIcon(movies[0]);
				img.setIcon(icon1);
			}
		});
		JButton b2 = new JButton("<<<생일>>>");
		b2.setFont(new Font("굴림", Font.BOLD, 17));
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon2 = new ImageIcon(movies[1]);
				img.setIcon(icon2);
			}
		});
		JButton b3 = new JButton("<<<어스>>>");
		b3.setFont(new Font("굴림", Font.BOLD, 17));
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon3 = new ImageIcon(movies[2]);
				img.setIcon(icon3);
			}
		});
		JButton b4 = new JButton("<<<파이브피트>>>");
		b4.setFont(new Font("굴림", Font.BOLD, 17));
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon4 = new ImageIcon(movies[3]);
				img.setIcon(icon4);
			}
		});
		JButton b5 = new JButton("<<<헬보이>>>");
		b5.setFont(new Font("굴림", Font.BOLD, 17));
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon5 = new ImageIcon(movies[4]);
				img.setIcon(icon5);
			}
		});
		//객체화를 해주어야 String을 의미있게 인식한다.
//		URL name = new URL("http://www.naver.com");
//		File file = new File("c:/temp/test.txt");
//		SQL sql = new SQL("select * from member");
		
		
		
		f.setSize(300,600);
		f.getContentPane().setLayout(flow);
		f.setTitle("나의 영화 정보 시스템");
//		f.add(f1);
//		f.add(t1);
		f.getContentPane().add(img);
		f.getContentPane().add(b1);
		f.getContentPane().add(b2);
		f.getContentPane().add(b3);
		f.getContentPane().add(b4);
		f.getContentPane().add(b5);
		f.setVisible(true);
	}

}
