// J11IfPosNeg - Philip Boyle - G00325728 - 29/09/14
// Use if and else to find out if a number is Negative or Positive

import java.util.Scanner;

public class J11IfPosNeg
{
	public static void main(String[] args )
	{
		Scanner console = new Scanner(System.in);
		int num = 0;
		System.out.print("\nPlease enter the number: ");
		num = console.nextInt();

		if (num > 0)
		{
			System.out.println("\nThe Number is Positive! \n");
		}
		else
		{
			System.out.println("\nThe Number is Negative! \n");
		}

	}//main

}//J11IfPosNeg
