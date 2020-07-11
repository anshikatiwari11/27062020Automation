package oops.polymorphism;
import oops.inheritance.Mobile;
import oops.inheritance.SmartPhone;
import oops.inheritance.Telephone;

public class DynamicPolymorphism {

	public static void main(String[] args) {
		Telephone obj4=null; 
		String browserName="Chrome";
		if(browserName.equals("Chrome")) 
		{
		obj4= new Mobile(); //ChromeDriver
		} else if(browserName.equals("Firefox"))
		{
		obj4= new SmartPhone();
		}
		obj4.calling();
		/*//Reference          //Object
	
		Telephone obj4= new Mobile();
	//	SmartPhone obj5= new Mobile(); (Not possible because we can't use ref. of child class for the object of parent class)
        obj4.calling(); //Here texting of mobile not comes.*/
	}

}
