// T01Sum3 - Philip Boyle - G00325728 - 26/09/14
// The Sum of 1-100 in multiples of 3

public class T01Sum3
{
	public static void main(String[] args )
	{
		final int MAX_NUMBERS = 100;
		int i, sum = 0, numCount = 0, average = 0;

		System.out.println ("Before sum: " + sum + "\n");

		for (i = 3; i <= MAX_NUMBERS; i = i + 3)
		{
			System.out.print(i + " ");
			sum = sum + i;
			//numCount = numCount + 1;
			++numCount; //shortcut
		}

		average = sum/numCount;

		System.out.println ("\n\nThe Sum of the numbers is: " + sum + "\n");
		System.out.println ("There were " + numCount + " printed" + "\n");
		System.out.println ("The average of the numbers is: " + average + "\n");

	} // main

} // T01Sum3

//Adding 1 shortcut = ++variable
//Adding an empty line shortcut = \n