//BoylePhilipPreLabExam1 - Philip Boyle - G00325728 - 13/10/14
//A programme to give quotations on different carpet grades and offers for a room

import java.util.Scanner;


public class BoylePhilipPreLabExam1
{
	public static void main(String[] args )
	{
		//constants
		final double CALLOUT_FEE = 50.00;
		final double GRADE_A=10.00, GRADE_B=5.00, GRADE_C=2.50, GRADE_D=1.00;
		final double UNDERLAY_GRADE1=2.50, UNDERLAY_GRADE2=5.00;
		final double OFFCUT_RATE=3.50;
		final double GRIPPER_RATE=1.25;
		final double VAT_RATE=.20;
		final double MAX_DISCOUNT=.10;
		final int DISC_ROOM_LIMIT=6;

		//variables
		int maxRoomsCarpeted, i;
		double roomLength, roomWidth;
		char grade, grippers;
		int offcuts,underlay;
		double roomArea, roomPerimeter;
		double discRate=0.00, carpetGradeRate=0, carpetCost, offcutCost, underlayGradeCost=0, gripperCost=0, grossCost=0, discountCost=0;
		double netCost, vatCost, underlayCost, roomCost;
		Scanner console = new Scanner(System.in);
		//totals
		double totalCarpetCost=0, totalOffcutCost=0, totalUnderlayCost=0, totalGripperCost=0, totalGrossCost=0, totalDiscCost=0, totalNetCost=0,totalVatCost=0,totalRoomCost=0;
		//highest lowest
		double highestCarpet=0,lowestCarpet=0,highestRoom=0,lowestRoom=0;

		//input room numbers
		System.out.print("Please enter the number of rooms: ");
		maxRoomsCarpeted=console.nextInt();
		//find discount rate
		//discount rate formula
		if (maxRoomsCarpeted>DISC_ROOM_LIMIT)
		{
			discRate=MAX_DISCOUNT;
		}
		else
		{
			discRate=(maxRoomsCarpeted - 1)*.02;
		}

		System.out.println("Philip       Room Carpet Offcut  U-lay Gripper Gross  Disc    Net   Vat   Room");
		System.out.println("Boyle LabEx1        Cost   Cost   Cost    Cost  Cost  Cost   Cost  Cost   Cost");
		System.out.println("================================================================================");

		for(i=1;i<=maxRoomsCarpeted;i++)
		{
			System.out.println("Le/Wi/Gra/Of/Un/Gri: ");
			roomLength=console.nextDouble();
			roomWidth=console.nextDouble();
			grade=console.next().charAt(0);
			grade=Character.toUpperCase(grade);
			offcuts=console.nextInt();
			underlay=console.nextInt();
			grippers=console.next().charAt(0);
			grippers=Character.toUpperCase(grippers);

			roomArea=roomLength*roomWidth;
			//carpetGrade
			if (grade=='A')
			{
				carpetGradeRate=GRADE_A;
			}
			else if(grade=='B')
			{
				carpetGradeRate=GRADE_B;
			}
			else if(grade=='C')
			{
				carpetGradeRate=GRADE_C;
			}
			else if (grade=='D')
			{
				carpetGradeRate=GRADE_D;
			}

			carpetCost=carpetGradeRate*roomArea;
			offcutCost = offcuts*OFFCUT_RATE;

			// highest lowest
			if (i==1)
			{
				lowestCarpet=highestCarpet=carpetCost;
				lowestRoom=highestRoom=1;
			}
			else if(carpetCost>highestCarpet)
			{
				highestCarpet=carpetCost;
				highestRoom=i;
			}
			else if(carpetCost<lowestCarpet)
			{
				lowestCarpet=carpetCost;
				lowestRoom=i;
			}
			//underlay calculation
			if (underlay==1)
			{
				underlayGradeCost=UNDERLAY_GRADE1;
			}
			else if(underlay==2)
			{
				underlayGradeCost=UNDERLAY_GRADE2;
			}
			else
			{
				underlayGradeCost=0;
			}

			underlayCost=underlayGradeCost*roomArea;

			//gripper calculation
			if (grippers == 'Y')
			{
				roomPerimeter=(roomLength+roomWidth)*2;
				gripperCost=roomPerimeter*GRIPPER_RATE;
			}
			else
			{
				gripperCost=0.00;
			}
			//grossCost calculation
			grossCost= carpetCost + offcutCost + underlayCost + gripperCost;
			//callout fee
			if (i==1)
			grossCost= grossCost + CALLOUT_FEE;


			discountCost=grossCost*discRate;

			netCost=grossCost-discountCost;
			vatCost=netCost*VAT_RATE;
			roomCost=netCost+vatCost;

			//totals
			totalCarpetCost+=carpetCost;
			totalOffcutCost+=offcutCost;
			totalUnderlayCost+=underlayCost;
			totalGripperCost+=gripperCost;
			totalGrossCost+=grossCost;
			totalDiscCost+=discountCost;
			totalNetCost+=netCost;
			totalVatCost+=vatCost;
			totalRoomCost+=roomCost;

			//System.out.println(i + " " + carpetCost + " " + offcutCost + " " + underlayCost + " " + gripperCost + " " + grossCost + " " + discountCost + " " + netCost + " " + vatCost + " " + roomCost);
			System.out.printf("%16d %8.2f %5.2f %5.2f %6.2f %7.2f %5.2f %6.2f %6.2f %6.2f \n", i, carpetCost, offcutCost, underlayCost, gripperCost, grossCost, discountCost, netCost, vatCost, roomCost);

		}//for

		System.out.println("===============================================================================");
		//System.out.println("	    Totals: " + totalCarpetCost + "   " + totalOffcutCost + "   " + totalUnderlayCost + "    " + totalGripperCost + "  " + totalGrossCost + "   " + totalDiscCost + "  " + totalNetCost + "  " + totalVatCost + "  " + totalRoomCost);

		System.out.printf("%16s %8.2f %5.2f %5.2f %6.2f %7.2f %5.2f %6.2f %6.2f %6.2f \n", "Totals:",totalCarpetCost,totalOffcutCost,totalUnderlayCost,totalGripperCost,totalGrossCost,totalDiscCost,totalNetCost,totalVatCost,totalRoomCost);
		System.out.println("===============================================================================");
		System.out.println();
		System.out.println("Room " +lowestRoom + " has the lowest carpet cost of: " +lowestCarpet);
		System.out.println("Room " + highestRoom + " has the highest carpet cost of: " + highestCarpet);
		System.out.println();



	}//main

} // BoylePhilipPreLabExam1