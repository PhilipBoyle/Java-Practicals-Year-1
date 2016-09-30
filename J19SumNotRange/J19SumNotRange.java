//J19SumNotRange - Philip Boyle - G00325728 - 06/10/14
//A programme to sum and average numbers NOT in the range 1..100

import java.util.Scanner;

public class J19SumNotRange
{
	public static void main(String[] args )
	{
		Scanner console = new Scanner(System.in);
		int maxNumbers, i, num, sum=0, numCount=0, average=0;
		System.out.print("Please enter max numbers: ");
		maxNumbers = console.nextInt();

		for(i=1;i<=maxNumbers;++i)
		{
			System.out.print("\nPlease Enter Number " + i +": ");
			num = console.nextInt();

			if(num<0)||(num>100)
			{
				sum = sum+num;
			 	++numCount;

			}//if

			//if(num>100)
			//{
			 	//sum = sum+num;
			 	//++numCount;
			//}//if

		}//for

		System.out.println("\nThe Number of Valid Numbers is: " +numCount);
		System.out.println("\nThe Sum of the Valid Numbers is: " +sum);

		if (numCount>0)
		{
			average = sum/numCount;
			System.out.println("\nThe Average of the numbers is: " + average +"\n");
		}//if
		else
		{
			System.out.println("\nCannot find average, no valid numbers entered.\n");
		}//else


	}//main
}//J19SumNotRange
