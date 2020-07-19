package stringClass;

public class Assignment {

	public static void main(String[] args) {
		// How many "a" were present in the name "anand".
		String name = "Anand";
		// System.out.println(name.length());
		int repeat = 0;
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == 'a' || name.charAt(i) == 'A')
				repeat = repeat + 1;
		}
		System.out.println(repeat);
	}
}


