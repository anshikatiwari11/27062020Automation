package Statements;

public class ifelseStatementsLogicalOperators {

	public static void main(String[] args) {
		//And operator
		int age=25;
		boolean voterID=true;
		
		if(age>=18 && voterID)
		{
			System.out.println("You are eligible");
		}
			else {
				System.out.println("You are not eligible");
			}
		//OR operator
		
		boolean pancard=true;
		boolean aadharcard=false;
		if(pancard || aadharcard)
		{
			System.out.println("You are eligible");
		}else {
			System.out.println("You are not eligible");
		}
	}

}
