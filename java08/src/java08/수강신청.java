package java08;

import java.util.Scanner;

public class 수강신청 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] sub = {"자바","스프링","안드로이드","파이썬","제이쿼리"};
		int[] subsub= new int[sub.length];
		int key=0,cnt=0;
		
		
		System.out.println("수강신청을 진행합니다.");
		while(true) {
			System.out.println("원하는 과목을 신청해주세요.");
			System.out.println("-----------------------------------");
			for(int i=0;i<sub.length;i++) {
				System.out.printf("%d)%s  ",i+1,sub[i]);
			}
			System.out.println("\n-----------------------------------");
			for(int i=0;i<sub.length;i++) {
				System.out.printf("%5d  ",subsub[i]);
			}
			for(int i = 0;i<sub.length;i++) {
				if(subsub[i]==1) {
					cnt++;
				}
			}
			if(cnt==5) {
				System.out.println("\n더 이상 수강신청 할 과목이 없습니다.");
				System.out.println("프로그램을 자동으로 종료합니다.");
				break;
			}
			cnt=0;
			System.out.print("\n원하는 과목 코드(종료0) > ");
			key = scan.nextInt();
			if(key ==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else if(key>0&&key<=sub.length) {
				if(subsub[key-1]==0) {
					System.out.println("신청이 완료되었습니다.");
					subsub[key-1]=1;	
				}else {
					System.out.println("이미 신청한 과목입니다.");
					System.out.println("다른 과목을 신청해주세요");
				}
			}else {
				System.out.println("유효하지 않은 과목입니다.");
				System.out.println("다시 입력해주세요.");
			}
		}
		scan.close();
	}

}
