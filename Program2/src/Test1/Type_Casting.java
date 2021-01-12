package Test1;

public class Type_Casting {

	
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		
		//Type_Casting: Type casting is when you assign a value of one primitive data type to another type 
		
		
		int ankur = 16;
		double hajar = ankur;
		System.out.println(ankur);
		System.out.println(hajar);	
	
	
	//Widening casting  -> Automatically -> Byte -> short -> short>int>long>float>double	
	//Narrowing casting -> Manually -> converting a larger type to a smaller type -> double->float>long>int>char>short>byte 
	
		
		int ankur1 = (int) hajar;
		double hajar1 = 6.78;	
		System.out.println(ankur1);
		System.out.println(hajar1);
	
	}
}
