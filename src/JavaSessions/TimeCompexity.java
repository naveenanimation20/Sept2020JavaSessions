package JavaSessions;

public class TimeCompexity {

	public static void main(String[] args) {

		// O(n)
		// O(1)
		// Big O(n)

		int i = 10; // O(1)
		System.out.println(i);// O(1)

		// single for loop: //O(n)
		for (int k = 1; k <= 10; k++) {
			System.out.println(k);
		}

		// 1 + n + n + n ==> 1+3n ==> 3n ==> n ==> O(n)
		// linear equation

		System.out.println("----------");
		// two for loops:
		// 00 01 02 03 04 05
		// 10 11 12 13 14 15
		// two for loops:

		for (int m = 0; m < 10; m++) {

			for (int n = 0; n < 10; n++) {

				System.out.print(m + "" + n + " ");

			}

			System.out.println();

		}
		// (1 + n + n + n) (1+ n + n + n) ==> (1+3n)(1+3n) ==>  1+3n+3n+9n^2 ==> 9n^2+6n+1 ==> 9n^2+6n ==> 3(3n^2+2n)
		// ==> n^2+n ==> n(n+1) ==> n^2
		//Quadratic equation ==> O(n^2)
		
		//O(n^k) ; k>=0
		

	}

}
