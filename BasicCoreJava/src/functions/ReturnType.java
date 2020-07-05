package functions;

public class ReturnType {

	public static void main(String[] args) {
		int add=sum(10,20);
		System.out.println(add);
		boolean c=eligible(10);
				
	}
	
	public static int sum(int a, int b)
	{
		return a+b;
	}
	
	public static boolean eligible(int age)
	{
		if(age>=10)
		{
			System.out.println("You are eligible");
			return true;
		}else {
			System.out.println("You are not eligible");
			return false;
		}
	}

}
