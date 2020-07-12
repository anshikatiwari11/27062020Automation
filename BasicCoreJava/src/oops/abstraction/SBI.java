package oops.abstraction;

public class SBI implements RBI{

	@Override
	public void savingAccount() {
		System.out.println("SBI saving Account");
		
	}

	@Override
	public void currentAccount() {
		System.out.println("SBI current Account");
		
	}

	@Override
	public void debitCard() {
		System.out.println("SBI debit card");
		
	}

	@Override
	public void creditCard() {
		System.out.println("SBI credit card");
		
	}

}