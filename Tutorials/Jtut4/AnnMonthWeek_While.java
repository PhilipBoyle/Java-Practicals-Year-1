// AnnMonthWeek_While switch / while /

import java.util.*;

public class AnnMonthWeek_While
{
	public static void main(String[] args)
	{
		final int SENTINEL_9999 = 9999;

		int i,employeeNo;
		String employeeName = "";
		char payType = ' ';
		Scanner console = new Scanner(System.in);

		double amountPay =0, annualPay =0, monthlyPay =0, weeklyPay = 0;
		double smallestPay = 999999, largestPay = -999999;

		System.out.println("\t\t\t              Name  Type   Weekly  Monthly    Annual");
		System.out.println("============================================================================");

		System.out.print("Employee No (9999/End): ");
		employeeNo = console.nextInt();

		while (employeeNo != SENTINEL_9999)
		//for (i = 1; i <=3; i++)
		{
			// line input

			console.nextLine(); // flush buffer
			System.out.print("Employee Name: ");
			employeeName = console.nextLine();
			System.out.print("Pay type (W/M/A): ");
			payType = console.next().charAt(0);
			System.out.print("Pay amount: ");
			amountPay = console.nextDouble();

			// switch here
			switch (payType)
			{
				case 'W':
				case 'w':
					weeklyPay = amountPay ;
					monthlyPay = amountPay * 4;
					annualPay = amountPay * 52;
					break;
				case 'M':
				case 'm':
					weeklyPay = amountPay / 4 ;
					monthlyPay = amountPay;
					annualPay = amountPay / 12;
					break;
				case 'A':
				case 'a':
					weeklyPay = amountPay / 52 ;
					monthlyPay = amountPay / 12;
					annualPay = amountPay;
					break;

				default:
					weeklyPay = 0;
					monthlyPay = 0;
					annualPay = 0;

				// if (num < smallest) { // number < than smallest

				if (annualPay < largestPay) { // number input > than largest
				}
					largestPay = annualPay;
					System.out.println("\t\tNew Largest is: " + largestPay);
				}

			} // switch

			System.out.printf("%15s %5d %20s %5s %8.2f %8.2f %9.2f\n", " ", employeeNo,employeeName, payType, weeklyPay, monthlyPay, annualPay );

			// smallest / largest here

			//subsequent read
			System.out.print("Employee No: ");
			employeeNo = console.nextInt();

		} // for

		//System.out.println("\nSmallest pay: " + smallestPay);
		System.out.println("\nLargest pay: " + largestPay);
	}  // main

} // AnnMonthWeek_While



