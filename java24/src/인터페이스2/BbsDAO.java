package 인터페이스2;

import java.util.ArrayList;

public class BbsDAO implements BbsInterface {

	@Override
	public void insert(BbsDTO dto) {
		System.out.println("insert!");
	}

	@Override
	public BbsDTO select(String id) {
		BbsDTO dto = new BbsDTO();
		System.out.println("select!");
		return dto;
	}

	@Override
	public void delete(String id) {
		System.out.println("delete!");
	}

	@Override
	public void update(BbsDTO dto) {
		System.out.println("update!");
	}

	@Override
	public ArrayList selectAll() {
		ArrayList list = new ArrayList();
		System.out.println("selectAll!");
		return list;
	}

}
