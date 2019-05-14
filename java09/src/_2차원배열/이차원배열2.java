package _2차원배열;

public class 이차원배열2 {
	public static void main(String[] args) {
		int[][] clasS = {{44,55,66},{77,88,99,100}};
		int sum=0;
		for(int i=0;i<clasS.length;i++) {
			sum =0;
			for(int j=0;j<clasS[i].length;j++) {
				sum+=clasS[i][j];
			}
			System.out.printf("%d반의 평균은 : %d\n",i+1,sum/clasS[i].length);
		}
	}

}
