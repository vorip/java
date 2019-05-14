package cal;

import java.util.Scanner;

public class Me2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("-------------------");
		System.out.print("당신의 취미는 : ");
		String hobby = scan.next();
		System.out.print("평소 TV 시청 시간은 : ");
		int watch = scan.nextInt();
		System.out.print("봄 여행을 다녀왔나요 : ");
		boolean b = scan.nextBoolean();
		System.out.println("-------------------");
		
		System.out.printf("내 취미는 %s이고, 평소에 TV를 %d시간도 보지 않아요."
				+ "봄 여행은 %b에요",hobby,watch,b);
		scan.close();
	}

}
