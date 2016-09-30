//J13IfRange - Philip Boyle - G00325728 - 29/09/14
//Use if and else statements to find out if a number is within 1-100

import java.util.Scanner;

public class J13IfRange

{
	public static void main(String[] args )

	{
		Scanner console = new Scanner(System.in);
		int num;
		System.out.print("\nPlease enter the number: ");
		num = console.nextInt();

		if (num >= 1)
		{
			if (num <= 100)
			{
				System.out.println("\n" + num + " is in the range 1..100.\n");
			}
		}//if

		if (num < 0)
		{
			System.out.println("\n" + num + " is not in the range 1..100, it is less than 0.\n");
		}

		if (num > 100)
		{
			System.out.println("\n" + num + " is not in the range 1..100, it is greater than 100.\n");
		}

	}//main

}//J13IfRange