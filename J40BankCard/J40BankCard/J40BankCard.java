// J40BankCard - Philip Boyle - G00325728 - 24/11/14

// bank.dat - seq text file
// Access bank file and output those exceeded credit limit

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

public class J40BankCard
{
 	public static void main(String[] args)
 							throws FileNotFoundException
	{
		// Declare Bank file objects
		Scanner inBankFile = new Scanner(new FileReader("bank.dat"));

		// PrintWriter outBankRep = new PrintWriter("BankRep.dat");
		// PrintWriter outBankFile = new PrintWriter("OverLimit.dat");

		// Bank file record layout/vars
		int bankAccNo;
		String bankFirstName;
		String bankSurname;
		char bankBranch;
		double bankCreditLimit;
		double bankBalance;

		// Declare Other Variables
		int countCustomers, countOverdrawn;
		double totalBalances;
		String fullName, bankBranchName;
		int nCount, sCount, eCount, wCount;
		char overdrawn=' ';

		String findAccName;
		double findBalance = 0;

		// Initialise
		countCustomers = countOverdrawn = 0;
		nCount = sCount = eCount = wCount = 0;
		totalBalances = findBalance = 0.0;
		bankBranchName = " ";

		System.out.println("Acc No  Name             Branch   Limit  Balance  ");
		System.out.println("=====================================================");

		// while loop until EOF encountered
		while(inBankFile.hasNext())
		{
			bankAccNo=inBankFile.nextInt();
			bankFirstName=inBankFile.next();
			bankSurname=inBankFile.next();
			bankBranch=inBankFile.next().charAt(0);
			bankCreditLimit=inBankFile.nextDouble();
			bankBalance=inBankFile.nextDouble();
			fullName= bankFirstName+ " " +bankSurname;

			switch(bankBranch)
			{
				case 'N':
				case 'n':
					bankBranchName = "North";
					break;
				case 'S':
				case 's':
					bankBranchName = "South";
					break;
				case 'E':
				case 'e':
					bankBranchName = "East";
					break;
				case 'W':
				case 'w':
					bankBranchName = "West";
					break;
				default :
					bankBranchName = "none";

			}//switch

			if (bankBranchName=="North")
			{
				nCount+=1;
			}
			else if (bankBranchName=="South")
			{
				sCount+=1;
			}
			else if (bankBranchName=="East")
			{
				eCount+=1;
			}
			else if (bankBranchName=="West")
			{
				wCount+=1;
			}//count if

			if(bankBalance>bankCreditLimit)
			{
				overdrawn='X';
				countOverdrawn+=1;
			}
			else
			{
				overdrawn=' ';
			}//overdrawn if

			System.out.printf("  %-5d %-15s %6s %8.2f %8.2f %2s\n",bankAccNo, fullName, bankBranchName, bankCreditLimit, bankBalance, overdrawn);
			totalBalances+=bankBalance;
			countCustomers+=1;

		}//while

		System.out.println("\nCustomer Count: " +countCustomers);
		System.out.println("\nOverdrawn Count: " +countOverdrawn);
		System.out.println("\nTotal Balances: " +totalBalances);

		System.out.println("\nNorth Count: " +nCount);
		System.out.println("South Count: " +sCount);
		System.out.println("East Count: " +eCount);
		System.out.println("West Count: " +wCount+"\n");



	}  // main

} //J40BankCard