package control;

public class CycleRegtangle {

	public static void main(String[] args) {
		int r = 12, width = 11, height = 22;
		float pi = 3.14f;
		
		System.out.println("==========================");
		System.out.printf("반지름이 %d인 원의 면적은... %.2f\n",r,pi*r*r);
		System.out.printf("가로가 %d, 세로가 %d인 직사각형의 면적은 : %d\n",width,height,width*height);
		System.out.printf("가로 세로가 같은가요? %b\n",width==height);
		System.out.printf("반지름이 10보다 큰가요? %b\n",r>10);
	}

}
