package control;

import java.util.Scanner;

public class IfTest4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.printf("정수 1 입력 : ");
		int num1 = scan.nextInt();
		System.out.printf("정수 2 입력 : ");
		int num2 = scan.nextInt();
		
		System.out.printf("%d + %d = %d\n",num1,num2,num1+num2);
		System.out.printf("%d - %d = %d\n",num1,num2,num1-num2);
		System.out.printf("%d x %d = %d\n",num1,num2,num1*num2);
		if(num2 == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
		}else {
			System.out.printf("%d / %d = %d\n",num1,num2,num1/num2);			
		}
		
		scan.close();
	}

}
