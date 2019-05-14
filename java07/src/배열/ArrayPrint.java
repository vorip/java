package 배열;

import java.util.Scanner;

public class ArrayPrint {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] s = new String[3];
		
		for(int i=0;i<3;i++) {
			System.out.printf("입력 %d : ",i+1);
			s[i] = scan.next();
		}
			System.out.printf("**%s보다는 %s**",s[0],s[2]);
		scan.close();
	}

}
