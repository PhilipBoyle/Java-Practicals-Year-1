//J34MinStockRead - Philip Boyle - G00325728 - 17/11/14
//The 2nd file in J34 used to read and create a report of an imported file

import java.util.Scanner;

import java.io.*;

public class J34MinStockRead
{
    public static void main(String[] args)
                  throws FileNotFoundException
    {
		// File objects
		Scanner inStockFile = new Scanner(new FileReader("MinStock.dat"));
		PrintWriter outStockRep = new PrintWriter("MinStockReport.dat");

		// Variables
		int stockId;
		int oldBal, issues,receipts,minStock,reorder;

		// Headers
		System.out.println("Stock Old Bal   Issues Receipts Min Stk Reorder");
		outStockRep.println("Stock Old Bal   Issues Receipts Min Stk Reorder");
		System.out.println("===============================================");
		outStockRep.println("===============================================");


		// while processing

		while (inStockFile.hasNext())
		{
			stockId = inStockFile.nextInt();
			oldBal = inStockFile.nextInt();
			issues = inStockFile.nextInt();
			receipts = inStockFile.nextInt();
			minStock = inStockFile.nextInt();
			reorder = inStockFile.nextInt();

			System.out.printf("%5d%8d%9d%9d%8d%8d\n", stockId, oldBal, issues, receipts, minStock, reorder);
			outStockRep.printf("%5d%8d%9d%9d%8d%8d%n", stockId, oldBal, issues, receipts, minStock, reorder);

		}

		System.out.println();

		// Close files
        inStockFile.close();
        outStockRep.close();

    }  // main

} //J34MinStockRead