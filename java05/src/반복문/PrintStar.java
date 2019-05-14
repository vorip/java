package 반복문;

import java.util.Scanner;

public class PrintStar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("출력할 별의 갯수 : ");
		int star = scan.nextInt();
		
		for(int i = 0; i<star;i++) {
			System.out.print("★");
		}
		scan.close();
	}

}
