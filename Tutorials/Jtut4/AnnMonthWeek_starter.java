// AnnMonthWeek switch / while /

import java.util.*;

public class AnnMonthWeek_starter
{
	public static void main(String[] args)
	{
		int i, employeeNo;
		String employeeName = "";
		char payType = ' ';
		Scanner console = new Scanner(System.in);

		double amountPay =0, annualPay =0, monthlyPay =0, weeklyPay = 0;
		double smallestPay = 999999, largestPay = -999999;

		System.out.println("\t\t\t              Name  Type   Weekly  Monthly    Annual");
		System.out.println("============================================================================");

		for (i = 1; i <=3; i++)
		{
			// line input
			System.out.print("Employee No: ");
			employeeNo = console.nextInt();
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

			} // switch

			System.out.printf("%15s %5d %20s %5s %8.2f %8.2f %9.2f\n", " ", i,employeeName, payType, weeklyPay, monthlyPay, annualPay );

			// smallest / largest here

		} // for

		System.out.println("\nSmallest pay: " + smallestPay);
		System.out.println("\nLargest pay: " + largestPay);
	}  // main

} // JdemoSwitch



