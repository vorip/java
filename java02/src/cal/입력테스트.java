package cal;

import java.util.Scanner;

public class 입력테스트 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String name = sc.next();
		System.out.println("당신이 입력한 데이터 : " + name);
		
		sc.close();
		
		
	}

}
