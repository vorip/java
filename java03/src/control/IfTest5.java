package control;

import java.util.Scanner;

public class IfTest5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.printf("점수를 입력해주세요 : ");
		int point = scan.nextInt();
		
		if(point <=100 && point >=0) {
			if(point >= 90) {
				System.out.println("당신의 학점은 A입니다.");
			}else if(point >= 80) {
				System.out.println("당신의 학점은 B입니다.");
			}else if(point >= 70) {
				System.out.println("당신의 학점은 C입니다.");				
			}else if(point >= 60) {
				System.out.println("당신의 학점은 D입니다.");				
			}else {
				System.out.println("당신의 학점은 F입니다.");				
			}
		}else {
			System.out.println("0~100사이의 점수를 입력해주세요.");
		}
		scan.close();
		
		

	}
}
