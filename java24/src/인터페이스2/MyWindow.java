package 인터페이스2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyWindow extends JFrame {
	JButton b = new JButton("나를 눌러요");
	JButton b2 = new JButton("나도 눌러요");
	JButton button = new JButton();

	MyWindow() {
		setSize(300, 300);
		setLayout(new FlowLayout());
		add(b);
		add(b2);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button = (JButton)e.getSource();
				//액션 이벤트 e의 getSource()메소드를 이용하여 버튼정보를 Object타입으로 얻어온다.
				//형변환을 통해 버튼 타입의 변수를 선언 후 그곳에 정보를 저장한다.
				System.out.println(button.getText()+"를 누르셨군요");
				//버튼의 이름을 출력
			}
		});
		// - 액션리스너의 동작순서
		// 1. 버튼 클릭
		// 2. ActionListener 인터페이스의 actionPerformed 메서드 구현
		// 3. 파라미터에 ActionListener인터페이스를 구현한 이름없는 익명클래스 객체 생성
		// 4. 버튼의 addActionListener 메서드 실행
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button = (JButton)e.getSource();
				System.out.println(button.getText()+"를 누르셨군요");
			}
		});
		setVisible(true);

	}

	public static void main(String[] args) {

		MyWindow name = new MyWindow();

	}


		
	

}
