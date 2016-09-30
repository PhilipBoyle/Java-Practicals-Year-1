//J22NestedStars - Philip Boyle - G00325728 - 23/10/14
//
public class J22NestedStars
{
	public static void main(String[] args)
	{
		final int MAX_STARS=6;
		int i, j;
		System.out.println("J22 - Nested Star Display");
		System.out.println("================================================================");

		for(i=1;i<=MAX_STARS;i++)
		{
			System.out.println();

			System.out.print("\t");
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}

		}//for
		System.out.println();

	}//main

}//J22NestedStars