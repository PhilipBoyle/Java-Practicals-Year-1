//J21MultiplyTable - Philip Boyle - G00325728 - 23/10/14
//5 times table using nested for loop
//enchanced, any times table with header and user input

import java.util.Scanner;

public class J21MultiplyTable
{
	public static void main(String[] args)
	{
		//constant
		//final int TIMES_TABLE=5;
		//variable
		int timesTable;
		int i, j, product;
		Scanner console = new Scanner(System.in);
		System.out.println("21 - Multiplication Table");
		System.out.println("============================================================================");
		System.out.print("\nTimes Table Size: ");
		timesTable=console.nextInt();
		System.out.println();
		System.out.print("     ");

		for(j=1;j<=timesTable;j++)
		{
			System.out.printf("%7d",j);
		}//header for

		System.out.println("\n     -----------------------------------------------------------------------");

		for (i=1; i <= timesTable; i++)
		{
			System.out.printf("%2d %2s",i," |");

			for(j=1; j <= timesTable; j++)
			{
				product=j*i;

				//System.out.print(" " + product);
				System.out.printf("%7d", product);

			}//nested for

			System.out.println();

		}//for


	}//main

}//J21MultiplyTable
