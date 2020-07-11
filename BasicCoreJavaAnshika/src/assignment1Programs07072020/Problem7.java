//Print alternate elements of String array.
package assignment1Programs07072020;

public class Problem7 {

	public static void main(String[] args) {
		String [] arr = {"a", "b", "c", "d", "e"};
		System.out.println("Alternate Elements: ");
		for (int i=0; i<5; i=i+2)     //for (int i=0; i<arr.length; i=i+2) [For complete array]
		{  
            System.out.println(arr[i]);  
        }  
	}
}
