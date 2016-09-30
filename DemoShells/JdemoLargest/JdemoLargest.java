// 75 - Gerry Agnew

// Largest number from 6 numbers input

import java.util.Scanner;

public class JdemoLargest
{
	public static void main(String[] args)
	{
		// Constants & Variables

		Scanner console = new Scanner(System.in);

		int i, num, largest;

		System.out.print("Enter number 1: ");
		largest = console.nextInt(); // assume first is largest

		for (i = 2; i <=6; i++)
		{
			System.out.print("Enter number " + i + ": ");
			num = console.nextInt();

			// if (num < smallest) { // number < than smallest

			if (num > largest) { // number input > than largest
				largest = num;
				System.out.println("\t\tNew Largest is: " + largest);
			}
		}
		System.out.println("\nLargest is: " + largest);

	} // main

} // JdemoLargest