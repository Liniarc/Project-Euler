package questions001to100.questions001to010;

public class Problem010 {
	/*
	 * Problem 10 - Summation of primes
	 * 
	 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
	 * 
	 * Find the sum of all the primes below two million.
	 */
	public static void main(String[] args) {
		long START = System.currentTimeMillis();
		
		int[] primes = new int[1000000];
		int numPrimes = 0;
		long sum = 0;
		for (int i = 2; i<2000000; i+=1) {
			boolean isPrime = true;
			for (int j = 0; j < numPrimes; j++) {
				if (i % primes[j] == 0) {
					isPrime = false;
					break;
				}
				if (primes[j]>Math.sqrt(i))
					break;
			}
			if (isPrime) {
				primes[numPrimes] = i;
				sum+=i;
				numPrimes++;
			}
		}

		System.out.println("Sum - " + sum);

		long END = System.currentTimeMillis();
		System.out.println();
		if ((END-START)/1000 > 0)
			System.out.println((END-START)/1000 + " seconds");
		else
			System.out.println((END-START) + " ms");
	}
}
