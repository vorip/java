package 반복문;

import java.util.Scanner;

public class WhileTest2 {

	public static void main(String[] args) {
		//두 개의 입력값을 받아서,
		//첫번째값부터 두번째값까지 더함.
		Scanner scan = new Scanner(System.in);
		System.out.print("시작값 입력 : ");
		int num1 = scan.nextInt();
		System.out.print("끝값 입력 : ");
		int num2 = scan.nextInt();
		int sum = 0;
		System.out.print(num1+"부터 "+num2+"까지의 합은 :");
		while(num1<=num2) {
			sum += num1;
			num1++;
		}
		System.out.println(sum);
		scan.close();
		
	}

}
