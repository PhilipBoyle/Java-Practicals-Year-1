//J34MinStockCreateDialog - Philip Boyle - G00325728 - 17/11/14
//The 1st file in J34, used to create an import file using while loop and dialog boxes

import javax.swing.JOptionPane;

import java.io.*;

public class J34MinStockCreateDialog
{
	public static void main(String[] args )
			throws FileNotFoundException
	{
		//create new file
		PrintWriter outStockFile = new PrintWriter("MinStockD.dat");
		final int SENTINEL_ID=99;
		int i=1,stockId,oldBal, issues,receipts,minStock,reorder;
		String str;

		str=JOptionPane.showInputDialog("\nEnter Stock 1 Details:");
		stockId=Integer.parseInt(str);

		while(stockId != SENTINEL_ID)
		{

			str=JOptionPane.showInputDialog("  Old Balance: ");
			oldBal=Integer.parseInt(str);
			str=JOptionPane.showInputDialog("  Issues: ");
			issues=Integer.parseInt(str);
			str=JOptionPane.showInputDialog("  Receipts: ");
			receipts=Integer.parseInt(str);
			str=JOptionPane.showInputDialog("  Min Stk Level: ");
			minStock=Integer.parseInt(str);
			str=JOptionPane.showInputDialog("  Re-Order Qty: ");
			reorder=Integer.parseInt(str);

			outStockFile.printf("%5d %5d %5d %5d %5d %5d %n", stockId,oldBal,issues,receipts,minStock,reorder);

			i+=1;
			str=JOptionPane.showInputDialog("\nEnter Stock "+i+" Details:");
			stockId=Integer.parseInt(str);

		}//while
		if((i-1)==0)
		{
			JOptionPane.showMessageDialog(null,"No valid data entered.","File Warning",JOptionPane.WARNING_MESSAGE);
		}
		else
		{
        JOptionPane.showMessageDialog(null,"MinStockD.dat has been created.","File Alert",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,(i-1)+" records written in MinStockD.dat","File information",JOptionPane.INFORMATION_MESSAGE);
		}

		//close file
		outStockFile.close();

	}//main

}//J34MinStockCreateDialog