// J20SimpleCompoundInt - Philip Boyle - G00325728 - 09/10/14
// A programme to calculate simple and compound interest and display a table.

import java.util.Scanner;

public class J20SimpleCompoundInt
{
	public static void main(String[] args )
	{
		final int MAX_YEARS = 30;

		Scanner console = new Scanner(System.in);
		int years;
		double principle, rate, simple, compound, diff;

		System.out.print("\nPlease enter the principle: ");
		principle = console.nextDouble();
		System.out.print("\nPlease enter the interest rate: ");
		rate = console.nextDouble();

		//header
		System.out.println(" YEARS   SIMPLE    COMPOUND   DIFFERENCE");
		System.out.println("|=====|=========|===========|============|");

		for(years=5; years<=MAX_YEARS; years+=5)
		{
			simple= principle*rate/100*years;
			compound= principle*(Math.pow((1+rate/100), years)-1);
			diff= compound-simple;

			//System.out.println(years +" "+simple+" "+compound+" "+diff); //unformatted
			//formatted
			System.out.printf("%4d %10.2f %10.2f %10.2f \n", years, simple, compound, diff);

		}//for

	}//main

}//J20SimpleCompoundInt
