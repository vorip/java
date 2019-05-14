package 배열;

public class ArrayTest2 {

	public static void main(String[] args) {
		int[] s = new int[5];
		for(int i=0;i<s.length;i++) {
			s[i]=100+i;
		}
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
		System.out.println("=======================");
		for(int i:s) {
			System.out.println(i);
		}
		
		
	}

}
