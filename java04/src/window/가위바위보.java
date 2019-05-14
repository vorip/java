package window;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class 가위바위보 {
	
	
	

	public static void main(String[] args) {
		JFrame f = new JFrame("가위 바위 보 게임");
		FlowLayout flow = new FlowLayout();
		JLabel l1 = new JLabel();
		l1.setFont(new Font("굴림", Font.BOLD, 16));
		l1.setText("결과가 표시되는 창입니다.");
		JButton b1 = new JButton("가위");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Random r1 = new Random();
				String comR = "";
				int com = r1.nextInt(3);
				switch(com) {
				case 0 :
					comR = "바위";
					break;
				case 1 :
					comR = "보";
					break;
				default :
					comR = "가위";
				}
				if(comR.equals("가위")) {
					l1.setText("비겼습니다!(com : 가위, me : 가위)");
				}else if(comR.equals("바위")) {
					l1.setText("졌습니다!(com : 바위, me : 가위)");
				}else {
					l1.setText("이겼습니다!(com : 보, me : 가위)");
				}
			}	
		});
		JButton b2 = new JButton("바위");
			b2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Random r1 = new Random();
					String comR = "";
					int com = r1.nextInt(3);
					switch(com) {
					case 0 :
						comR = "바위";
						break;
					case 1 :
						comR = "보";
						break;
					default :
						comR = "가위";
					}
					if(comR.equals("가위")) {
						l1.setText("이겼습니다!(com : 가위, me : 바위)");
					}else if(comR.equals("바위")) {
						l1.setText("비겼습니다!(com : 바위, me : 바위)");
					}else {
						l1.setText("졌습니다!(com : 보, me : 바위)");
					}
				}
			});
		JButton b3 = new JButton("보");
			b3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Random r1 = new Random();
					String comR = "";
					int com = r1.nextInt(3);
					switch(com) {
					case 0 :
						comR = "바위";
						break;
					case 1 :
						comR = "보";
						break;
					default :
						comR = "가위";
					}
					if(comR.equals("가위")) {
						l1.setText("졌습니다!(com : 가위, me : 보)");
					}else if(comR.equals("바위")) {
						l1.setText("이겼습니다!(com : 바위, me : 보)");
					}else {
						l1.setText("비겼습니다!(com : 보, me : 보)");
					}
				}
				
				
			});

		
		f.setSize(328,246);
		f.getContentPane().setLayout(flow);
		f.getContentPane().add(b1);
		f.getContentPane().add(b2);
		f.getContentPane().add(b3);
		f.getContentPane().add(l1);
		f.setVisible(true);
	}

}
