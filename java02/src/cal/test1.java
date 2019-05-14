package cal;

public class test1 {

	public static void main(String[] args) {
		
		int num1 = 200;
		int num2 = 100;
		int result = num1+num2;
		
		if(result >300) {
			System.out.println(result-100);
		}else {
			System.out.println(result*0.1);
		}
		
		int num3 = 400;
		int result2 = num3%2;
		
		if(result2 == 0) {
			System.out.println(num3 + "은 짝수입니다.");
		}else {
			System.out.println(num3 + "은  홀수입니다.");
		}
		
		System.out.println("-------삼항연산자------");
		
		System.out.println(result2 == 0 ? "짝수" : "홀수");
		
		
		
	}

}
