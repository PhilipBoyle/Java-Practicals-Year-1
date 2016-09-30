// J36EmpPay - Philip Boyle - G00325728 - 24/11/2014
//'N' employees - while loop
// File Layout: Name(String)/Employee No(int)/Grade(char)/Hrs Worked(double)
// using SWITCH

import java.io.*;
import java.util.*;

public class J36EmpPay
{
 	public static void main(String[] args) throws FileNotFoundException
	{
		// Constants & Variables
		final double ADMIN_RATE = 12.5 , CLERK_RATE = 9.75, MANAGER_RATE = 18.3;

		Scanner console = new Scanner(System.in);

		// File Objects
		Scanner inEmpPayFile = new Scanner(new FileReader("EmpPay.dat"));
		PrintWriter outEmpPayReport = new PrintWriter("EmpPayReport.dat");

		// File Vars
		int empNo;
		String empFirstName;
		String empSurname;
		char empGrade;
		double empHours;

		// Vars

		int empCount;
		double pay, rate, totalPay, averagePay;
		String fullName=" ";
		String highestEmp=" ";
		double highestPay=0.00;

		// Initialise Vars

		rate = empCount = 0;
		totalPay = 0.00;

		//heading
		System.out.println("Name            Emp No     Grade  Hours      Pay");
		outEmpPayReport.println("Name            Emp No     Grade  Hours      Pay");

		System.out.println("================================================");
		outEmpPayReport.println("================================================");
		// while here
		while(inEmpPayFile.hasNext())
		{

			empNo=inEmpPayFile.nextInt();
			empFirstName=inEmpPayFile.next();
			empSurname=inEmpPayFile.next();
			empGrade=inEmpPayFile.next().charAt(0);
			empHours=inEmpPayFile.nextDouble();
			fullName= empSurname+ " " +empFirstName;

			switch(empGrade)
			{
				case 'A':
				case 'a':
					rate = ADMIN_RATE;
					break;
				case 'M':
				case 'm':
					rate = MANAGER_RATE;
					break;
				case 'C':
				case 'c':
					rate = CLERK_RATE;
					break;
				default:
					rate = 0;
			}//switch

			pay=rate*empHours;

			if(pay>highestPay)
			{
				highestEmp=fullName;
				highestPay=pay;
			}//highest if

			System.out.printf("%-12s %8d %8s %8.2f %8.2f\n",fullName,empNo,empGrade,empHours,pay);
			outEmpPayReport.printf("%-12s %8d %8s %8.2f %8.2f%n",fullName,empNo,empGrade,empHours,pay);

			totalPay+=pay;
			empCount+=1;

		}//while

		averagePay=totalPay/empCount;

		System.out.printf("\n%-15s %8.2f \n","Total Pay:     ",totalPay);
		outEmpPayReport.printf("%n%-15s %8.2f %n","Total Pay:     ",totalPay);

		System.out.printf("%-15s %8.2f \n","Average Pay:   ",averagePay);
		outEmpPayReport.printf("%-15s %8.2f %n","Average Pay:   ",averagePay);

		System.out.println("Highest pay:       " +highestPay+" paid to " + highestEmp);
		outEmpPayReport.println("Highest pay:       " +highestPay+" paid to " + highestEmp);



		// close i/p file
        inEmpPayFile.close();
        outEmpPayReport.close();

	}  // main

} // J36EmpPay
