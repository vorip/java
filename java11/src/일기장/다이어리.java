package 일기장;

import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class 다이어리 {
	public 다이어리(String id) {
		JFrame diary = new JFrame("나의 일기장 작성화면");
		JLabel noti1 = new JLabel("작성날짜");
		TextField t1 = new TextField();
		JLabel noti2 = new JLabel("제목");
		TextField t2 = new TextField();
		JLabel noti3 = new JLabel("내용");
		TextField t3 = new TextField();
		JButton b1 = new JButton("파일에 저장하기");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(t1.getText().equals(null)) {
					JOptionPane.showMessageDialog(null, "날짜를 작성해주세요");
				}else if(t2.getText().equals(null)) {
					JOptionPane.showMessageDialog(null, "제목을 작성해주세요");
				}else if(t3.getText().equals(null)) {
					JOptionPane.showMessageDialog(null, "내용을 작성해주세요");
				}else {
					try {
						FileWriter w = new FileWriter(id+".txt");
						w.write(t1.getText()+"\n");
						w.write(t2.getText()+"\n");
						w.write(t3.getText()+"\n");
						w.close();
					}catch(Exception e1) {
						
					}
				}
			}
		});
		JButton b2 = new JButton("불러오기");
//		b2.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				try {
//					FileReader r = new FileReader(id+".txt");
//					int ch = 0;
//					while((ch=r.read())!=-1) {
//						
//					}
//					r.close();
//				} catch (FileNotFoundException e1) {
//					e1.printStackTrace();
//				}
//			}
//		});
		
		diary.setSize(400,600);
		diary.getContentPane().setLayout(null);
		diary.getContentPane().add(noti1);
		diary.getContentPane().add(t1);
		diary.getContentPane().add(noti2);
		diary.getContentPane().add(t2);
		diary.getContentPane().add(noti3);
		diary.getContentPane().add(t3);
		diary.getContentPane().add(b1);
		diary.getContentPane().add(b2);
		noti1.setBounds(52,10,50,25);
		noti2.setBounds(52,45,38,25);
		noti3.setBounds(142,75,50,25);
		t1.setBounds(141,10,140,25);
		t2.setBounds(141,45,140,25);
		t3.setBounds(29,114,276,262);
		b1.setBounds(53,393,230,40);
		b2.setBounds(53,447,230,40);
		
		diary.setVisible(true);
	
	}

}
