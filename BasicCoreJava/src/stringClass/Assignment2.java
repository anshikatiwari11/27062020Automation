package stringClass;

public class Assignment2 {

	public static void main(String[] args) {
		String name = "anshika";
		String[] arr= name.split("");
		System.out.println(arr.length);
		int count=0;
		for(String c:arr)
		{
			if(c.contentEquals("a"))
				count++;
		}
		System.out.println("Total number of a= "+ count);
	}

}
