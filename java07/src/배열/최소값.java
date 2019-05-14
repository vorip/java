package 배열;

public class 최소값 {
	public static void main(String[] args) {
		int[] num = {66,77,88,99};
		int min = num[0];
		
		for(int i=0;i<num.length;i++) {
			if(num[i]<min) {
				min = num[i];
			}
		}
		System.out.println(min);
	}

}
