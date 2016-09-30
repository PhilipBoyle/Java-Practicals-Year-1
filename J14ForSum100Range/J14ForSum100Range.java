//J14ForSum100Range - Philip Boyle - G00325728 - 02/10/14
//Find if the sum and average of 5 numbers is in the range 1..100 usinf if/for.

import java.util.Scanner;

public class J14ForSum100Range
{
	public static void main(String[] args )
	{
		final int MAX_NUMBERS=5;
		Scanner console = new Scanner(System.in);
		int i, sum=0,numCount=0,average=0, num;

		for (i=1; i<=MAX_NUMBERS; ++i)
		{
			System.out.print("\nPlease enter number " + i + ": ");
			num = console.nextInt();

			if(num>0)
			{
				if(num<101)
				{
					sum = sum + num;
					++numCount;
				}//nestedIf
			}//if
		}//for

		System.out.println("\nThe Number of Valid Numbers is: " +numCount);
		System.out.println("\nThe Sum of the Valid Numbers is: " +sum);

		if (numCount > 0)
		{
			average= sum / numCount;
			System.out.println("\nThe Average of the Valid Numbers is: "+ average + "\n");
		}
		else
		{
			System.out.println("\nCannot calculate the average. No Valid Numbers Entered.\n");
		}

	}//main

}//J14ForSume100Range




