// JdemoIO - Philip Boyle - G00325728 - 18/09/2014
// Convert Farenheit to Celsius

import java.util.Scanner;

public class J03FarenheitCelsius
{
	public static void main(String[] args )
	{

		Scanner console = new Scanner(System.in);

		double fah, cel;

		System.out.println();
		System.out.print("Enter Farenheit Value: ");
		fah = console.nextDouble();
		System.out.println();

		 cel = (fah-32)*5/9;

		System.out.println("If the Farenheit is: " +fah + "f, " + "then the Celsius is: " +cel + "c");

		System.out.println();
		System.out.print("Enter Celsius Value: ");
		cel = console.nextDouble();
		System.out.println();

	    fah = (cel*9/5)+32;
	    System.out.println("If the Celsius is: " +cel + "c, " + "then the Farenheit is: " +fah + "f");


	 }  // main

} //J03FarenheitCelsius