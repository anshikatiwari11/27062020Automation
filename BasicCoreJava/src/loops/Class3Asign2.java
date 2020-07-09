package loops;

public class Class3Asign2 {

	public static void main(String[] args) {
		//1 2 3 4 5
		//1 2 3 4
		//1 2 3
		//1 2
		//1
		
		for (int rows=5; rows>=1; rows--)
		{
			for (int cols=1; cols<=rows; cols++)
			{
				System.out.print(cols+" ");
					
			}
			System.out.println();
		}
	}

}
