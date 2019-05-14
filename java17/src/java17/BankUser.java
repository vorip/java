package java17;

public class BankUser {

	public static void main(String[] args) {
		GoodBank gBank = new GoodBank();
		BadBank bBank = new BadBank();
		NomalBank nBank = new NomalBank();
		
		bBank.setBankName("BadBank");
		bBank.setInterestRate(10.0);
		
		gBank.setBankName("GoodBank");
		gBank.setInterestRate(3.0);
		
		nBank.setBankName("NomalBank");
		nBank.setInterestRate(5.0);
		
		System.out.printf("%s의 이자율 : %.1f\n%s의 이자율 : %.1f\n%s의 이자율 : %.1f",
				bBank.getBankName(),bBank.getInterestRate(),
				nBank.getBankName(),nBank.getInterestRate(),
				gBank.getBankName(),gBank.getInterestRate());
		
	}

}
