//J32aRadioRevenue - Philip Boyle - G00325728 - 10/11/14
//Calculate and Compare a radio stations revenue using while loop
import java.util.Scanner;

public class J32aRadioRevenue
{
	public static void main(String[] args )
	{
		//constants
		final double BONUS_SUM=1000.00, BONUS_RATE=.025;
		final String SENTINEL_HOST="stop";


		//variables
		int progNum=1, lastYear, thisYear, yearTarget, targetInc, overTarget, onTarget=0;
		String hostName;
		double bonus, totalBonus=0.00;
		//highest
		int highestRev=0;
		String bestHost="a";

		Scanner console = new Scanner(System.in);

		System.out.println("                      Name  Prog    Last  Target    This     Bonus");
		System.out.println("=========================================================================");
		System.out.print("Program 1 Details\n");
		System.out.print("  Name ('stop' to end): ");
		hostName=console.nextLine();

		while (hostName.equalsIgnoreCase(SENTINEL_HOST)==false)
		{
			System.out.print("  Last Year: ");
			lastYear=console.nextInt();
			System.out.print("  This Year: ");
			thisYear=console.nextInt();
			System.out.print("  Target Inc%: ");
			targetInc=console.nextInt();
			yearTarget=lastYear*targetInc/100+lastYear;

			//fomatted
			System.out.printf("%27s %4d %7d %7d %7d " ,hostName,progNum,lastYear,yearTarget,thisYear);

			if(thisYear>=yearTarget)
			{
				overTarget=thisYear-yearTarget;
				bonus = overTarget*BONUS_RATE + BONUS_SUM;

				System.out.printf("%9.2f",bonus);
				totalBonus+=bonus;
				onTarget+=1;

			}//if

			System.out.println();

			if(thisYear>highestRev)
			{
				highestRev=thisYear;
				bestHost=hostName;
			}//highest if

			//flush buffer
			console.nextLine();

			progNum+=1;
			System.out.print("Program "+progNum+ " Details\n");
			System.out.print("  Name: ");
			hostName=console.nextLine();

		}//while
		System.out.println("Total Bonus is:     " +totalBonus);
		System.out.println("Programmes on Target:  "+onTarget);
		System.out.println(bestHost+ " has the highest revenue of:  " +highestRev);


	}//main

}//J32aRadioRevenue