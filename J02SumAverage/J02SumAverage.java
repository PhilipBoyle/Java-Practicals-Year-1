// J02SumAverage - Philip Boyle - G00325728 - 18/09/2014
// Find the Sum and Average of 3 Numbers

import java.util.Scanner;

public class J02SumAverage

{
	public static void main(String[] args )
	{

		Scanner console = new Scanner(System.in);

		int num1, num2, num3;

		System.out.println();

		System.out.print("Enter First Number: ");
		num1 = console.nextInt();
		System.out.println();

		System.out.print("Enter Second Number: ");
		num2 = console.nextInt();
		System.out.println();

		System.out.print("Enter Third Number: ");
		num3 = console.nextInt();
		System.out.println();

		int sum = num1 + num2 + num3;

        System.out.print("The Sum of the 3 numbers is: " + sum);
        System.out.println();

        int average = sum / 3;

		System.out.println();

        System.out.print("The Average of the 3 numbers is: " + average);
		System.out.println();
    	System.out.println();

	}  // main

} // J02SumAverage