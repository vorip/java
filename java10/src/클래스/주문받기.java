package 클래스;


import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class 주문받기 {
	static int su = 0;
	static int price = 0;
	public static void main(String[] args) {
		String[] bbq = {"gold.jpeg","yang.jpg","padak.jpeg"};
		계산기 g = new 계산기();
		JFrame f = new JFrame("bbq치킨");
		ImageIcon main = new ImageIcon("bbq.jpg");
		FlowLayout flow = new FlowLayout();
		JLabel re1 = new JLabel("시킨 치킨의 수 : ");
		re1.setFont(new Font("굴림", Font.PLAIN, 15));
		JLabel re2 = new JLabel("총 금액 : ");
		re2.setFont(new Font("굴림", Font.PLAIN, 15));
		JLabel price1 = new JLabel("황금올리브 : 18000");
		price1.setFont(new Font("굴림", Font.BOLD, 15));
		JLabel price2 = new JLabel("처갓집양념 : 15000");
		price2.setFont(new Font("굴림", Font.BOLD, 15));
		JLabel price3 = new JLabel("파닭 : 20000");
		price3.setFont(new Font("굴림", Font.BOLD, 15));
		JLabel l3 = new JLabel();
		l3.setFont(new Font("굴림", Font.BOLD, 20));
		JButton b4 = new JButton(main);
		JButton b1 = new JButton("황금올리브 추가!");
		b1.setFont(new Font("굴림", Font.BOLD, 20));
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(bbq[0]);
				b4.setIcon(icon);
				price+=g.add(18000);
				su++;
				re1.setText("시킨 치킨의 수 : "+su+"마리");
				re2.setText("총 금액 : "+price+"원");
			}
		});
		JButton b2 = new JButton("처갓집양념 추가!");
		b2.setFont(new Font("굴림", Font.BOLD, 20));
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(bbq[1]);
				b4.setIcon(icon);
				price+=g.add(15000);
				su++;
				re1.setText("시킨 치킨의 수 : "+su+"마리");
				re2.setText("총 금액 : "+price+"원");
				
			}
		});
		JButton b3 = new JButton("파닭 추가!");
		b3.setFont(new Font("굴림", Font.BOLD, 20));
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(bbq[2]);
				b4.setIcon(icon);
				price+=g.add(20000);
				su++;
				re1.setText("시킨 치킨의 수 : "+su+"마리");
				re2.setText("총 금액 : "+price+"원");
			}
		});
		JButton b6 = new JButton("주문 취소");
		b6.setFont(new Font("굴림", Font.BOLD, 12));
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(su>0) {
					l3.setText("주문이 취소되었습니다.");
					su=0;
					price =0;
					re1.setText("시킨 치킨의 수 : ");
					re2.setText("총 금액 : ");		
				}
			}
		});
		JButton b5 = new JButton("주문하기");
		b5.setFont(new Font("굴림", Font.BOLD, 12));
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(su>0) {
					l3.setText("주문이 완료되었습니다. 총 : "+ su+"마리"+"\n금액은 "+price+"원 입니다.");
					su=0;
					price =0;
					re1.setText("시킨 치킨의 수 : ");
					re2.setText("총 금액 : ");					
				}
			}
		});

		
		f.setSize(600,500);
		f.getContentPane().setLayout(flow);
		f.getContentPane().add(b1);
		f.getContentPane().add(b2);
		f.getContentPane().add(b3);
		f.getContentPane().add(price1);
		f.getContentPane().add(price2);
		f.getContentPane().add(price3);
		f.getContentPane().add(b5);
		f.getContentPane().add(b6);
		f.getContentPane().add(re1);
		f.getContentPane().add(re2);
		f.getContentPane().add(l3);
		f.getContentPane().add(b4);
		
		
		
		
		f.setVisible(true);
		
		
	}

}
