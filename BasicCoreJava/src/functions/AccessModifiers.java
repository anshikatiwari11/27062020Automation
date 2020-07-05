package functions;

public class AccessModifiers {

	public static void main(String[] args) {
	}
	public void publicFunction()
	{
		AccessModifiers obj= new AccessModifiers();
		obj.publicFunction();
		obj.privateFunction();
		obj.defaultFunction();
		obj.protectedFunction();
	}
	private void privateFunction()
	{
		AccessModifiers obj= new AccessModifiers();
		
	}
	void defaultFunction()
	{
	
	}
	protected void protectedFunction()
	{
	}

}
