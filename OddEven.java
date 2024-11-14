public class OddEven {
	public static void main (String[] args ) {

		for ( int x = 5; x <= 10;x++ ) { //odd
			if ( x == 9 ) { //dot for number 9
				System.out.println(".");
			} else if ( x % 2 == 1 ) { //odd no. printer
				System.out.println(x);
			} else if (x % 2 == 0 ) { //dot printer
				System.out.println(".");
			}
		} 
		
		for ( int y = 5; y <= 15;y++ ) { //even
			if ( y >= 9 ) { //dot for number 10
				System.out.println(".");
			} else if ( y % 2 == 0 ) { //even no. printer
				System.out.println(y);
			} else if ( y % 2 == 1 ) { //dot printer
				System.out.println(".");
			}
		}
	}
}