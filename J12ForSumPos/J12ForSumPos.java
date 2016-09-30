// J12ForSumPos - Philip Boyle - G00325728 - 29/09/14
//Find the sum and average of N positive numbers usinf if/for statements

import java.util.Scanner;

public class J12ForSumPos
{
	public static void main(String[] args )
	{
		Scanner console = new Scanner(System.in);
		int num, i, sum = 0, average, maxNumbers, numCount = 0;
		System.out.print("\nPlease enter the maximum numbers: ");
		maxNumbers = console.nextInt();

		for (i = 1; i <= maxNumbers; ++i)
		{
			System.out.print("\nEnter Value " + i + ": ");
			num = console.nextInt();

			if (num > 0)
			{
				sum = sum + num;
				numCount = numCount + 1;
			}//if

		}//for

		System.out.println("\nThe Sum is: " + sum);
		if (numCount <= 0)
		{
			System.out.println("\nCannot calculate average, no positve numbers entered.\n");
		}
		else
		{
			average = sum/numCount;
			System.out.println("\nThe Average is: " + average + "\n");
		}

	}//main

}//J12ForSumPos


