package 반복문;

import java.util.Scanner;

public class FourSeason {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("계절[1-4]을 입력하세요 => ");
			int i = scan.nextInt();
			switch(i) {
			case 1 :
				System.out.println("계절은 봄 입니다.");
				break;
			case 2 :
				System.out.println("계절은 여름 입니다.");
				break;
			case 3 :
				System.out.println("계절은 가을 입니다.");
				break;
			case 4 :
				System.out.println("계절은 겨울 입니다.");
				break;
			default :
			}
			if(i>=1 && i<=4) {
				break;
			}
		}
		scan.close();
	}

}
