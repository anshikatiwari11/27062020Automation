package functions;

public class Function2 {
	public static String name="Anshika";

	public static void main(String[] args) {
		/*sum(10,20);
		sum(20,30);
		sum(40,50);
		sum(10,20,30);
		message("Anshika");
		eligibility("Anshika", 28);
		eligibility("abc", 17);*/
		
		System.out.println(name);
		}
	public static void sum(int a, int b)
	{
		System.out.println(a+b);
	}
	
	public static void sum(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	public static void message(String name)
	{
		System.out.println("Welcome "+name);
}
	public static void eligibility(String name, int age)
	{
		if(name == "Anshika" && age >=18)
		{
			System.out.println("Anshika, you are eligible");
		}
		else {
			System.out.println("abc, you are not eligible");
		}
		
	}
}


