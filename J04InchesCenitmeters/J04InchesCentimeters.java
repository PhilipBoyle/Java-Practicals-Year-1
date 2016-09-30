// J04InchesCentimeters - Philip Boyle - G00325728 - 18/09/2014
// Convert Inches to Centimetes

import java.util.Scanner;

public class J04InchesCentimeters
{
	public static void main(String[] args )
	{

		Scanner console = new Scanner(System.in);

		final double INCHEStoCM = 2.54;
		double inches, cm;

		System.out.println();
		System.out.print("Please enter the inches value: ");
		inches = console.nextDouble();
		System.out.println();

		cm = inches*INCHEStoCM;

		System.out.println("CM = " +cm);
		System.out.println();

		System.out.println();
		System.out.print("Please enter the CM value: ");
		cm = console.nextDouble();
		System.out.println();

		inches = cm/INCHEStoCM;

		System.out.println("Inches = " +inches);
		System.out.println();



	}  // main

} // J04InchesCentimeters