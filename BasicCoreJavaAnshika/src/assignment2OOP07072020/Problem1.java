package assignment2OOP07072020;

public class Problem1 {

	public static void main(String[] args) {
		//Reference   //object
		A a =         new A();
		B b =         new B();
		System.out.println(a.x);
//		System.out.println(a.y);
		System.out.println(b.x);
		System.out.println(b.y);
		}
		}
		class A{
		String x="Parent";
		}
		class B extends A{
		String y="Child";
		}

//Here parent can't access the properties of child. thats why error coming.
