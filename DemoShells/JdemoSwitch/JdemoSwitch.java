// J00DemoSwitch - Gerry Agnew
// Demo Java switch Selection statement

import java.util.*;

public class JdemoSwitch
{
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);

		int i, dayNum;
		String dayName;

		for (i =1; i <=3; i++)
		{
			System.out.print("\nEnter day number?: ");
			dayNum = console.nextInt();

			switch (dayNum)
			{
				case 1:
					dayName = "Sunday";
					break;
				case 2:
					dayName = "Monday";
					break;
				case 3:
					dayName = "Tuesday";
					break;
				case 4:
					dayName = "Wednesday";
					break;
				default:
					dayName = "Invalid day number entered";
			} // switch

			System.out.println("\nDay name is: " + dayName);

		} // for

	}  // main

} // JdemoSwitch


