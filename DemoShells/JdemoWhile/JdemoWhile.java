// JdemoWhile - Gerry Agnew

import java.util.*;

public class JdemoWhile
{
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);

/*===================================================================
		// while loop Syntax

		while (condition)
		{
			statements;
		}
*/

/* 0)================================================================
		// while counter < 5
		int cnt = 0;
		System.out.print(cnt + " ");
		while (cnt < 5)
		{
			System.out.print(cnt + " ");
			++cnt;
		}
		System.out.print(cnt + " ");

/* 1)=============================================================

		// Output: 0 -> 10 since cnt++ after output
		System.out.println("\nOutputs: 0 ==> 10 Using a While");
		System.out.println("_______________________________");

		int cnt = 0;
		while (cnt <= 10)
		{
			System.out.print(cnt + " ");
			cnt++;
		} // while <= 10

/* 2)=============================================================

		// Output: 9 -> 0 since cnt-- is before output
		System.out.println("\nOutputs: 9 ==> 0 Using a While");
		System.out.println("______________________________\n");

		int cnt = 10;
		while (cnt >= 1)
		{
			cnt--;
			System.out.print(cnt + " ");
		} // while >= 1

/* 3)=============================================================

		// Enter first value to be added before loop - INITIAL READ
		// using sentinel to end loop

		System.out.println("\nSum/Average until -1 Entered");
		System.out.println("____________________________\n");

		int cnt, val, avg, sum;
		cnt = sum = 0 ;

		System.out.print("Enter val 1 (-1 to end): ");
		val = console.nextInt(); // Initial Read

		while (val != -1 )
		{
			sum += val;
			++cnt;
			// Subsequent Read
			System.out.print("Enter val " + (cnt + 1) + " (-1 to end): ");
			val = console.nextInt();
		} // while val != -1

		if (cnt > 0) {
			System.out.println("Sum is: " + sum);
			avg = sum/cnt;
			System.out.println("Average is: " + avg);
		}
		else {
			System.out.println("No values entered");
		}

/* 4)=============================================================
*/
		// Without initial read and using sentinel to end loop
		// -1 is inc in calculations as loop iterates an extra time
		// Avg is incorrect since cnt is 2 greater - init to 1 + 1 extra iteration

		System.out.println("\nSum/Average until -1 Entered - Wrong");
		System.out.println("____________________________________\n");

		int cnt, val, avg, sum;
		val = sum = 0;
		cnt = 1;

		while (val !=-1)
		{
			System.out.print("Enter val " + cnt+ ": ");
			val = console.nextInt();
			sum += val;
			++cnt;
		} // while  != 1

		if (cnt > 0) {
			System.out.println("Sum is: " + sum);
			avg = sum/cnt;
			System.out.println("Average is: " + avg);
		}
		else {
			System.out.println("No values entered");
		}

/* 5)=============================================================

		// My Powers function - integers
		System.out.println("\nMyPowers - while Integer Power function");
		System.out.println("_______________________________________\n");

		int cnt, mypow, number, exponent;
		cnt = 0;
		mypow = 1;

		System.out.print("Enter Number : ");
		number = console.nextInt();
		System.out.print("Enter Exponent: ");
		exponent = console.nextInt();

		while (cnt < exponent)
		{
			mypow *= number;
			++cnt;
		} // while cnt < exponent

		System.out.println("Answer is: " + mypow);
*/
		System.out.println();

	}  // main

} // JdemoWhile
