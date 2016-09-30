// JdemoMath - Gerry Agnew
// Demo Java Math class Named Constants and Methods

import java.lang.Math;

public class JdemoMath
{
	public static void main(String[] args )
	{
		int myInt1  = 2, myInt2 = 5;

		System.out.println();
		System.out.println("Suppose: int myInt1 = 2, myInt2 = 5; \n");

		System.out.println("Math.PI: " + Math.PI + "\n");

		System.out.println("Math.E: " + Math.E + "\n");

		System.out.println("Math.Min of: " + myInt1 + " and " + myInt2 + " is "
							+ Math.min(myInt1, myInt2) + "\n");

		System.out.println("Math.Max of: " + myInt1 + " and " + myInt2 + " is "
							+ Math.max(myInt1, myInt2) + "\n");

		System.out.println("Math.pow of: " + myInt1 + " power of " + myInt2 + " is "
							+ Math.pow(2, 5) + "\n");

	}  // main

} // JdemoMath