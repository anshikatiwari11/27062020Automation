//Write a for loop which prints numbers from 1 to 100 but if the number is divisible by 5, 
//it prints 'divisible by 5 followed by that number'
package assignments1Programs07072020;

public class Problem3 {

	public static void main(String[] args) {
		int i;
		
		for(i=1; i<=100; i++)
		{
			if(i%5==0)
				System.out.println(i+":"+ "Divisible by 5");	
			else
			{
				System.out.println(i);
			}
		}
	}
}
