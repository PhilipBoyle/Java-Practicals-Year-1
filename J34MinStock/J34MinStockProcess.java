//J34MinStockProcess - Philip Boyle - G00325728 - 17/11/14
//The 3rd file in J34

import java.util.Scanner;

import java.io.*;

public class J34MinStockProcess
{
    public static void main(String[] args)
                  throws FileNotFoundException
    {
		// File objects
		Scanner inStockFile = new Scanner(new FileReader("MinStock.dat"));
		PrintWriter outStockFile = new PrintWriter("ReorderReport.dat");
		PrintWriter outStockFile2 = new PrintWriter("ReorderReport2.dat");

		// Variables
		int stockId,oldBal, issues,receipts,minStock,reorder,newStkBal;



		// while processing

		while (inStockFile.hasNext())
		{
			stockId = inStockFile.nextInt();
			oldBal = inStockFile.nextInt();
			issues = inStockFile.nextInt();
			receipts = inStockFile.nextInt();
			minStock = inStockFile.nextInt();
			reorder = inStockFile.nextInt();

			newStkBal=oldBal+receipts-issues;

			if (newStkBal<=minStock)
			{
				System.out.println("Reorder Stk No: "+stockId+" - Reorder Amt: "+ reorder);
				outStockFile.println("Reorder Stk No: "+stockId+" - Reorder Amt: "+ reorder);
				outStockFile2.println(" "+stockId+" "+ reorder);
			}

		}

		System.out.println();

		// Close files
        inStockFile.close();
        outStockFile.close();
        outStockFile2.close();

    }  // main

} //J34MinStockProcess
