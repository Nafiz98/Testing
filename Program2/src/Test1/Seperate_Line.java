package Test1;
import java.util.Scanner;

public class Seperate_Line {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		
		
		System.out.println("Hello \nAnkur");
		
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Input your first name:");
		String fname = input.next();
		
		System.out.print("Input your last name:");
		String lname = input.next();
		
		System.out.println();
		System.out.println("Hello \n" + fname+""+lname);
		
	}
}