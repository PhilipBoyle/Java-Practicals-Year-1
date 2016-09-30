// JdemoInputStockName - Gerry Agnew
// Inputs/Reads - Stock.dat - in same folder as java code

import java.util.Scanner;

import java.io.*; // File note 1

public class Jdemo6InputStockName
{
    public static void main(String[] args)
                  throws FileNotFoundException // File note 2
    {
		// File objects  // File note 3
		Scanner inStockFile = new Scanner(new FileReader("StockName.dat"));

		// Variables for fields in Stock.dat // File note 4.1
		int stockId;
		int boh;
		String stockName;
		double price;

		// Headers
		System.out.printf("\n%7s%4s\n", "Stock", "BOH");
		System.out.println("===========");

		// while processing

		while (inStockFile.hasNext()) // Not EOF // File note 4.2
		{
			stockId = inStockFile.nextInt(); // File note 4.3
			boh = inStockFile.nextInt();
			stockName = inStockFile.next();
			price = inStockFile.nextDouble();

			System.out.printf("%7d%4d %-12s %6.2f \n",
						stockId, boh, stockName, price);

		} // while not EOF

		System.out.println();

		// Close files
        inStockFile.close(); // File note 5

    }  // main

} // JdemoInputStockName



