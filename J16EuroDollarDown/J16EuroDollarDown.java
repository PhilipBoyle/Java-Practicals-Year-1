//J16EuroDollarDown - Philip Boyle - G00325728 - 02/10/14
//Display a table of Euro to Dollar Conversion in descending order.

import java.util.Scanner;

public class J16EuroDollarDown
{
	public static void main(String[] args )
	{
		final double MAX_EURO = 100.00;
		Scanner console = new Scanner(System.in);
		double euro, dollar, euroDollar;
		int i;

		for(i=100; i<=MAX_EURO; i= i-10)
		{
			euro = i;
			euroDollar = 1.45;
			dollar = euro*euroDollar;
			System.out.printf(" %5.3f %5.3f",euro,dollar);
		}


	}//main

}//J16EuroDollarDown
