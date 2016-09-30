//J34MinStockCreate - Philip Boyle - G00325728 - 17/11/14
//The 1st file in J34, used to create an import file

import java.io.*;

public class J34MinStockCreate
{
	public static void main(String[] args )
			throws FileNotFoundException
	{
		//create new file
		PrintWriter outStockFile = new PrintWriter("MinStock.dat");

		outStockFile.printf("%5d %5d %5d %5d %5d %5d %n", 11, 100, 20, 30, 50, 40);
		outStockFile.printf("%5d %5d %5d %5d %5d %5d %n", 22, 70, 50, 30, 60, 60);
		outStockFile.printf("%5d %5d %5d %5d %5d %5d %n", 33, 40, 20, 10, 30, 30);
		outStockFile.printf("%5d %5d %5d %5d %5d %5d %n", 44, 20, 5, 0, 10, 5);

		System.out.println("\nA new file called 'MinStock.dat' has been created.\n");

		//close file

		outStockFile.close();

	}//main

}//J34MinStockCreate