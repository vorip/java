package 일기장;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.TextField;
import java.awt.event.ActionEvent;

public class 로그인 {
	static int idCnt = 0;
	static int pwCnt = 0;
	public static void main(String[] args) {
		String[] idV = {"choi","kim","park"};
		String[] pwV = {"1234","1234","1234"};
		JFrame diary = new JFrame("나의 생성자 프레임");
		JLabel idScan = new JLabel("id입력");
		JLabel pwScan = new JLabel("pw입력");
		TextField id = new TextField();
		TextField pw = new TextField();
		ImageIcon icon = new ImageIcon("diary.png");
		JButton icon1 = new JButton(icon);
		JButton b1 = new JButton("로그인 처리");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i=0;i<idV.length;i++) {
					if(idV[i].equals(id.getText())) {
						idCnt++;
					}
				}
				for(int i=0;i<pwV.length;i++) {
					if(pwV[i].equals(pw.getText())) {
						pwCnt++;
					}
				}
				if(idCnt==1&&pwCnt>=1) {
					idCnt=0;
					pwCnt=0;
					다이어리 dd = new 다이어리(id.getText());	
				}else {
					JOptionPane.showMessageDialog(null,"ID혹은 PW가 일치하지 않습니다.");
					idCnt=0;
					pwCnt=0;
				}
				
			}
		});
		
		diary.setSize(450,500);
		diary.getContentPane().setLayout(null);
		diary.getContentPane().add(icon1);
		diary.getContentPane().add(b1);
		diary.getContentPane().add(idScan);
		diary.getContentPane().add(id);
		diary.getContentPane().add(pwScan);
		diary.getContentPane().add(pw);
		icon1.setBounds(40, 24, 350, 350);
		b1.setBounds(162,422,100,29);
		idScan.setBounds(66,384,45,29);
		pwScan.setBounds(218,384,45,29);
		id.setBounds(132,390,77,23);
		pw.setBounds(273,390,77,23);
		
		
		
		diary.setVisible(true);
	
	}

}
