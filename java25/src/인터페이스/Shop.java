package 인터페이스;

public class Shop implements Pay, Circle {

	@Override
	public void size() {
		System.out.println("가게의 문을 동그랗게 할 예정");
	}

	@Override
	public void 반지름을구하다() {
		System.out.println("hi");
	}

	@Override
	public void 계산하다() {
		System.out.println("hellos");
	}

}
