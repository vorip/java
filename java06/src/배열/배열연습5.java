package 배열;

public class 배열연습5 {

	public static void main(String[] args) {
		float[] eye = {1.2f,0.4f,0.5f,0.7f,1.0f};
		char[] gender = {'M','F','M','F','M'};
		char[] grade = {'A','B','C','D','F'};
		String[] name = {"hong","choi","kim","park","cho"};
		int[] point = {90,80,70,60,50};
		
		for(int i=0;i<eye.length;i++) {
			System.out.printf("%s의 시력 : ",name[i]);
			System.out.printf("%.1f ",eye[i]);
		}
		System.out.println();
		for(int i=0;i<gender.length;i++) {
			System.out.printf("%s의 성별 : ",name[i]);
			System.out.printf("%3c ",gender[i]);
		}
		System.out.println();
		for(int i=0;i<grade.length;i++) {
			System.out.printf("%s의 학점 : ",name[i]);
			System.out.printf("%3c ",grade[i]);
		}
		System.out.println();
		for(int i=0;i<point.length;i++) {
			System.out.printf("%s의 점수 : ",name[i]);
			System.out.printf("%3d ",point[i]);
		}
		System.out.println();
	}

}
