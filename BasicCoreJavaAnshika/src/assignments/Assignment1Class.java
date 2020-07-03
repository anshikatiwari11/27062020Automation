//Data Types: There are two types of data types –
//1.Primitive data types: The primitive data types include boolean, char, byte, short, 
// , int, long, float and double.

//1.1Boolean Data Type
//The Boolean data type is used to store only two possible values: true and false. 
//This data type is used for simple flags that track true/false conditions.
//The Boolean data type specifies one bit of information, but its "size" 
//can't be defined precisely.
//Example: Boolean one = false

//1.2Byte Data Type
//The byte data type is an example of primitive data type. 
//It isan 8-bit signed two's complement integer. 
//Its value-range lies between -128 to 127 (inclusive). 
//Its minimum value is -128 and maximum value is 127. Its default value is 0.
//The byte data type is used to save memory in large arrays where the memory savings is most required. 
//It saves space because a byte is 4 times smaller than an integer. It can also be used in place of "int" data type.
//Example: byte a = 10, byte b = -20

//1.3 Short Data Type
//The short data type is a 16-bit signed two's complement integer. 
//Its value-range lies between -32,768 to 32,767 (inclusive). 
//Its minimum value is -32,768 and maximum value is 32,767. Its default value is 0.
//The short data type can also be used to save memory just like byte data type. 
//A short data type is 2 times smaller than an integer.
//Example: short s = 10000, short r = -5000

//1.4 Int Data Type
//The int data type is a 32-bit signed two's complement integer. 
//Its value-range lies between - 2,147,483,648 (-2^31) to 2,147,483,647 (2^31 -1) (inclusive). 
//Its minimum value is - 2,147,483,648and maximum value is 2,147,483,647. Its default value is 0.
//The int data type is generally used as a default data type for integral values unless if there is no problem about memory.
//Example: int a = 100000, int b = -200000

//1.5 Long Data Type
//The long data type is a 64-bit two's complement integer. 
//Its value-range lies between -9,223,372,036,854,775,808(-2^63) to 9,223,372,036,854,775,807(2^63 -1)(inclusive). 
//Its minimum value is - 9,223,372,036,854,775,808and maximum value is 9,223,372,036,854,775,807. 
//Its default value is 0. The long data type is used when you need a range of values more than those provided by int.
//Example: long a = 100000L, long b = -200000L

//1.6 Float Data Type
//The float data type is a single-precision 32-bit IEEE 754 floating point.
//Its value range is unlimited. It is recommended to use a float (instead of double) if you need to save memory in large arrays of floating point numbers. 
//The float data type should never be used for precise values, such as currency. Its default value is 0.0F.
//Example: float f1 = 234.5f

//1.7Double Data Type
//The double data type is a double-precision 64-bit IEEE 754 floating point. 
//Its value range is unlimited. The double data type is generally used for decimal values just like float. 
//The double data type also should never be used for precise values, such as currency. Its default value is 0.0d.
//Example: double d1 = 12.3

//1.8Char Data Type
//The char data type is a single 16-bit Unicode character. 
//Its value-range lies between '\u0000' (or 0) to '\uffff' (or 65,535 inclusive).
//The char data type is used to store characters.
//Example: char letterA = 'A'



//2.Non-primitive data types: The non-primitive data types include Classes, Interfaces, 
//and Arrays.

//*Variable: A variable is a memory address that can change and when memory address cannot change then it is known as constant. 
//Variable is a name of the memory location where data is stored. Once a variable is stored then space is allocated in memory. 
//It defines a variable using a combination of numbers, letters and the underscore character.
//There are three types of variables: Local, Instance and Static
//1.Local Variable: A variable we declared inside of method called as Local variable.
//2.Instance Variable: A variable we declared inside of class but outside of method is called instance variable. 
//It is not declared as static.
//3.Static Variable: A variable that we declared as static is called static variable. 
//It cannot be local.




package assignments;

public class Assignment1Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
	}

}
