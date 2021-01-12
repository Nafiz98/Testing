package Test1;

import java.util.Scanner;


public class Classic_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//=> Print the number of years and days from minutes
		
		double minuteInYear = 60 * 24 * 365;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input the number of minutes: ");
		
		
		double min  = input.nextDouble();
		
		long years = (long)(min/minuteInYear);
		
		int days = (int)(min/ 60/ 24)%365;
		
		System.out.println((int) min + " minutes is " + years + " years and " + days + " days ");
		
	}

}
