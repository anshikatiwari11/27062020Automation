package assignment2OOP07072020;

public class Problem2 {

	public static void main(String[] args) {
		    //Reference   //object
		    AB a =         new AB();
			BA b =         new BA();
			a.parentMeth();
//			a.childMeth();
			b.childMeth();
			a.parentMeth();
			}
			}
			class AB{
			public void parentMeth(){
			}
			}
			class BA extends AB{
			public void childMeth(){
			}
			}

			
//Error. Parent object can't access child property.

