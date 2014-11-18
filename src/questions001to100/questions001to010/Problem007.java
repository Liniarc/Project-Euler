package questions001to100.questions001to010;

public class Problem007 {
	/*
	 * Problem 7 - 10001st prime
	 * 
	 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can
	 * see that the 6th prime is 13.
	 * 
	 * What is the 10 001st prime number?
	 */
	public static void main(String[] args) {
		int[] primes = new int[10001];
		int numPrimes = 0;
		for (int i = 2; numPrimes < 10001; i++) {
			boolean isPrime = true;
			for (int j = 0; j < numPrimes; j++)
			{
				if (i%primes[j]==0)
				{
					isPrime = false;
					break;
				}
				if (primes[j]>Math.sqrt(i))
					break;
			}
			if (isPrime)
			{
				primes[numPrimes] = i;
				numPrimes++;
			}
		}
		
		System.out.println("Prime - " + primes[10000]);
	}
}
