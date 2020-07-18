package exceptionHandling;

public class FinallyKeyword {

	public static void main(String[] args) {
		try {
			System.out.println("Disconnect the machine from internet");
			System.out.println("Verify that XXXXXXX message is displayed");
			System.out.println(10/0);
			//System.out.println("Connect the machine to the internet");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			//System.out.println("Connect the machine to the internet");
		}finally {
			System.out.println("Connect the machine to the internet");
		}

	}

}
