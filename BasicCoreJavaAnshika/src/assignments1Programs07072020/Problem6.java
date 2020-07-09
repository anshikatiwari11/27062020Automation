//Make an integer array. 
//Write a for loop to print the integer array in reverse.
package assignments1Programs07072020;

public class Problem6 {

	public static void main(String[] args) {
		int [] arr = {1, 2, 3, 4, 5};
		System.out.println("Original array: "); 
		for(int i=0; i<5; i++) //for(int i=0; i<arr.length; i++) [For complete array]
		{
			System.out.print(arr[i] + " ");  
		}
		System.out.println(); 
		System.out.println("Reverse array: ");  
		for(int i=4; i>=0; i--) //for(int i=arr.length-1; i>=0; i--) [For complete array]
		{
			System.out.print(arr[i] + " ");  
		}
	}

}
