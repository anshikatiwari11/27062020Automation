//Find the greatest number in a array.
package assignments1Programs07072020;

public class Problem8 {

	public static void main(String[] args) {
		int [] arr = {6, 8, 10, 4, 5};
		int max = arr[0];
		for(int i=1; i<arr.length;i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
	  System.out.println("Largest Number is:" +max);
	}
}
