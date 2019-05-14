package 배열;

import java.util.Scanner;

public class 흥민이형 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("학생의 수 : ");
		int stunum = scan.nextInt(),index;
		String[] name = new String[stunum];
		int[] java = new int[stunum];
		int[] spring = new int[stunum];
		
		for(int i=0;i<stunum;i++) {
			System.out.print("학생이름 : ");
			name[i] = scan.next();
			System.out.print("학생점수(자바) : ");
			java[i] = scan.nextInt();
			System.out.print("학생점수(스프링) : ");
			spring[i] = scan.nextInt();
		}
		System.out.printf("세 학생의 이름은 ");
		for(int i=0;i<stunum;i++) {
			System.out.print(name[i]);
			if(i!=stunum-1) {
				System.out.print(", ");
			}
		}
		String n="";
		index=java[0];
		for(int i=0;i<stunum;i++) {
			if(index<java[i]) {
				index=java[i];
				n=name[i];
			}
		}
		System.out.printf("\n제일 높은 자바 점수는 %d(%s)\n",index,n);
		index = spring[0];
		for(int i=0;i<stunum;i++) {
			if(index>spring[i]) {
				index=spring[i];
				n = name[i];
			}
		}
		System.out.printf("제일 낮은 스프링 점수는 %d(%s)\n",index,n);
		scan.close();
		
	}

}
