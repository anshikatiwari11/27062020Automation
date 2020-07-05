package functions;

public class CallVariables {

	public static void main(String[] args) {
		/*//System.out.println(Variables.name);
		
		Variables ref= new Variables();
		//System.out.println(ref.name2);
		
		Variables.name= "Anshika";
		//Change the values
		ref.name="Anand";
		ref.name2="Anshi";
		//Create a new object
		Variables ref2= new Variables();
		
		//Call all the variables again
		System.out.println(ref2.name);
		System.out.println(ref.name);
		System.out.println(ref2.name2);
		System.out.println(ref.name2);*/
		
		Variables def= new Variables();
		Variables.name= "Mohit";
		//Change the values
		def.name="xxxx";
		def.name2="yyyy";
		//Create a new object
		Variables def2= new Variables();
		
		//Call all the variables again
		System.out.println(def2.name);
		System.out.println(def.name);
		System.out.println(def2.name2);
		System.out.println(def.name2);
	}
}
