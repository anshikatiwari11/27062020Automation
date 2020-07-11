//Find the least number in a array.
package assignment1Programs07072020;

public class Problem9 {

	public static void main(String[] args) {
		int [] arr = {6, 8, 10, 4, 5};
		int min = arr[0];
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i] < min)
			{
				min = arr[i];
			}
		}
	  System.out.println("Least Number is:" +min);
	}
}
