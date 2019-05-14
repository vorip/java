package 배열;


public class 스트링배열 {

	public static void main(String[] args) {
		int[] ages = {50, 100, 10};
		String[] names = {"홍길동","박길동","김길동"};
		names[2] = "김동길";
		names[names.length-1] = "김동순";
		System.out.print("ages = { ");
		for(int i = 0; i<ages.length; i++) {
			System.out.print(ages[i]+" ");
		}
		System.out.print("}\nnames = { ");
		for(int i = 0; i<names.length; i++) {
			System.out.print(names[i]+" ");
		}
		System.out.print("}\n{ ");
		for(int age : ages) {
			System.out.print(age+" ");
		}
		System.out.print("}\n{ ");
		for (String name : names) {		//인덱스 활용 불가능
			System.out.print(name+" ");
		}
		System.out.println("}");
	}

}
