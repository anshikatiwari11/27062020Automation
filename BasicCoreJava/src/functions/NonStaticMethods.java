package functions;

public class NonStaticMethods {
	
	public String name="Anand";
	
	

	public static void main(String[] args) {
		//Reference            //Object
		NonStaticMethods obj= new NonStaticMethods();
		System.out.println(obj.name);
	}
}
