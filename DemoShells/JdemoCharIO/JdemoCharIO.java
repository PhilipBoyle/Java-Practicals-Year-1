// JdemoCharIO - Gerry Agnew
// Demo Java Character input from keyboard & Output to monitor

import java.util.Scanner;

public class JdemoCharIO
{
	public static void main(String[] args )
	{
		// Variables

		Scanner console = new Scanner(System.in);

		char ch;

		// Prompt for Single Character from the keyboard (repeated 3 times)

		for (int i = 1; i <= 3; i++)
		{
			System.out.print("\nEnter Character: "); // keep print line open
			ch = console.next().charAt(0);

			System.out.println("\n\tCharacter entered was: '" + ch + "'");
			System.out.println();

		} // for

	}  // main

} // JdemoCharIO
