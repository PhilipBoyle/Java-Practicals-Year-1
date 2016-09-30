//J34MinStockCreateWhile - Philip Boyle - G00325728 - 17/11/14
//The 1st file in J34, used to create an import file using while loop
import java.util.Scanner;
import java.io.*;

public class J34MinStockCreateWhile
{
	public static void main(String[] args )
			throws FileNotFoundException
	{
		//create new file
		PrintWriter outStockFile = new PrintWriter("MinStockC.dat");
		final int SENTINEL_ID=99;
		int i=1,stockId,oldBal, issues,receipts,minStock,reorder;
		Scanner console = new Scanner(System.in);

		System.out.println("\nEnter Stock 1 Details:");
		System.out.print("  Stk No: ");
		stockId=console.nextInt();

		while(stockId != SENTINEL_ID)
		{

			System.out.print("  Old Balance: ");
			oldBal=console.nextInt();
			System.out.print("  Issues: ");
			issues=console.nextInt();
			System.out.print("  Receipts: ");
			receipts=console.nextInt();
			System.out.print("  Min Stk Level: ");
			minStock=console.nextInt();
			System.out.print("  Re-Order Qty: ");
			reorder=console.nextInt();

			outStockFile.printf("%5d %5d %5d %5d %5d %5d %n", stockId,oldBal,issues,receipts,minStock,reorder);

			i+=1;
			System.out.println("\nEnter Stock "+i+" Details:");
			System.out.print("  Stk No (99 to end): ");
			stockId=console.nextInt();

		}//while

		System.out.println("\nMinStockC.dat has been created.\n");

		//close file
		outStockFile.close();

	}//main

}//J34MinStockCreateWhile