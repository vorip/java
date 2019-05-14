package window;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyWindow {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500,500);
		//jframe 사이즈 설정. f.setSize(가로,세로);
		f.setTitle("나의 첫번째 그래픽 프로그램");
		//jframe 제목설정.
		JButton button = new JButton("나를 눌러주세요");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("나를 눌렀군요.");
			}
		});
		//jframe의 버튼 생성
		f.getContentPane().add(button);
		//jframe에 버튼 추가 f.add(생성한 버튼이름);
		f.setVisible(true);
		//jframe을 보이게 하기(기본값은 보이지 않는것)
	}

}
