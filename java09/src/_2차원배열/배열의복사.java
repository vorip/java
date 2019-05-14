package _2차원배열;

public class 배열의복사 {

	public static void main(String[] args) {
		int[] num = {1,2,3}; //배열(참조,주소)
		int num2 = 100;//정수(기본,값)
		
		int num3 = num2;
		num2++;
		System.out.println(num2);
		System.out.println(num3);//원본이 변해도값이 변하지 않음
		
		//배열의 복사(참조, 참조형변수)
		int[] num4 = num;
		num[0]++;
		System.out.println(num[0]);
		System.out.println(num4[0]);//원본이 변하면 값이 변함
		
		System.out.println("-------------");
		int[] num5 = num.clone();
		num[0]++;
		System.out.println(num5[0]);
		System.out.println(num[0]);
		
	}

}
