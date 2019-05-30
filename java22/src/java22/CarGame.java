package java22;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CarGame extends JFrame{
	public class CarThread extends Thread{
		int x,y;
		ImageIcon icon;
		JLabel carImage;
		Random r1=new Random();
		public CarThread(String fileName ,int x ,int y){
			this.x = x;
			this.y = y;
			this.icon = new ImageIcon(fileName);
			this.carImage = new JLabel(icon);
			this.carImage.setBounds(x, y, 100, 100);
			add(carImage);
		}
		@Override
		public void run() {
			for(int i=0;i<=500;i+=r1.nextInt(15)) {
				this.carImage.setBounds(i, this.y, 100, 100);
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}

	}

	CarGame(){
		setTitle("나의 스레드 자동차 프로그램");
		setLayout(null);
		setSize(600, 350);
		
		CarThread car1 = new CarThread("car1.gif",0,0);
		CarThread car2 = new CarThread("car2.gif",0,100);
		CarThread car3 = new CarThread("car3.gif",0,200);
		car1.start();
		car2.start();
		car3.start();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		CarGame name = new CarGame();
	}

}
