//J23SumForCubes - Philip Boyle - G00325728 - 23/10/14
//
public class J23SumForCubes
{
	public static void main(String[] args)
	{
		int i, cubeSum=0;

		for(i=8;i>=1;i--)
		{
			//System.out.println(i + " " + (int)Math.pow(i,3));
			System.out.print("%3d %4d",i,(int)Math.pow(i,3));

			cubeSum+=(int)Math.pow(i,3);
		}//for

		System.out.println("\nThe sum of the cudes is: " +cubeSum);

	}//main

}//J23SumForCubes