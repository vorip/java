package _2차원배열;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 그림바꾸기슉슉 {

	static int cnt =0;
	public static void main(String[] args) {
		JFrame f = new JFrame("그림바꾸기");
		FlowLayout flow = new FlowLayout();
		String[] img = {"돈.PNG","생일.PNG","어스.PNG","파이브피트.PNG","헬보이.PNG"};
		ImageIcon[] icon = new ImageIcon[5];
		ImageIcon icon2 = new ImageIcon("돈.PNG");
		for(int i=0;i<icon.length;i++) {
			icon[i] = new ImageIcon(img[i]);
		}
		JButton b3 = new JButton();
		b3.setIcon(icon2);
		JButton b1 = new JButton("왼쪽으로");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cnt>0) {
					cnt--;
					b3.setIcon(icon[cnt]);
				}
			}
		});
		JButton b2 = new JButton("오른쪽으로");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cnt<4) {
					cnt++;
					b3.setIcon(icon[cnt]);
				}
			}
		});
		
		
		
		f.setSize(400,600);
		f.getContentPane().setLayout(flow);
		f.getContentPane().add(b1);
		f.getContentPane().add(b2);
		f.getContentPane().add(b3);
		f.setVisible(true);
		
	}

}
