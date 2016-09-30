//J34MinStockCreateFor - Philip Boyle - G00325728 - 17/11/14
//The 1st file in J34, used to create an import file using for loop
import java.util.Scanner;
import java.io.*;

public class J34MinStockCreateFor
{
	public static void main(String[] args )
			throws FileNotFoundException
	{
		//create new file
		PrintWriter outStockFile = new PrintWriter("MinStockB.dat");
		int i,stockId,oldBal, issues,receipts,minStock,reorder;
		Scanner console = new Scanner(System.in);

		for(i=1;i<=6;i++)
		{
			System.out.println("\nEnter Stock "+i+" Details:");
			System.out.print("  Stk No: ");
			stockId=console.nextInt();
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

		}//for

		System.out.println("\nMinStockB.dat has been created.\n");

		//close file

		outStockFile.close();

	}//main

}//J34MinStockCreateFor