package window;

import java.util.Date;

public class 계절판별 {

	public static void main(String[] args) {
		Date date = new Date();
		int month = date.getMonth()+1;//getmonth는 1월 적게 나옴
		System.out.print("지금은"+month+"월, ");
		if(month<=5 && month>=3) {
			System.out.println("봄입니다.");
		}else if(month>=6 && month<=8) {
			System.out.println("여름입니다.");
		}else if(month>=9 && month<=11) {
			System.out.println("가을입니다.");
		}else
			System.out.println("겨울입니다.");
	}

}
