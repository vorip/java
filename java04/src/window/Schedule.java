package window;

import java.util.Date;

public class Schedule {

	public static void main(String[] args) {
		Date date = new Date();
		
		int today = date.getDay();
		System.out.print("오늘은");
		
		switch(today) {
		case 0 :
			System.out.println(" 일요일. 교회가는날!");
			break;
		case 1 :
			System.out.println(" 월요일. 학원가는날");
			break;
		case 2 :
			System.out.println(" 화요일. 게임하는날");
			break;
		case 3 :
			System.out.println(" 수요일. 친구와 만나는날");
			break;
		case 4 :
			System.out.println(" 목요일. 술마시는날");
			break;
		case 5 :
			System.out.println(" 금요일. 외식하는날");
			break;
		default :
			System.out.println(" 토요일. tv보는날");
		}
	}

}
