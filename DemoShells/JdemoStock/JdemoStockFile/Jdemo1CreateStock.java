// JdemoCreateStock - Gerry Agnew

// Create a new Stock sequential text data file with 4 records
// Called Stock.dat - in same folder as java code

import java.io.*;   // File Note 1

public class Jdemo1CreateStock
{
    public static void main(String[] args)
    		throws FileNotFoundException // // File Note 2
    {
		// File object - File Note 3
		PrintWriter outStockFile = new PrintWriter("Stock.dat");

		System.out.println("\nCreating the Stock.dat file. \n");

		// Output data to file
		outStockFile.printf("%4d%5d%n", 1000, 1); // File Note 4
		System.out.printf("Stock: %4d Boh: %5d%n", 1000, 1);
		outStockFile.printf("%4d%5d%n", 1001, 0);
		System.out.printf("Stock: %4d Boh: %5d%n", 1001, 0);
		outStockFile.printf("%4d%5d%n", 1005, 33);
		System.out.printf("Stock: %4d Boh: %5d%n", 1005, 33);
		outStockFile.printf("%4d%5d%n", 1100, 501);
		System.out.printf("Stock: %4d Boh: %5d%n", 1100, 501);

		//outStockFile.printf("%4d%5d%n", 1030, 101);
		//outStockFile.printf("%4d%5d%n", 1140, 102);
		//outStockFile.printf("%4d%5d%n", 1150, 102);

		System.out.println("\nStock.dat created. \n");

		// Close file
        outStockFile.close(); // File Note 5

    }  // main

} // JdemoCreateStock

