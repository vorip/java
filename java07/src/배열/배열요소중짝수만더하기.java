package 배열;

import java.util.Scanner;

public class 배열요소중짝수만더하기 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num = new int[4];
		int sum = 0;
		
		for(int i=0;i<num.length;i++) {
			System.out.printf("정수 %d : ",i+1);
			num[i] = scan.nextInt();
			if(num[i]%2==0) {
				sum+=num[i];
			}
			
		}
		if(sum!=0) {
			System.out.println("짝수들의 합 : "+sum);
		}else {
			System.out.println("짝수가 없습니다.");
		}
		scan.close();
	}

}
