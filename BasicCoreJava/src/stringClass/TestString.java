package stringClass;

public class TestString {

	public static void main(String[] args) {
		String str="Selenium";
		//1st Function- Length
		System.out.println(str.length());
		
		//2nd Function- CharAt
		char c= str.charAt(3);
		System.out.println(c);
		
		//3rd Function- toUpperCase
		System.out.println(str.toUpperCase());
		
		//4th Function- toLowerCase
		System.out.println(str.toLowerCase());
		
		//5th Function- Replace
		System.out.println(str.replace("len", "123"));
		
		//6th Function- Substring
		System.out.println(str.substring(4));
		
		//7th Function- Substring
		System.out.println(str.substring(2, 5)); //it doesn't includes the last index value i.e, 5th index here.
		
		//8th Function- Split
		String[] arr=str.split("len");
		System.out.println(arr.length);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		//9th Function- Equals
		String str2="selenium";
		System.out.println(str.equals(str2));
		
		//10th Function- EqualIgnoreCase
		System.out.println(str.equalsIgnoreCase(str2));
		
		}

}
