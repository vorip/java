package java08;

import java.util.Scanner;

public class 콘도예약 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] sub = {"강원도","전라도","파주","제주도","충청도"};
		int[] subsub= new int[sub.length];
		int key=0,cnt=0;
		
		
		System.out.println("콘도예약프로그램을 시작합니다..");
		while(true) {
			System.out.println("원하는 지역을 선택해주세요.(각 지역 두명까지 신청가능");
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
				System.out.println("\n더 이상 예약할 수 있는 콘도가 없습니다.");
				System.out.println("프로그램을 자동으로 종료합니다.");
				break;
			}
			cnt=0;
			System.out.print("\n원하는 지역 코드(종료0) > ");
			key = scan.nextInt();
			if(key ==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else if(key>0&&key<=sub.length) {
				if(subsub[key-1]<2) {
					System.out.println("예약이 완료되었습니다.");
					subsub[key-1]++;	
				}else {
					System.out.println("이미 예약이 가득 찼습니다.");
					System.out.println("다른 콘도를 예약해주세요");
				}
			}else {
				System.out.println("유효하지 않은 지역입니다.");
				System.out.println("다시 입력해주세요.");
			}
		}
		scan.close();
	}
}
