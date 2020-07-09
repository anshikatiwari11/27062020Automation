package loops;

public class Asign3 {

	public static void main(String[] args) {
		// 1
		// 1 2 
		// 1 2 3
		// 1 2 3 4 
		// 1 2 3 4 5

		for (int rows=1; rows<=5; rows++)
		{
			for (int cols=1; cols<=rows; cols++)
			{
				
				System.out.print(cols+" ");
			
			}
			System.out.println();
		}
	}

}