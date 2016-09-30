//J18EqnFor2 - Philip Boyle - G00325728 - 06/10/14
//A programme to calculate Y using a given equation.

public class J18EqnFor2
{
	public static void main(String[] args )
	{
		final int MAX_NUMBERS = 8;
		int x, y, sqr, i;
		//output header here later
		System.out.println("J18EqnFor2     x    y");
		System.out.println("=============|===|====|");

		for (i=1; i<=MAX_NUMBERS; ++i)
		{
			x=i;
			sqr=x*x;
			y=3*sqr+2*x-4;
			//System.out.println("\n" + x + " " + y);
			System.out.printf("\n %15d %5d",x,y);
		}//for

		System.out.println();

	}//main

}//J18EqnFor2