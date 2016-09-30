// JdemoPrintf01 - Gerry Agnew
// Demo simple printf method

public class JdemoPrintf01
{
	public static void main(String[] args )
	{
		final double CMinINCH = 2.54;
		int centimeters = 30;
		double inches = centimeters / CMinINCH;

		// The Problem
		System.out.println("println(): There are " + inches + " inches in "
							+ centimeters + " centimeters.");
		System.out.println();

		// printf Solution Syntax
		System.out.println("Syntax: printf('format String', Argument, List);");
		System.out.println();

		// printf Solution example
		System.out.printf("printf(): There are %.2f inches in %d centimeters.%n",
		 					 inches, centimeters);

		System.out.println();

	} // main

} // JdemoPrintf01