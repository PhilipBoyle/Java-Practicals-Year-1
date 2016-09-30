// JdemoNestedFor - Gerry Agnew
// A Nested for is a second for within the first for statement

public class JdemoNestedFor
{
	public static void main(String[] args)
	{
		int i, j = 0;

		for (i = 1; i < 4; ++i)
		{
			System.out.print("Outer i: " + i + " ");

			for (j = 1; j < 4; ++j)
			{
				System.out.print(" Inner j: " + j + " ");
			}

			System.out.println("\n");
		}

		for (i = 1; i <= 5; ++i)
		{
			for (j = 1; j <= 5; ++j)
			{
				System.out.print("  i/j: " + i + " " + j + " ");
			}

			System.out.println("\n");
		}

		System.out.println("Final i = " + i + " and final j = " + j + "\n");

	} // main

} // JdemoNestedFor