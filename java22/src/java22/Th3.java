package java22;

public class Th3 extends Thread{

	@Override
	public void run() {
		for(int i =0;i<10;i++) {
			System.out.print("♩");
		}
	}

}
