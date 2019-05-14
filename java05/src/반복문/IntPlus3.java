package 반복문;

import java.util.Scanner;

public class IntPlus3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 1 : ");
		int num1 = scan.nextInt();
		System.out.print("정수 2 : ");
		int num2 = scan.nextInt();
		System.out.print("정수 3 : ");
		int num3 = scan.nextInt();
		
		System.out.printf("정수 1 :%d와 정수 2 : %d와 정수 3 : %d를 더한 값은  %d입니다.",num1,num2,num3,num1+num2+num3);
		scan.close();
	}

}
