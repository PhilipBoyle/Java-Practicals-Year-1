// J11IfPosNeg - Philip Boyle - G00325728 - 29/09/14
// Use if and else to find out if a number in Negative or Poritvie

import java.util.Scanner;

public class J11IfPosNeg

{
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);

		int num = 0;
		System.out.println("Please enter the number: ");
		num = console.nextInt();

		if (num > 0 )
		{
			System.out.println("The Number is Positive! \n");
		}
		else
		{
			System.out.println("The Number is Negative! \n");
		}

	}  // main

} // J11IfPosNeg