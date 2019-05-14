package java19;

public class MemberDTO {
		private String id;
		private String pw;
		private String name;
		private String tel;
		@Override
		public String toString() {
			return "MemberDTO [id=" + id + ", pw=" + pw + ", name=" + name + ", tel=" + tel + "]";
		}
		public MemberDTO(String id, String pw, String name, String tel) {
			this.id = id;
			this.pw = pw;
			this.name = name;
			this.tel = tel;
		}

}
