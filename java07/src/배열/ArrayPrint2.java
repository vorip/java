package 배열;

import java.util.Scanner;

public class ArrayPrint2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num = new int[3];
		
		for(int i=0;i<3;i++) {
			System.out.printf("입력 %d : ",i+1);
			num[i] = scan.nextInt();
		}
		System.out.printf("%d + %d 는 %d입니다."
				,num[0],num[2],num[0]+num[2]);
		scan.close();
	}
	

}
