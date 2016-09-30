// JdemoString - Gerry Agnew

// s = console.nextLine() for String input
// a == b, a != b	Compares references, not values (DO NOT USE)
// a.equals(b)	 	Compares values for equality (boolean)
// a.compareTo(b)	Compares values and returns an int showing
//					if compared values are less, equal or greater
// equalsIgnoreCase() and compareToIgnoreCase()

import java.util.Scanner;

public class JdemoString
{
	public static void main(String[] args )
	{
		Scanner console = new Scanner(System.in);
		int cnt;
		String s1, s2;

		for (cnt = 1; cnt <= 3; cnt++)
		{
			System.out.print("\nEnter s1: ");
			s1 = console.nextLine();
			System.out.print("Enter s2: ");
			s2 = console.nextLine();

			System.out.println("\nString s1 contains: " + s1 + " with length: " +s1.length());
			System.out.println("String s1 Upper Case: " + s1.toUpperCase());

			System.out.println("String s2 contains: " + s2 + " with length: " +s2.length());
			System.out.println("String s2 Lower Case: " + s2.toLowerCase());

			// String comparasion using equals() - returns boolean T/F

			if (s1.equals(s2)) { // == true implied
				System.out.printf("%10s equals %10s%n", s1, s2);
			}
			else {
				System.out.printf("%10s NOT equals %10s%n", s1, s2);
			}

			// String comparasion using equalsIgnoreCase() - returns boolean T/F

			if (s1.equalsIgnoreCase(s2) == true) {
				System.out.printf("%10s equalsIgnoreCase %10s%n", s1, s2);
			}
			else {
				System.out.printf("%10s NOT equalsIgnoreCase %10s%n", s1, s2);
			}

			// String comparasion using compareTo() - returns int

			if (s1.compareTo(s2) < 0) {
				System.out.printf("%10s compareTo (less than) %10s%n", s1, s2);
			}
			else if (s1.compareTo(s2) > 0) {
				System.out.printf("%10s compareTo (greater than) %10s%n", s1, s2);
			}
			else { // Otherwise == 0 implied
				System.out.printf("%10s compareTo (equal) %10s%n", s1, s2);
			}

			//console.nextLine();			// flush buffer

		}//for

	}  // main

} // JdemoString