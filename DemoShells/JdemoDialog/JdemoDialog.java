// JdemoDialog - Gerry Agnew

import javax.swing.JOptionPane;

public class JdemoDialog
{
	public static void main(String[] args)
	{
		// No console I/O

		int num1 = 45, num2 = 56, sum;
		String str, name;

		// fig 3-7/p133
		name = JOptionPane.showInputDialog("Enter your name(+ENTER key)", "Initial");

		// fig 3-8/p133
		JOptionPane.showMessageDialog(null, "Hello " + name,
				"Greetings",JOptionPane.INFORMATION_MESSAGE);

		// Input/Parse/Message Box Integer from a String
		str = JOptionPane.showInputDialog("Enter an Integer", "123");
		num1 = Integer.parseInt(str) + 100;

		JOptionPane.showMessageDialog(null, "Integer plus 100 is: " + num1,
				"Show Integer",JOptionPane.INFORMATION_MESSAGE);

		// fig 3-9/p135
		JOptionPane.showMessageDialog(null, "Amount due = ? " + 123.45,
				"Invoice",JOptionPane.PLAIN_MESSAGE);

		// fig 3-10/p136
		str = "The two numbers are " + num1 + " and " + num2 + "\n";
		sum = num1 + num2;
		str += "The sum of the numbers is: " + sum + "\n";
		str += "That's all for now";

		JOptionPane.showMessageDialog(null, str,
					"Summing",JOptionPane.ERROR_MESSAGE);

		// fig 3-12 ++/p139
		double x = 15.647, y = 235.73, z = 9525.9864;
		str = "X = " + String.format("%.2f", x) + "\n";
		str += "Y = " + String.format("%.3f", y) + "\n";
		str += "Z = " + String.format("%.2f", z)+ "\n";

		JOptionPane.showMessageDialog(null, str,
						"3-12/3-14",JOptionPane.WARNING_MESSAGE);

		// Required at end
		System.exit(0);

	} // main

} // JdemoDialog