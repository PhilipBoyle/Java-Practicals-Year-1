//J17QtyPriceDisc - Philip Boyle - G00325728 - 06/10/14
//A programme to calculate multiple line item costs.

import java.util.Scanner;

public class J17QtyPriceDisc
{
	public static void main(String[] args )
	{
		Scanner console = new Scanner(System.in);
		int i, qty, maxPurchase;
		double price, discRate, cost, netCost, discAmount, totalCost=0, totalDisc=0, totalNet=0, numCount=0, qtySum=0, average=0;
		System.out.print("\nPlease enter the number of purchases: ");
		maxPurchase = console.nextInt();

		System.out.println("\nJ17QtyPriceDisc               Item Qty Price   Cost    Disc   DisAmount   Net");
		System.out.println("=============================|====|===|======|=======|======|=========|========|");

		for (i = 1; i <= maxPurchase; ++i)
		{
			System.out.print("Qty/Price/Dics%: ");
			qty=console.nextInt();
			price=console.nextDouble();
			discRate=console.nextDouble();

			cost=qty*price;
			discAmount=cost*discRate/100;
			netCost=cost-discAmount;

			//System.out.println(i+" "+qty+" "+cost+" "+discRate+" " +discAmount+" "+netCost); (unformatted)
			System.out.printf("%33d %4d %6.2f %8.2f %7.2f %7.2f %8.2f \n", i, qty, price, cost, discRate, discAmount, netCost);//formatted
			totalCost = totalCost + cost;
			totalDisc = totalDisc + discAmount;
			totalNet = totalNet + netCost;

			if (qty>10)
			{
				qtySum = qtySum + qty;
				numCount=++numCount;
				average = qtySum/numCount;
			}//if Second Enhancment

		}//for
		//First Enhancment
		System.out.println("\n\tTotal Cost:     " +totalCost);
		System.out.println("\tTotal Discount: " +totalDisc);
		System.out.println("\tTotal Net Cost: " +totalNet);
		//Second Enhancment
		System.out.println("\nExceded Sales Limit:         " + numCount);
		System.out.println("Average Qty Execeded Sales: " + average);
		System.out.println();

	}//main

}//J17QtyPriceDisc