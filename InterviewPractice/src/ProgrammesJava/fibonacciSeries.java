package ProgrammesJava;

import java.util.Scanner;

public class fibonacciSeries {

	public static void main(String[] args) {
		//input to print Fibonacci series upto how many numbers 
		System.out.println("Enter number upto which Fibonacci series to print: "); 
		int number = new Scanner(System.in).nextInt(); 
		
		
		System.out.println("Fibonacci series upto " + number +" numbers : "); 
		
		//printing Fibonacci series upto number 
		for(int i=1; i<=number; i++)
		{ 
			System.out.print(fibonacci2(i) +" "); 	
	    }
}
	}
