package 배열;

import java.util.Scanner;

public class MaxChange {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num = new int[4];
		int n=0;
		int[] num1 =new int[4];
		System.out.println("정수 5개 입력");
		for(int i=0;i<num.length;i++) {
			System.out.printf("정수 %d: ",i+1);
			n = scan.nextInt();
			num[i] = n;
			num1[i] = n;
		}
		for(int i=0;i<num.length;i++) {
			if(i!=3) {
				if(num1[0]<num1[i+1]) {
					num1[0]=num1[i+1];
					n=num1[0];
				}else {
					n=num1[0];
				}
			}		
		}
		System.out.println("가장 큰 수는 : "+num1[0]);
		
		n = num[3];
		num[3] = num[0];
		num[0] = n;
		System.out.print("{ ");
		for(int i=0; i<num.length;i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println("}");
		scan.close();
		
	}

}
