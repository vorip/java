package window;

import java.util.Date;
import java.util.Scanner;

public class NowYear {

	public static void main(String[] args) {
		Date date = new Date();
		Scanner scan = new Scanner(System.in);
		
		int nYear = date.getYear()+1900;
		System.out.print("구하고자 하는 년도 : ");
		int year = scan.nextInt();
		System.out.printf("앞으로 %d년이 되려면 %d년 남았습니다.",year,year- nYear);
		scan.close();
	}

}
