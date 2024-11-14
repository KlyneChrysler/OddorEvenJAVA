import java.util.Scanner;

public class OddorEven {
	public static void main ( String[] args ) {
		Scanner scan = new Scanner ( System.in );

		double number;
		double x;

		System.out.print("INPUT NUMBER FROM 1-10: ");
		number = scan.nextDouble();

		if ( number <= 10 ) {
			x = ((number * 3) / 2);
				System.out.println(x);
				if (x % 2 == 0 ) {
					System.out.println("IT'S A PERFECT NUMBER");
				} else if ( x % 2 == 1 ) {
					System.out.println("NOT A PERFECT NUMBER");
				} else {
					System.out.print("NUMBER IS NOT AN INTEGER, NEITHER AN EVEN OR ODD");
				}
		} else {
			System.out.print("INPUT NUMBER 1-10 ONLY.");
		} 
	}
}