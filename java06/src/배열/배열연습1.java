package 배열;

public class 배열연습1 {

	public static void main(String[] args) {
		String[] names = {"hong","choi","kim"};
		System.out.println(names);
		System.out.println(names[0]);
		//위치값을 가지고 배열에 들어있는 값들을 구분
		//위치값=index(인덱스), 0부터 시작
		System.out.println(names[2]);
		
		for(int i=0;i<3;i++) {
			System.out.println(names[i]);
		}
	}

}
