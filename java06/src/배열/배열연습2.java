package 배열;

public class 배열연습2 {
	public static void main(String[] args) {
		int[] l1 = {44,66,22,88};
		int cnt = 0;
		System.out.print("{");
		for(int i=0;i<l1.length;i++) {
			System.out.print(l1[i]);				
			if(i<3) {
				System.out.print(", ");
			}else {
				System.out.println("}");
			}
			cnt++;
		}
		System.out.println("리스트에 들어있는 값들의 개수 : " + cnt);
		l1[0] = 55;
		System.out.print("{");
		for(int i=0;i<l1.length;i++) {
			System.out.print(l1[i]);				
			if(i<3) {
				System.out.print(", ");
			}else {
				System.out.println("}");				
			}
		}
	}

}
