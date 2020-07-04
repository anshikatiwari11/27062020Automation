package array;

public class Array1 {

	public static void main(String[] args) {
		// String name= "Anshika";
		// String name= "Pooja";
		// String name= "Sneha";

		String[] std = new String[10];
		std[0] = "Anshika";
		std[1] = "Pooja";
		std[2] = "Sneha";
		std[3] = "Itishree";
		std[4] = "Neha";
		std[5] = "Aanchal";
		std[6] = "Ankita";
		std[7] = "Anshika";
		std[8] = "Mohit";
		std[9] = "Manju";

		System.out.println(std[5]);
		System.out.println(std[0]);
		System.out.println(std[9]);

		System.out.println(std.length);

		for (int i = 0; i < std.length; i++) {
			System.out.println(std[i]);
		}
	}

}
