package java19;

public class member {

		String name;
		int age;
		char gender;
		String addr;
		String tel;
		
		public member(String name, int age, char gender, String addr, String tel) {
			this.name = name;
			this.age = age;
			this.gender = gender;
			this.addr = addr;
			this.tel = tel;
		}

		@Override
		public String toString() {
			return "member [name=" + name + ", age=" + age + ", gender=" + gender + ", addr=" + addr + ", tel=" + tel
					+ "]";
		}
		
		
		
		
		

}
