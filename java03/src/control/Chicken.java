package control;

import java.util.Scanner;

public class Chicken {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("오늘의 치킨 가격은 얼마인가요? ");
		int price = scan.nextInt();
		if(price > 9000) {
			System.out.println("내일 다시 전화할게요");
		}else {
			System.out.println("주문할게요");
		}
		scan.close();
		
	}

}
