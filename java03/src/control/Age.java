package control;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("형의 나이를 입력하세요 : ");
		int old = scan.nextInt();
		System.out.print("동생의 나이를 입력하세요 : ");
		int young = scan.nextInt();
		
		if(old>=young) {
			System.out.println("내가 떡 두개를 먹어요");
		}else {
			System.out.println("동생이 떡 두개를 먹어요");
		}
		scan.close();
		
		
		
		
	}

}
