// J31TransportExpenses - Mark Depinna
// Demo for Repetition statement

import java.util.*;

public class J31TransportExpenses
{
	public static void main(String[] args )
	{
		//Constants
		final int MAX_DRIVERS = 3;
		final double KM_RATE = 0.25;
		final double OVERNIGHT_RATE = 75.00;

		//Variables
		Scanner console = new Scanner(System.in);

		int driver;
		int kmDriven = 0;
		int overnights;
		int countOvernights;
		int totalOvernights;
		int highKm = 0;

		double costOvernights;
		double costKmDriven;
		double driverExpense;
		double totalExpenses = 0;
		double averageOvernights;

		String driverName;
		String highDriverName = "";

		//Header Insert Here

		System.out.println("		              Driver    KM   O/N   Expense	");
		System.out.println("=====================================================================");

		for (driver = 1; driver <=MAX_DRIVERS; driver++)
		{
			System.out.println("Enter Driver " + driver + " Details ");
			System.out.println();
			System.out.print("Name: ");
			driverName = console.nextLine();
			System.out.print("KM: ");
			kmDriven = console.nextInt();
			System.out.print("Overnights: ");
			overnights = console.nextInt();
			console.nextLine(); //Flush Buffer

			costKmDriven = kmDriven * KM_RATE;
			costOvernights = overnights * OVERNIGHT_RATE;
			driverExpense = costOvernights + costKmDriven;
			totalExpenses = totalExpenses + driverExpense;

			costOvernights = OVERNIGHT_RATE * overnights / 2;

			if (kmDriven > highKm)
			{
				highKm = kmDriven;
				highDriverName = driverName;
			}

			System.out.printf("\t\t\t %10s %6d %5d %9.2f \n",driverName,kmDriven,overnights,driverExpense);

		}//for

			System.out.println();
			System.out.printf("Total Expenses: %10.2f\n", totalExpenses);
			System.out.printf("Driver with highest kilometers: %5s\n", highDriverName);


	} // main

} // J31TransportExpenses