package window;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학점을 입력하세요 : ");
		String grade = scan.next();
		
		switch(grade) {
		case "A" :
		case "a" :
			System.out.println("90점 이상이시군요!");
			break;
		case "B" :
		case "b" :
			System.out.println("80점 이상이시군요!");
			break;
		case "C" :
		case "c" :
			System.out.println("70점 이상이시군요!");
			break;
		case "D" :
		case "d" :
			System.out.println("60점 이상이시군요!");
			break;
		default :
			System.out.println("60점 미만이시군요");
			
		}
	}

}
