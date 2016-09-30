// JdemoIfAndOr - Gerry Agnew
// Demo java if with logical "and" (&&) + "or" (||) boolean operators

public class JdemoIfAndOr
{
	public static void main(String[] args )
	{
		// Derermine if a == 1 And b == 2 And c == 3 (all 3 true)

		int a = 1, b = 2, c = 3; // declarations with = Assignment

		if (a == 1) {            //                  == Equality (true/false)
			if (b == 2) {
				if (c == 3) {
					System.out.println("a is 1, b is 2, c is 3");
				}
			}
		}

		// Rewritten with logical and (&&) operator

		if (a == 1 && b == 2 && c == 3) {
			System.out.println("a is 1, b is 2, c is 3 (with And &&)");
		}
		else {
			System.out.println("Not: a is 1, b is 2, c is 3 (with And &&)");
		}
		System.out.println();

		// Determine if a == 1 Or b == 2 Or c == 3 (at least 1 true)

		if (a == 1) {
			System.out.println("Either a is 1, b is 2, c is 3 true");
		}
		if (b == 2) {
			System.out.println("Either a is 1, b is 2, c is 3 true");
		}
		if (c == 3) {
			System.out.println("Either a is 1, b is 2, c is 3 true");
		}

		// Above contains a Logical error - what is it?

		if (a == 1) {
			System.out.println("Either a is 1, b is 2, c is 3 true");
		}
		else if (b == 2) {
			System.out.println("Either a is 1, b is 2, c is 3 true");
		}
		else if (c == 3) {
			System.out.println("Either a is 1, b is 2, c is 3 true");
		}
		else {
			System.out.println("None of a is 1, b is 2, c is 3 true");
		}

		// Rewritten using logical Or (||) operator

		if (a == 1 || b == 2 || c == 3) {
			System.out.println("Either a is 1, b is 2, c is 3 true (with Or ||)");
		}
		else {
			System.out.println("None of a is 1, b is 2, c is 3 true(with Or ||)");
		}
		System.out.println();

	} // main

} // JdemoIfAndOr