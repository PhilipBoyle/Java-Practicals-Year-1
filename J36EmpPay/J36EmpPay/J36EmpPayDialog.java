//J36EmpPayDialog - Philip Boyle - G00325728 - 24/11/2014


import javax.swing.JOptionPane;
import java.io.*;
import java.util.*;

public class J36EmpPayDialog
{
 	public static void main(String[] args) throws FileNotFoundException
	{
		// Constants & Variables

		Scanner console = new Scanner(System.in);

		// File Objects
		Scanner inEmpPayFile = new Scanner(new FileReader("EmpPay.dat"));
		PrintWriter outEmpPayReport = new PrintWriter("EmpPayReportDialog.dat");
		PrintWriter outEmpPayCalc = new PrintWriter ("EmpPayCalc.dat");

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
		double adminRate=0.00,clerkRate=0.00,managerRate=0.00;
		String str;

		// Initialise Vars

		rate = empCount = 0;
		totalPay = 0.00;
		//dialogs
		str=JOptionPane.showInputDialog(" Admin Rate: (12.50) ");
		adminRate=Double.parseDouble(str);
		str=JOptionPane.showInputDialog(" Clerk Rate: (9.75) ");
		clerkRate=Double.parseDouble(str);
		str=JOptionPane.showInputDialog(" Manager Rate: (18.30) ");
		managerRate=Double.parseDouble(str);

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
					rate = adminRate;
					break;
				case 'M':
				case 'm':
					rate = managerRate;
					break;
				case 'C':
				case 'c':
					rate = clerkRate;
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
			outEmpPayCalc.printf("%-12s %8d %8.2f%n",fullName,empNo,pay);

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
        outEmpPayCalc.close();

	}  // main

} //J36EmpPayDialog



