// J10ForEuroSter - Philip Boyle - G00325728 - 29/09/14
// Display a conversion table of Euro to Sterling (€5-€50)

import java.util.Scanner;

public class J10ForEuroSter
{
	public static void main(String[] args )
	{
		final int MAX_AMOUNT = 50;

		Scanner console = new Scanner(System.in);

		int i;
		double euro = 0, sterling = 0, euroSterlingRate;

		System.out.print("\nPlease enter the exchange rate: ");
		euroSterlingRate = console.nextDouble();

		for (i= 5 ; i <= MAX_AMOUNT ; i = i + 5)
		{
			euro = i;
			sterling = euro*euroSterlingRate;
			System.out.println("\n" + euro + " " + sterling);
		}
		System.out.println("\n " + " " + "Euro" + " " + " " + "Sterling");
		System.out.println("=================");

		for (i= 5 ; i <= MAX_AMOUNT ; i = i + 5)
		{
			euro = i;
			sterling = euro*euroSterlingRate;
			System.out.printf(" %6.2f %7.2f \n", euro, sterling);
		}
		System.out.println();

	}//main

}//J10ForEuroSter



