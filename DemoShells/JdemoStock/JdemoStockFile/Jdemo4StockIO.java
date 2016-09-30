// JdemoStockIO - Gerry Agnew

// Inputs/Reads - Stock.dat - in same folder as java code
// Output records +100 to Stock2.dat

import java.util.Scanner;

import java.io.*; // File note 1

public class Jdemo4StockIO
{
    public static void main(String[] args)
                  throws FileNotFoundException // File note 2
    {
		// File objects  // File note 3
		Scanner inStockFile = new Scanner(new FileReader("Stock.dat"));

		PrintWriter outStockFile = new PrintWriter("Stock2.dat");

		// Variables for fields in Stock.dat // File note 4.1
		int stockId;
		int boh;

		// Headers
		System.out.printf("\n%7s%4s\n", "Stock", "BOH");
		System.out.println("===========");

		// while processing

		while (inStockFile.hasNext()) // Not EOF // File note 4.2
		{
			stockId = inStockFile.nextInt(); // File note 4.3
			boh = inStockFile.nextInt();

			boh += 100;

			System.out.printf("%7d%4d\n", stockId, boh);
			outStockFile.printf("%7d%4d%n", stockId, boh);

		} // while not EOF

		System.out.println();

		// Close files
        inStockFile.close(); // File note 5
        outStockFile.close();

    }  // main

} // JdemoStockIO



