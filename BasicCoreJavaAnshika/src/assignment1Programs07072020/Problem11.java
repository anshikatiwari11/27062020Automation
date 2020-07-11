//What will be the output of following program.
package assignment1Programs07072020;

public class Problem11 {
	public static void main(String[] args) {
		int i=2;
		f1(i);
		}
	public static void f1(int i)
	{
		f2(i+1); //2+1=3
		}
	public static void f2(int i)
	{
		f3(i+2);  //3+2=5
		}
	public static void f3(int i)
	{
		System.out.println(i+3);  //5+3=8
		}
}

