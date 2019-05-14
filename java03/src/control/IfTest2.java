package control;

import java.util.Scanner;

public class IfTest2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 1 입력 : ");
		int num1 = scan.nextInt();
		System.out.print("정수 2 입력 : ");
		int num2 = scan.nextInt();
		if(num1>num2) {
			System.out.printf("두 수중 더 큰 수는 %d입니다.\n",num1);
		}else if(num1<num2) {
			System.out.printf("두 수중 더 큰 수는 %d입니다.\n",num2);
		}else {
			System.out.println("두 수가 같습니다.");
		}
		scan.close();
	}

}
