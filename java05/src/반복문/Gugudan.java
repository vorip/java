package 반복문;

public class Gugudan {

	public static void main(String[] args) {
		for(int i = 1; i<=9;i++) {
			for(int j =2;j<=9;j++) {
				System.out.printf("%d X %d = %2d ",j,i,i*j);
			}
			System.out.println();
		}
	
	}
}
