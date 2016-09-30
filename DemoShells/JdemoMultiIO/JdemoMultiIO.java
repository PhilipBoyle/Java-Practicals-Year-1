// JdemoMultiIO - Gerry Agnew
// Demo Java multi number input from keyboard & Output to monitor
import java.util.Scanner;

public class JdemoMultiIO
{
	public static void main(String[] args )
	{
		// Constants & Variables here

		Scanner console = new Scanner(System.in);
		int myInt, myInt2;
		double myDouble;

		// Multi number Input

		System.out.print("Enter 3 Integer, Decimal, Integer Values: ");

		myInt = console.nextInt();
		myDouble = console.nextDouble();
		myInt2 = console.nextInt();

		System.out.println("Integer entered was: " + myInt);
		System.out.println("Decimal entered was: " + myDouble);
		System.out.println("Integer entered was: " + myInt2);

	}  // main
} // JdemoMultiIO