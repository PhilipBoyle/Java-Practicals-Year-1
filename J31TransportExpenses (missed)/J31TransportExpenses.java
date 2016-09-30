// J31TransportExpenses - Ed Lasauskas
// calc expenses for drivers

import java.util.Scanner;

public class J31TransportExpenses
{
	public static void main(String[] args )
	{ //main

		Scanner console = new Scanner(System.in);

		final double KM_RATE = 0.25, OVERNIGHT_RATE = 75.00;
		String driverName, highDriver = "";
		int i, distanceDriven, overnights, highKm = 0, numOverNights = 0;
		double overnightExp, distanceExp, expense, totExp = 0, averageNightExp = 0, totOverNightExp = 0;

		System.out.print("\t\t\t    Driver    KM  O/N   Expense\n");
		System.out.println("=======================================================");

		for (i = 1; i <= 3; i++)
		{
			System.out.println("Driver " + i + " Details");
			System.out.print("   Name: ");
			driverName = console.nextLine();
			System.out.print("   KM: ");
			distanceDriven = console.nextInt();
			System.out.print("   Overnights: ");
			overnights = console.nextInt();
			console.nextLine(); // flush the buffer

			overnightExp = OVERNIGHT_RATE * overnights;
			totOverNightExp += overnightExp;
			distanceExp = KM_RATE * distanceDriven;
			expense = distanceExp + overnightExp;
			totExp += expense;

			if (distanceDriven > highKm)
			{
				highKm = distanceDriven;
				highDriver = driverName;
			}

			System.out.printf("\t\t%18s %15s %5d", " ", driverName, distanceDriven);

			if (overnights > 0)
			{
				numOverNights++;
				System.out.printf("%4d", overnights);
			}
			else
			{
				System.out.printf("%4s", "-");
			}

			averageNightExp = totOverNightExp / numOverNights;

			System.out.printf("%9.2f\n\n", expense);

		}

		System.out.printf("Total Expenses: %10.2f\n", totExp);
		System.out.printf("Driver with highest kilometers: %5s\n", highDriver);
		System.out.printf("Average for Overnights is: %5.2f\n", averageNightExp);

	} //main

}
