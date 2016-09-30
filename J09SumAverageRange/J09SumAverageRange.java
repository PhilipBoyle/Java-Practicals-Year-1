// J09SumAverageRange - Philip Boyle - G00325728 - 25/09/14
// Sum and Average of Numbers within a range using a for loop.

import java.util.Scanner;

public class J09SumAverageRange
{
	public static void main(String[] args )
	{
		Scanner console = new Scanner(System.in);
		int sum = 0;
		int numCount = 0;
		int startNum, endNum, i;
		double average;

		System.out.println();
		System.out.print("Enter Starting Number: ");
		startNum = console.nextInt();
		System.out.println();

		System.out.println();
		System.out.print("Enter Ending Number: ");
		endNum = console.nextInt();
		System.out.println();

		for (i= startNum; i <= endNum; i++)
		{
			sum = sum + i;
			numCount = numCount + 1;

		}
		average = sum / numCount;

		System.out.println("The Sum of the Number Range is: " + sum);
		System.out.println();
		System.out.println("The Average of the Number Range is: " + average);
		System.out.println();

	}//main

}//J09SumAverageRange
