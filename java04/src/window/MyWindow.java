package window;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class MyWindow {

	public static void main(String[] args) {
		//프레임 : 프레임 제목
		JFrame f = new JFrame("입력값 받는 프로그램.");
		//물흐르듯이 배치
		FlowLayout flow = new FlowLayout();
		//입력받는 화면(한줄짜리) : 글자수 입력
		JTextField text = new JTextField(30);
		//버튼 : 버튼 이름
		JButton button = new JButton("나를 눌러요.");
		//글자들 : 출력할 텍스트
		JLabel label = new JLabel("당신의 주요 프로그램 언어를 입력하세요");
		button.setFont(new Font("굴림", Font.BOLD, 14));
		
		f.setSize(439,317);
		f.getContentPane().setLayout(flow);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("버튼이 눌러졌군요.");
				String data = text.getText();
				System.out.println("당신의 주요 과목은 : "+data);
			}
		});
		label.setFont(new Font("굴림", Font.BOLD, 18));
		label.setForeground(Color.BLUE);
		f.getContentPane().add(label);
		f.getContentPane().add(text);
		f.getContentPane().add(button);
		f.setVisible(true);// setvisible(true) 밑줄부터 다시 안보임
		
		
	}

}
