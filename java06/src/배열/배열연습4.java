package 배열;

public class 배열연습4 {
	public static void main(String[] args) {
		int[] num1 = {1,2,3};
		int[] num2 = num1;
		int n1 = num1[0];
		num1[0] = num1[2];
		num1[2] = n1;
		System.out.print(num1[0] + " ");
		System.out.println(num1[2]);
		for (int i = 0; i < num2.length; i++) {
			System.out.print(num2[i]+" ");
		}
		
	}

}
