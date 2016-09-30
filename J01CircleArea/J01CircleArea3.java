// J01CircleArea3 - Philip Boyle G00325728 15/09/14
// Java Area of a Circle Program

import java.util.Scanner;

public class J01CircleArea3
{
	public static void main(String[] args )
	{
		Scanner console = new Scanner (System.in);

		// Prompt User for Input (Radius) and calculate

		System.out.println();

		System.out.print("Please Enter Radius: ");

		int radius = console.nextInt();

		//int radius = 2;

		final double PI = 3.14159;

		double areaCircle = PI * radius * radius;

		System.out.println();

		System.out.println("The Area of a Circle with a Radius of " + radius + " is: " + areaCircle);

		//System.out.println();

		//radius = 5;

		//areaCircle = PI * radius * radius;

		//System.out.println();

		//System.out.println("The Area of a Circle with a Radius of " + radius + " is: " + areaCircle);

		System.out.println();

	} // main

} // J01CircleArea3