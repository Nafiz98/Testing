package Test1;

public class Primitive_Data_Types {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		
	/* types of data types:
		1. int
		2. float
		3. char
		4. boolean
		5. string
		6. byte- data type can store whole numbers from -128 to 127
			you can use byte instead of int
		7. short- data type can store whole numbers from -32768 to 32767
		
These data types are divided into two groups, primitive & non-primitive 
	*/
		
		
	//byte
		byte a = 100;
		System.out.println(a);
		
	//short
		short b = 32000;
		System.out.println(b);
		
	//long
		long c = 150000000000000L;
		System.out.println(c);
		
	//Float
		
		//We normally use floating point type whenever we need a number with a decimal such as
		//9.99 or 3.14
		//float data type store fractional numbers from 3.4e-038 to 3.4e+038
		//Note: float will end with "f"
	
		float d = 5.75f;
		System.out.println(d);
		
		
	//Double -  can store fractional numbers from 1.7e-308 to 1.7e+308,
		//Please add d in the end
		
		
		double e=19.99d;
		System.out.println(e);
		
		
		
		//Scientific Numbers
		
		
		float f1=35e3f;
		double d1=12E4d;
		
		
		System.out.println(f1);
		System.out.println(d1);
		
		
	//Char - used to store a single character, the character must be surrounded by single quotes	
		
		char bb='A';
		System.out.println(bb);
		
	
	
	//String - used to store a sequence of character - text.
		
		String ank = "Ankur Jain"; 
		System.out.println(ank);
		
		
		
	//Booleans - declared with the keyword --> true and false 	
		
		boolean isJavaFun = true;
		boolean isJavaNotFun = false;
		
		System.out.println(isJavaFun);
		System.out.println(isJavaNotFun);
		
		
		
	//Interview Points:
		
	//1. Primitive type always has a value, non-primitive type can be null
	//2. Primitive type always starts with a lower case letter while non starts with an upper case letter
	//3. Size of primitive depends on data type. non will all be the same size	
		
	//Examples of Non-Primitive types are --> String, Array, Class, Interface etc..
		
	}
}
	
