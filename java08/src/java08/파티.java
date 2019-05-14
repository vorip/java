package java08;

import java.util.Scanner;

public class 파티 {

	public static void main(String[] args) {
		//변수 선언 부분
		Scanner scan = new Scanner(System.in);
		String[] name = new String[5];
		int[] age = new int[5];
		
		for(int i=0;i<name.length;i++) {
			System.out.print("이름과 나이를 입력하세요 > ");
			name[i] = scan.next();
			age[i] = scan.nextInt();
		}
		System.out.printf("총인원 : %d명\n",name.length);
		System.out.println("------------명단------------");
		for(int i=0;i<name.length;i++) {
			System.out.printf("이름 : %s    ",name[i]);
			System.out.printf(" 나이: %d     \n",age[i]);
		}
		System.out.println("---------------------------");
		int sum = 0;
		for(int i=0;i<name.length;i++) {
			sum+=age[i];
		}
		System.out.printf("참석자 나이의 평균 : %d\n",sum/name.length);
		scan.close();
	}

}
