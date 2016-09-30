// JdemoPrintf04 - Gerry Agnew
// Demo simple printf method - Before/After
// Regular sized columns with left/right justification

public class JdemoPrintf04
{
	public static void main(String[] args )
	{
		int num = 96;
		double rate = 15.51;
		String name = "Gerry Agnew";
		System.out.println(name + " " + num + " " + rate);

		num = 1096;
		rate = 115.5167;
		name = "Paddy O'Reilly";
		System.out.println(name + " " + num + " " + rate);

		num = 1;
		rate = .5;
		name = "Mo";
		System.out.println(name + " " + num + " " + rate);

		System.out.println();

		num = 96;
		rate = 15.51;
		name = "Gerry Agnew";
		System.out.printf("%-15s %5d %6.2f \n", name, num, rate);

		num = 1096;
		rate = 115.5167;
		name = "Paddy O'Reilly";
		System.out.printf("%-15s %5d %6.2f \n", name, num, rate);

		num = 1;
		rate = .5;
		name = "Mo";
		System.out.printf("%-15s %5d %6.2f \n", name, num, rate);
		System.out.println();

	} // main

} // JdemoPrintf0404