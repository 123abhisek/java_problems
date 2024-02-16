package DSA;

class AA {
	public static boolean isprim(int number) {
		if (number <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] array = { 4, 7, 1, 13, 17, 19 };
		// int n = Array.length;
		AA num = new AA();
		int countprimes = 0;
		int nonprimecount = 0;

		for (int i : array) {
			if (isprim(i)) {
				countprimes++;
			} else {
				nonprimecount++;
			}
		}
		// System.out.println("The primes are "+countprimes);
		// System.out.println("The non primes are "+nonprimecount);

		int[] primenumber = new int[countprimes];
		int[] nonprimenumber = new int[nonprimecount];
		int primecount = 0;
		int nonprimecount1 = 0;

		for (int i = 0; i < array.length; i++) {
			if (isprim(array[i])) {
				primenumber[primecount++] = array[i];
//				System.out.println("prime number is " + primenumber[primecount]);
			}
		}
		for (int i = 0; i < array.length; i++) {
			if (!isprim(array[i])) {
				nonprimenumber[nonprimecount1++] = array[i];
//				System.out.println("Non prime number " + nonprimenumber[i]);
			}
		}
		int i = 0;
		while (i < primenumber.length && i < nonprimenumber.length) {
			System.out.println(
					"The prime number is : " + primenumber[i] + " The non prime number is " + nonprimenumber[i]);
			i++;
		}
		int count = 0;
		while (i < nonprimenumber.length) {
			count += nonprimenumber[i];
			System.out.println("The non prime number is : " + nonprimenumber[i]);
			i++;
		}
		while (i < primenumber.length) {
			count += primenumber[i];
			System.out.println("The prime number is : " + primenumber[i]);
			i++;
		}
		System.out.println(count);
	}
}
