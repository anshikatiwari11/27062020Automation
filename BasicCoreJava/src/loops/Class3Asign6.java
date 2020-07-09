package loops;

public class Class3Asign6 {

	public static void main(String[] args) {
		// Create an array to store fruits name
		// Create an array to store prices
		// Create an array to store excel values (10X5)
		
		//For read 
		
		String fruits [] = {"Mango","Apple","Banana", "Orange","Grapes" };
		double price [] = {23.45,123.67,234.56};
		
		for(String fruit: fruits)
		{
			System.out.println(fruit);
		}
		String [][] excelvalue = new String [10][5];
		for(int i =0 ; i<=2; i ++)
			System.out.println(fruits[i]);
		System.out.println("Demo of enhanced for loop");
		for(double name : price)
			System.out.println(name);

	}

}


