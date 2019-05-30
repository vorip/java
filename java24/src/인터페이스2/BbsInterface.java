package 인터페이스2;

import java.util.ArrayList;

public interface BbsInterface {
	void insert(BbsDTO dto);
	BbsDTO select(String id);
	void delete(String id);
	void update(BbsDTO dto);
	ArrayList selectAll();
}
