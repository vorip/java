package java22;

import java.util.Calendar;

import javax.swing.JLabel;

public class CThread3 extends Thread{
	Calendar cal = Calendar.getInstance();
	JLabel label;
	String today;
	CThread3(){
		today = cal.get(Calendar.YEAR)+"년 "+cal.get(Calendar.MONTH)+"월 "
	+cal.get(Calendar.DATE)+"일 "+cal.get(Calendar.HOUR_OF_DAY)+":"+cal.get(Calendar.MINUTE)+":"
	+cal.get(Calendar.SECOND);
		label = new JLabel(today);
	}
	@Override
	public void run() {
		while(true) {
			cal = Calendar.getInstance();
			today = cal.get(Calendar.YEAR)+"년 "+cal.get(Calendar.MONTH)+"월 "
					+cal.get(Calendar.DATE)+"일 "+cal.get(Calendar.HOUR_OF_DAY)+":"+cal.get(Calendar.MINUTE)+":"
					+cal.get(Calendar.SECOND);
			label.setText(today);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
