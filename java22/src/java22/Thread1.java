package java22;

public class Thread1 extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=100;i++) {
			System.out.println("증가 : "+i);
		}
	}

}
