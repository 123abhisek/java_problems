package Problems;

// 279. Perfect Squares

public class Perfect_Squares_279 {

	public static boolean isPerfectSquare(int num) {
		double val = Math.sqrt(num);
		if ((val - Math.floor(val)) == 0.0)
			return true;
		else
			return false;
	}

	public static int numSquares(int n) {

//		System.out.println(isPerfectSquare(1));

		int count = 2;
		while (count <= n) {
			if (isPerfectSquare(count)) {
				int result = n - count;
				if () {
					
				}
				System.out.println(result);
			} else
				count++;
		}

		return 0;
	}

	public static void main(String[] args) {

		int n = 12; // output : 3
//		int n = 13 // output : 2

		System.out.println(numSquares(n));

	}

}
