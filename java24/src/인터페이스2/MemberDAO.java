package 인터페이스2;

public class MemberDAO implements MemberInterface{

	public void insert(MemberDTO dto) {
		System.out.println(("회원가입"));
	}

	public void delete(String id) {
		System.out.println("회원탈퇴");
	}

	public void update(MemberDTO dto) {
		System.out.println("회원 수정");
	}

	public MemberDTO select(String id) {
		MemberDTO dto = new MemberDTO("park", "park", "park", "park");
		return dto;
	}

}
