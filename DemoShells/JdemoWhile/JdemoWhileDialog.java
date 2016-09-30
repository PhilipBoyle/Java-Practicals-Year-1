// JdemoWhileDialog - Gerry Agnew

import java.util.*;

import javax.swing.JOptionPane;

public class JdemoWhileDialog
{
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);

		// Enter first value to be added before loop - INITIAL READ
		// using sentinel to end loop

		System.out.println("\nSum/Average until -1 Entered");
		System.out.println("____________________________\n");

		int cnt, val, avg, sum;
		cnt = sum = 0 ;
		String stg;

		//System.out.print("Enter val 1 (-1 to end): ");
		//val = console.nextInt(); // Initial Read

		stg = JOptionPane.showInputDialog("Enter Value 1: ", "7");
		val=Integer.parseInt(stg);

		while (val != -1 )
		{
			sum += val;
			++cnt;
			// Subsequent Read
			stg = JOptionPane.showInputDialog("Enter Value " + cnt + ": ");
			val=Integer.parseInt(stg);

		} // while val != -1

		if (cnt > 0) {
			//System.out.println("Sum is: " + sum);
			avg = sum/cnt;
			//System.out.println("Average is: " + avg);
			stg="Sum is:" + sum;

			JOptionPane.showMessageDialog(null, stg, "Sum: ", JOptionPane.ERROR_MESSAGE);
			stg="Average is:" + avg;
			JOptionPane.showMessageDialog(null, stg, "Average: ", JOptionPane.ERROR_MESSAGE);
		}
		else {
			System.out.println("No values entered");
		}

		System.out.println();
		System.exit(0);

	}  // main

} // JdemoWhile
