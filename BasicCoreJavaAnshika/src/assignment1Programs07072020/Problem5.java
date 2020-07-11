//Write program to display following output
//1
//12
//1234
//12345
//123456
//1234567

package assignment1Programs07072020;

public class Problem5 {

	public static void main(String[] args) {
		for (int rows=1; rows<=7; rows++)
		{
			for (int cols=1; cols<=rows; cols++)
			{
				System.out.print(cols+" ");
			}
			System.out.println();
		}
		/*for (int rows2=6; rows2>=1; rows2--)
			{
				for (int cols=1; cols<=rows2; cols++)
				{
					System.out.print(cols+" ");
				}
			System.out.println();
		}*/
	}
}
