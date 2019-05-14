package cal;

import java.util.Scanner;

public class scanTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("당신의 이름은? ");
		String name = scan.next();
		System.out.print("당신이 태어난 년도는? ");
		int year = scan.nextInt();
		System.out.print("당신의 관심과목은? ");
		String sub = scan.next();
		System.out.println("-------------------");
		
		System.out.printf("%s님은 %d살이고, %s에 관심있습니다.",name,2019-year+1,sub);
		scan.close();
		
	}

}
