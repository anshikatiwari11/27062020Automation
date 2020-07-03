



//Nested If Statement
//It contains multiple if else condition. It is used to check the multiple conditions. 
//This statement is like executing an if statement inside an else statement.

package assignments;

public class Assignment4Nestedif {

	public static void main(String[] args) {
		int i = 20;
		int j = 10;
		if ( i < 30 ){
		System.out.println("Value of i is less than 30");
		if ( j == 10 ){
		System.out.println("Value of j is equal to 10");
		}
		}
		else
		{
		System.out.println("Value of i is not less than 30");
		}
	}
}