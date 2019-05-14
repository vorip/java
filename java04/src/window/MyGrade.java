package window;

import java.util.Scanner;

public class MyGrade {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("본인의 등급을 입력하세요 : ");
		char grade = scan.next().charAt(0);
		switch(grade) {
		case 'A' :
		case 'a' :
			System.out.println("최우수입니다.");
			break;
		case 'B' :
		case 'b' :
			System.out.println("우수입니다.");
			break;
		case 'C' :
		case 'c' :
			System.out.println("보통입니다.");
			break;
		default:
			System.out.println("통과하지 못했습니다.");
		}
		scan.close();
		
		
	}

}
