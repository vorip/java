package java22;

public class ForTest2 extends Thread{
	
	@Override
	public void run() {//동시에 처리되게 하고 싶은 내용을 이 메소드에 구현
		for(int i =0;i<1000;i++) {
			System.out.println("스레드2---------------------");
		}
		
	}

}
