package oops.abstraction;

public class BankUser {

	public static void main(String[] args) {
		account(new SBI());//SBI= Chrome
		account(new HDFC());//HDFC= Firefox
		account(new ICICI());//ICICI= Edge
	}
	public static void account(RBI bank)//RBI==WebDriver
	{
		bank.creditCard();//Navigate 
		bank.debitCard(); //Click
		bank.savingAccount(); //Enter Data
		bank.currentAccount(); //Select Option
		}
}

/*
     public static void sum(int a)
        {
    	 System.out.println(10+a);
        }
     public static void message(String name)
        {
	System.out.println("Your Name is "+name);
        }*/