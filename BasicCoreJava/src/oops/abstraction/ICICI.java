package oops.abstraction;

public class ICICI implements RBI{

	@Override
	public void savingAccount() {
		System.out.println("ICICI saving Account");
	
	}

	@Override
	public void currentAccount() {
		System.out.println("ICICI current Account");
		
	}

	@Override
	public void debitCard() {
		System.out.println("ICICI debit card");
		
	}

	@Override
	public void creditCard() {
		System.out.println("ICICI credit card");
		
	}

}