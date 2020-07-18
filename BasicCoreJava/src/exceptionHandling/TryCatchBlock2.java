package exceptionHandling;

public class TryCatchBlock2 {

	public static Functions fun;

	public static void main(String[] args) {
		// Step 1: Click on the download link
		try {
			int a = 10;
			int b = 1;
			System.out.println(a / b);

			// Step 2: Click on latest version
			String[] str = new String[2];
			str[1] = "Anshika";

			// Step 3: Verify Something
			fun.fun1();
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException Occured : " + e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException Occured : " + e.getMessage());
		} catch (NullPointerException e) {
			System.out.println("NullPointerException Occured : " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unknown Exception Occured : " + e.getMessage());
		}
	}
}
