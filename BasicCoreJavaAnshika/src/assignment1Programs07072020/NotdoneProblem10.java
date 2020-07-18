//Suppose there is an integer array holding following elements:
//1,3,4,5,6,3,2,4,6,7,9,4,12,3,4,6,8,9,7,6,43,2,4,7,7,5,2,1,3,4,6,311,1
//Write a program which prints which each number from array and the times it has been repeated in array
//for eg.1- Repeated 3 times
//4- Repeated 6 times

package assignment1Programs07072020;

public class NotdoneProblem10 {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 4, 5, 6, 3, 2, 4, 6, 7, 9, 4, 12, 3, 4, 6, 8, 9, 7, 6, 43, 2, 4, 7, 7, 5, 2, 1, 3, 4, 6,
				311, 1 };
		for (int i = 0; i < arr.length; i++) {
			int a = arr[i];
			int occurrence = 1;
			for (int j = i + 1; j < arr.length; j++) {

				if ((arr[i] == arr[j]) && (i != j)) {

					occurrence = occurrence + 1;
				}

			}

			System.out.println(arr[i] + " Repeated " + occurrence + " Times.");
		}

	}

}
