//J33SalesWhile - Philip Boyle - G00325728 - 10/11/14
//Display a Craft Shop's weekly sales using a while loop
import java.util.Scanner;

public class J33SalesWhile
{
	public static void main(String[] args )
	{
		//constants
		final double SALES_TARGET=2000.00;
		final int SENTINEL=7;

		//variables
		int employeeNum;
		String employeeName;
		double employeeSales, excessSales=0;
		//enhancments
		double totalSales=0, averageSales, highestSales=0;
		int employeeCount=0;
		String bestEmployee="a";

		Scanner console = new Scanner(System.in);
		System.out.println("                                Emp No          Name          Sales      Excess");
		System.out.println("________________________________________________________________________________");
		System.out.print("Enter Emp No (7 to end): ");
		employeeNum=console.nextInt();

		while(employeeNum != 7)
		{
			console.nextLine();
			System.out.print("   Name: ");
			employeeName=console.nextLine();
			System.out.print("   Sales: ");
			employeeSales=console.nextDouble();

			System.out.printf("%34d %21s %11.2f ", employeeNum, employeeName, employeeSales);

			if (employeeSales>SALES_TARGET)
			{
				excessSales=employeeSales-SALES_TARGET;
				System.out.printf("%9.2f ", excessSales);

			}

			System.out.println();

			//highest
			if(employeeSales>highestSales)
			{
				highestSales=employeeSales;
				bestEmployee=employeeName;
			}

			//totals
			totalSales+=employeeSales;
			employeeCount++;

			System.out.print("\nEnter Emp No (7 to end): ");
			employeeNum=console.nextInt();

		}//while

		System.out.printf("%20s %7.2f \n","Total Sales: " ,totalSales);
		averageSales=totalSales/employeeCount;
		System.out.printf("%20s %7.2f \n","Average Sales: " ,averageSales);
		System.out.println();
		System.out.println(bestEmployee + " had the highest sales of: " +highestSales);

	}//main

}//J33SalesWhile