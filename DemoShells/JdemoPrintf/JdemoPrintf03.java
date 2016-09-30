// JdemoPrintf03 - Gerry Agnew
// Demo simple printf method

public class JdemoPrintf03
{
	public static void main(String[] args )
	{
		int num = 96;
		double rate = 15.51;

		System.out.println();
		System.out.println("12345678901234567890");

		System.out.printf("%5d \n", num);

		System.out.printf("%5.2f \n", rate);

		System.out.printf("%5d%6.2f \n", num, rate);

		System.out.printf("%5d %6.2f \n", num, rate);

		System.out.println();

	} // main

} // JdemoPrintf03