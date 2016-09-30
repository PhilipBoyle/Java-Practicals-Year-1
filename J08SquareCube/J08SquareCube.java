// J08SquareCube - Philip Boyle - G00325728 - 23/09/14
// Make a table of numbers squared and cubed.

public class J08SquareCube
{
	public static void main(String[] args )
	{
		final int MAX_NUMBERS = 8;
		int i = 1;
		int numSq, numCb;

		//for (i = 1; i <=MAX_NUMBERS; i++)
		{
			//unformatted

			numSq = i*i;
			numCb = i*numSq;

			//System.out.println(i + " " + numSq + " "+ numCb);
			System.out.println();
		}

		String number = "Number",squared = "Squared",cubed = "Cubed";
		System.out.printf("%8s %12s %12s \n", number, squared, cubed);
		System.out.println("|========|==============|=============|");

		for (i = 1; i <=MAX_NUMBERS; i++)
		{
			//formatted with header

			numSq = i*i;
			numCb = i*numSq;

			System.out.printf("%6d %12d %13d \n", i, numSq, numCb);

		}
		System.out.println("|========|==============|=============|");

	}//main

}//J08SquareCube