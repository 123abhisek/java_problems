package DSA;

public class Prime_Number_Sequence {

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		int n = 6;
		int[] arr = { 4, 7, 1, 13,17,19};

		int primeCount = 0;
		int nonPrimeCount = 0;
		for (int i : arr) {
			if (isPrime(i)) {
				primeCount += 1;
			} else {
				nonPrimeCount += 1;
			}
		}

		int[] primeArr = new int[primeCount];
		int[] noPrimeArr = new int[nonPrimeCount];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (isPrime(arr[i])) {
				primeArr[count] = arr[i];
				count++;
			}
		}

		int count1 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (!isPrime(arr[i])) {
				noPrimeArr[count1] = arr[i];
				count1++;
			}
		}
	

		int i = 0;
		while (i < primeArr.length && i < noPrimeArr.length) {
			System.out.println(primeArr[i] + " is prime number \n" + noPrimeArr[i] + " is not prime number");
			i++;
		}
		int cost = 0;
		while (i < primeArr.length) {
			System.out.println(primeArr[i]+" is prime number");
			cost +=primeArr[i];
			i++;
		}

		while (i < noPrimeArr.length) {
			System.out.println(noPrimeArr[i]+" is not prime number");
			cost += noPrimeArr[i];
			i++;
		}

		System.out.println("\nThe cost of all sequence is " + cost);
	}

}
