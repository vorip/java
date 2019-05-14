package 반복문;

import java.util.Scanner;

public class StringPrint {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력 1 : ");
		String str1 = scan.next();
		System.out.print("입력 2 : ");
		String str2 = scan.next();
		System.out.printf("**%s %s**",str1,str2);
		scan.close();
	}

}
