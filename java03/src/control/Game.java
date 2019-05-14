package control;

import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random r1 = new Random();
		int target = r1.nextInt(100);
		int count = 0;
		
		while(true) {
			
			count++;
			System.out.printf("당신이 생각한 숫자를 입력하세요>> ");
			int guess = scan.nextInt();
			
			if(target == guess) {
				
				System.out.printf("정답입니다. %d번 시도.\n",count);
				break;
			}else if(target>guess) {
				System.out.println("틀렸습니다.");
				System.out.println("정답보다 작습니다.");
				System.out.println("다시 입력해주세요.");
			}else{
				System.out.println("틀렸습니다.");
				System.out.println("정답보다 큽니다.");
				System.out.println("다시 입력해주세요.");
			}
			
		}
		scan.close();
	}

}
