package Problems;

// 		231. Power of Two

public class Power_of_Two_231 {

	/* Logic 1 */
//	public static boolean isPowerOfTwo(int n) {
//
//		for (int i = 0; i < 32; i++) {
//			if(Math.pow(2, i) == n) {
//				return true;
//			}
//		}
//
//		return false;
//	}

	/* Logic 2 */
	public static boolean isEven(int n) {
		return (n % 2 == 0) ? true : false;
	}

	public static boolean isPowerOfTwo(int n) {
		if (n == 1) {
			return true;
		} else if (!isEven(n) || n <= 0) {
			return false;
		} else {
			int n1 = n;
			int count = 0;
			while (n != 1) {
				count = count +1;;
				n = n / 2;
			}
			if(Math.pow(2, count)== n1) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int n = 0;
		System.out.println(isPowerOfTwo(n));

	}

}
