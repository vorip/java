package 인터페이스2;

public interface MemberInterface {

	void insert(MemberDTO dto);
	void delete(String id);
	void update(MemberDTO dto);
	MemberDTO select(String id);
}
