// J28SmallestEqn - Philip Boyle - G00325728 - 09/10/14
//Determine, remember, and output the smallest value of Y in a given equation

public class J28SmallestEqn
{
	public static void main(String[] args )
	{
		int x, y, smallestY=999999, smallestX=0;
		System.out.println("    x     y");
		System.out.println("==============");

		for(x=-3;x<=3;++x)
		{
			y=2*(int)Math.pow(x,2)-5*x-20;

			System.out.printf("%5d %5d \n", x, y);
			System.out.println();

			if(y < smallestY)
			{
				smallestY = y;
				smallestX = x;
			}//if

		}//for

		System.out.println("The Smallest Y is: " +smallestY+ " for X = " +smallestX);
		System.out.println();

	}//main

}//J28SmallestEqn