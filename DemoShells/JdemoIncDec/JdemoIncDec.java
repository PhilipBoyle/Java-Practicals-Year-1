// JdemoIncDec - Gerry Agnew - Java increment & decrement operators
// num1 = num1 + 1; ==> ++num1; And num1 = num1 - 1; ==> --num1;

public class JdemoIncDec
{
	public static void main( String[] args )
	{
		int num1 = 5, num2 = 3;

		System.out.println("01) Assign      \t num1 = " + num1 + "\t num2 = " + num2);

		++num1;
		System.out.println("02) ++num1      \t num1 = " + num1 + "\t num2 = " + num2);

		num1++;
		System.out.println("03) num1++      \t num1 = " + num1 + "\t num2 = " + num2);

		--num2;
		System.out.println("04) --num2      \t num1 = " + num1 + "\t num2 = " + num2);

		num2--;
		System.out.println("05) num2--      \t num1 = " + num1 + "\t num2 = " + num2);

		num2 = ++num1;
		System.out.println("06) num2=++num1 \t num1 = " + num1 + "\t num2 = " + num2);

		num2 = num1++;
		System.out.println("07) num2=num1++ \t num1 = " + num1 + "\t num2 = " + num2);

		num1=--num2;
		System.out.println("08) num1=--num2 \t num1 = " + num1 + "\t num2 = " + num2);

		num1=num2--;
		System.out.println("09) num1=num2-- \t num1 = " + num1 + "\t num2 = " + num2);

		num2 += num1;
		System.out.println("10) num2+=num1  \t num1 = " + num1 + "\t num2 = " + num2);

		num1 -= num1 - 3;
		System.out.println("11) num1-=num1-3  \t num1 = " + num1 + "\t num2 = " + num2);

		num2 *= num1;
		System.out.println("12) num2*=num1  \t num1 = " + num1 + "\t num2 = " + num2);

		num2 /= num1;
		System.out.println("13) num2/=num1  \t num1 = " + num1 + "\t num2 = " + num2);

		System.out.println();

	}  // main
} // JdemoIncDec