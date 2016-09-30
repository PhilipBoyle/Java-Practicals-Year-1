// JdemoPrintf02 - Gerry Agnew
// Demo printf method for Output formatting

public class JdemoPrintf02
{
	public static void main(String[] args)
	{
		double hours = 35.45, rate = 15.00, tolerance = 0.01000;
		int rate2 = 15;
		double pay = hours * rate;

		// Original println version
		System.out.println("Hours = " + hours + " Rate = " + rate +
							" Pay = " + pay + " Tolerance = " + tolerance);
		System.out.println();

		// printf - doubles all 2 decimal places & new line
		System.out.printf("Hours = %.2f, Rate = %.2f, Pay = %.2f, Tolerance = %.2f \n\n",
							hours, rate, pay, tolerance);

		// printf - doubles with different decimal places
		System.out.printf("Hours = %.1f, Rate = %.2f, Pay = %.3f, Tolerance = %.4f \n\n",
							hours, rate, pay, tolerance);

		// printf - double & integer with column widths
		System.out.printf("Hours = %4.2f, Rate = %4d, Pay = %8.2f, Tolerance = %.2f \n\n",
							hours, rate2, pay, tolerance);

		System.out.println();

	} // main

} // JdemoPrintf02