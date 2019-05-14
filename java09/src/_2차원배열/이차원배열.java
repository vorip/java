package _2차원배열;

public class 이차원배열 {

	public static void main(String[] args) {
		//배열을 만들 때
		//- 초기값을 지정하지 않는 경우
//		int[][] seat = new int[3][10];

		//- 초기값을 지정하는 경우
		int[][] num = { {1,2},{4,5,6} };
		System.out.println(num[0][1]+"\n" +num[1][2]);//2와6을출력
		System.out.printf("배열의 개수 : %d\n",num.length);
		System.out.println("배열 0행의 열개수: "+num[0].length);
		System.out.println("배열 1행의 열개수: "+num[1].length);
		for(int i=0;i<num.length;i++) {
			System.out.print("{ ");
			for(int j=0;j<num[i].length;j++) {
				System.out.print(num[i][j]+" ");
			}
			System.out.println("}");
		}
		
	}

}
