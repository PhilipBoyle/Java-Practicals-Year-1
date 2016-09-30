// JdemoCreateStockName - Gerry Agnew

// Create a new Stock sequential text data file with 4 records
// Called Stock.dat - in same folder as java code

import java.io.*;   // File Note 1

public class Jdemo5CreateStockName
{
    public static void main(String[] args)
    		throws FileNotFoundException // // File Note 2
    {
		// File object - File Note 3
		PrintWriter outStockFile = new PrintWriter("StockName.dat");

		System.out.println("\nCreating the StockName.dat file. \n");

		// Output data to file
		outStockFile.printf("%4d%5d %-12s%6.2f%n", 1000, 10, "plug", 11.11); // File Note 4
		outStockFile.printf("%4d%5d %-12s%6.2f%n", 1001, 11, "widget", 12.12);
		outStockFile.printf("%4d%5d %-12s%6.2f%n", 1002, 12, "washer", 22.22);
		outStockFile.printf("%4d%5d %-12s%6.2f%n", 1003, 13, "brick", 33.33);

		System.out.println("\nStockName.dat created. \n");

		// Close file
        outStockFile.close(); // File Note 5

    }  // main

} // JdemoCreateStockName

