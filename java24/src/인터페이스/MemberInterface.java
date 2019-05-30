package 인터페이스;

public interface MemberInterface {
	// 일반변수 사용불가, 일반메소드 사용 불가.

	
	
	// 상수 사용 가능
	// 강제성있는 기능을 정의 : 추상 메소드
	// 추상적<-> 구체적
	// 불완전하다.
	// 객체를 생성하여 쓸 수 없다.
	public abstract void insert(MemberDTO dto);//기본적으로 접근제한자가 public abstract
	void delete(String id);
	void update(MemberDTO dto);
	MemberDTO select(String id);
	
}
