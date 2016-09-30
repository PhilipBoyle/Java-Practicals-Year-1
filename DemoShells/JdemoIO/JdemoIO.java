// JdemoIO - Philip Boyle - G00325728
// Demo Java input from keyboard & Output to monitor

import java.util.Scanner;

public class JdemoIO
{
	public static void main(String[] args )
	{
		// Constants & Variables here

		Scanner console = new Scanner(System.in);

		int myInt;
		double myDouble;

		// Prompt for Integer & Double numbers

		System.out.println();
		System.out.print("Enter Integer Value: "); // keep print line open
		myInt = console.nextInt();
		System.out.println();

		System.out.print("Enter Decimal Value: "); // keep print line open
		myDouble = console.nextDouble();
		System.out.println();

		System.out.println("Integer entered was: " + myInt);
		System.out.println("Decimal entered was: " + myDouble);
		System.out.println();

	}  // main

} // JdemoIO