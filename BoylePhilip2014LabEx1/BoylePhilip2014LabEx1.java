//BoylePhilip2014LabEx1 - Philip Boyle - G00325728 - 20/10/14
//Lab Exam - A programme to calculate and output a table of quotations for a tyre company

import java.util.Scanner;

public class BoylePhilip2014LabEx1
{
	public static void main(String[] args )
	{
		//constants
		final double TYRE_GRADE_A=150.00, TYRE_GRADE_B=100.00, TYRE_GRADE_C=75.00, TYRE_GRADE_D=49.99;
		final double SPECIAL_GRADE_P=7.50, SPECIAL_GRADE_T=50.00, SPECIAL_GRADE_F=299.99;
		final double WHEEL_COST=5.00, BALANCED_COST=5.00, TRACKED_COST=35.00;
		final double VAT_RATE=.2;
		final double DISCOUNT_1=.025, DISCOUNT_2=.05, DISCOUNT_BUSINESS=.1;

		//variables
		int i, jobsWorked, tyreQuantity, numberBalanced;
		double voucherUsed;
		char wheelsTracked, tyreGrade, discountUsed;
		double discountRate=0.00, tyreGradeRate=0,tyreCost, balancedCost, trackingCost, grossCost, discountAmount, voucherCost, netCost, vatCost, totalCost, valueDiscount=0.00;
		Scanner console = new Scanner(System.in);

		//totals
		double totalTyreCost,totalBalancedCost,totalTrackingCost,totalGrossCost,totalDiscountAmount,totalVoucherCost,totalNetCost,totalVatCost,totalTotalCost;

		//highest lowest
		int highestJob=0, lowestJob=0;
		double highestTyreCost=0,lowestTyreCost=0;

		//initialise variables
		totalTyreCost=totalBalancedCost=totalTrackingCost=totalGrossCost=totalDiscountAmount=totalVoucherCost=totalNetCost=totalVatCost=totalTotalCost=0;

		System.out.print("Enter number of jobs: ");
		jobsWorked = console.nextInt();

		//output header including name
		System.out.println("\nLab Exam 1     Job  Tyre   Bal  Track  Gross   Disc  Vouch    Net    Vat  Total");
		System.out.println("Philip Boyle        Cost  Cost   Cost   Cost   Cost   Cost   Cost   Cost   Cost");
		System.out.println("================================================================================");

		for(i=1;i<=jobsWorked;i++)
		{
			System.out.println("Gr/Qty/Bal/Tr/Dis/Vch:");
			tyreGrade=console.next().charAt(0);
			tyreGrade=Character.toUpperCase(tyreGrade);
			tyreQuantity=console.nextInt();
			numberBalanced=console.nextInt();
			wheelsTracked=console.next().charAt(0);
			wheelsTracked=Character.toUpperCase(wheelsTracked);
			discountUsed=console.next().charAt(0);
			discountUsed=Character.toUpperCase(discountUsed);
			voucherUsed=console.nextDouble();
			//tyre grade rate
			if (tyreGrade=='A')
			{
				tyreGradeRate=TYRE_GRADE_A;
			}
			else if(tyreGrade=='B')
			{
				tyreGradeRate=TYRE_GRADE_B;
			}
			else if(tyreGrade=='C')
			{
				tyreGradeRate=TYRE_GRADE_C;
			}
			else if(tyreGrade=='D')
			{
				tyreGradeRate=TYRE_GRADE_D;
			}
			else if(tyreGrade=='P')
			{
				tyreGradeRate=SPECIAL_GRADE_P;
			}
			else if(tyreGrade=='T')
			{
				tyreGradeRate=SPECIAL_GRADE_T;
			}
			else if(tyreGrade=='F')
			{
				tyreGradeRate=SPECIAL_GRADE_F;
			}

			//tyre cost
			if (tyreGrade=='P')
			{
				tyreCost=SPECIAL_GRADE_P;
			}
			else if(tyreGrade=='T')
			{
				tyreCost=SPECIAL_GRADE_T;
			}
			else if(tyreGrade=='F')
			{
				tyreCost=SPECIAL_GRADE_F;
			}
			else
			{
				tyreCost= tyreGradeRate*tyreQuantity;
			}

			//balancedCost
			if(tyreGrade=='P' || tyreGrade=='F' || tyreGrade=='T')
			{
				balancedCost=0.00;
			}
			else
			{
				balancedCost=numberBalanced*BALANCED_COST;
			}

			//trackingCost
			if(tyreGrade=='P' || tyreGrade=='F' || tyreGrade=='T')
			{
				trackingCost=0.00;
			}
			else if (wheelsTracked=='Y')
			{
				trackingCost=TRACKED_COST;
			}
			else
			{
				trackingCost=0.00;
			}
			//gross cost
			grossCost=tyreCost+balancedCost+trackingCost;
			//discount cost
			if (discountUsed=='1')
			{
				discountRate=DISCOUNT_1;
			}
			else if(discountUsed=='2')
			{
				discountRate=DISCOUNT_2;
			}
			else if(discountUsed=='B')
			{
				discountRate=DISCOUNT_BUSINESS;
			}

			//value discount
			if (discountUsed=='V')
			{
				valueDiscount=(grossCost-100);
			}
			//value discount calculation
			if(valueDiscount>=600.00)
			{
				discountRate=.09;
			}
			else if(valueDiscount>=400.00)
			{
				discountRate=.06;
			}
			else if(valueDiscount>=200.00)
			{
				discountRate=.03;
			}

			//discountAmount calculation
			if(tyreGrade=='P' || tyreGrade=='F' || tyreGrade=='T')
			{
				discountAmount=0.00;
			}
			else
			{
			discountAmount=grossCost*discountRate;
			}

			//voucher cost
			if(tyreGrade=='P' || tyreGrade=='F' || tyreGrade=='T')
			{
				voucherCost=0.00;
			}
			else
			{
				voucherCost=voucherUsed;
			}

			//netCost
			netCost=grossCost-discountAmount-voucherCost;

			//vatCost
			if(tyreGrade=='P' || tyreGrade=='F' || tyreGrade=='T')
			{
				vatCost=0.00;
			}
			else
			{
				vatCost=netCost*VAT_RATE;
			}
			//total cost

			totalCost=netCost+vatCost;
			//unformatted output
			//System.out.println(i+" "+tyreCost+" "+balancedCost+" "+trackingCost+" "+grossCost+" "+discountAmount+" "+voucherCost+" "+netCost+" "+vatCost+" "+totalCost);

			//formatted output
			System.out.printf("%17d %6.2f %5.2f %6.2f %6.2f %6.2f %6.2f %6.2f %6.2f %6.2f \n",i,tyreCost,balancedCost,trackingCost,grossCost,discountAmount,voucherCost,netCost,vatCost,totalCost);

			//totals calculations
			totalTyreCost+=tyreCost;
			totalBalancedCost+=balancedCost;
			totalTrackingCost+=trackingCost;
			totalGrossCost+=grossCost;
			totalDiscountAmount+=discountAmount;
			totalVoucherCost+=voucherCost;
			totalNetCost+=netCost;
			totalVatCost+=vatCost;
			totalTotalCost+=totalCost;

			//highest lowest
			if (i==1)
			{
				lowestTyreCost=highestTyreCost=tyreCost;
				lowestJob=highestJob=i;
			}
			else if(tyreCost>highestTyreCost)
			{
				highestTyreCost=tyreCost;
				highestJob=i;
			}
			else if(tyreCost<lowestTyreCost)
			{
				lowestTyreCost=tyreCost;
				lowestJob=i;
			}

		}//for


		//output footer
		System.out.println("===============================================================================");
		//unformatted output totals
		//System.out.println("Totals: " +totalTyreCost+" "+totalBalancedCost+" "+totalTrackingCost+" "+totalGrossCost+" "+totalDiscountAmount+" "+totalVoucherCost+" "+totalNetCost+" "+totalVatCost+" "+totalTotalCost);
		//formatted output totals
		System.out.printf("%10s %13.2f %5.2f %6.2f %6.2f %6.2f %6.2f %6.2f %6.2f %6.2f ","Totals:",totalTyreCost,totalBalancedCost,totalTrackingCost,totalGrossCost,totalDiscountAmount,totalVoucherCost,totalNetCost,totalVatCost,totalTotalCost);
		//output extra footer
		System.out.println("===============================================================================");
		//unformatted output highest lowest
		//System.out.println();
		//System.out.println("Job " +lowestJob + " has the lowest tyre cost of: " +lowestTyreCost);
		//System.out.println("Job " + highestJob + " has the highest tyre cost of: " + highestTyreCost+"\n");
		System.out.printf("Job %2d had the  lowest tyre cost of: %5.2f \n",lowestJob,lowestTyreCost);
		System.out.printf("Job %2d had the highest tyre cost of: %5.2f \n",highestJob,highestTyreCost);

	}//main

}//BoylePhilip2014LabEx1