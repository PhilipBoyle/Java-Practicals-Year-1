//J15ForEquation1 - Philip Boyle - G00325728 - 02/10/14
//Use a for statement to solve an equation

import java.util.Scanner;

public class J15ForEquation1
{
	public static void main(String[] args )
	{
		final int MAX_NUMBERS = 4;
		Scanner console = new Scanner(System.in);
		int i, x, y, sqr;
		System.out.println("\nJ15ForEquation1                           x     y");
		System.out.println("=======================================|=====|=====|");
		for (i = 1; i <= MAX_NUMBERS ; ++i)
		{
			System.out.print("\nPlease enter the value " + i + " of X: ");
			x = console.nextInt();
			sqr = x*x;
			y = 3 * sqr + 2 * x - 4;
			System.out.printf(" %42d %6d ", x, y);

		}//for
		System.out.println();

	}//main

}//J15ForEquation1