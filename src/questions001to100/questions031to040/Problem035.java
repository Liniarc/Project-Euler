package questions001to100.questions031to040;

import helperClass.Helper;

public class Problem035 {
	/*
	 * Problem 35 - Circular primes
	 * 
	 * The number, 197, is called a circular prime because all rotations of the
	 * digits: 197, 971, and 719, are themselves prime.
	 * 
	 * There are thirteen such primes below 100: 2, 3, 5, 7, 11, 13, 17, 31, 37,
	 * 71, 73, 79, and 97.
	 * 
	 * How many circular primes are there below one million?
	 */
	public static void main(String[] args) {
		long START = System.currentTimeMillis();

		int tot = 0;
		for (int i = 0; i < 1000000; i++) {
			if (!Helper.isPrime(i))
			{
				continue;
			}
			int[] digits = Helper.digitsOf(i);
			boolean isCircular = true;
			for (int j = 1; j < digits.length; j++)
			{
				if (digits[j]%2==0||digits[j]%5==0)
				{
					isCircular=false;
					break;
				}
			}
			for (int j = 1; j < digits.length; j++)
			{
				int temp = digits[0];
				for (int k = 0; k < digits.length-1; k++)
					digits[k] = digits[k+1];
				digits[digits.length-1] = temp;
				if (!Helper.isPrime(Helper.valueOfDigits(digits)))
				{
					isCircular = false;
					break;
				}
			}
			if (isCircular)
			{
				tot++;
				System.out.println(i);
			}
			
		}
		System.out.println(tot);

		long END = System.currentTimeMillis();
		System.out.println();
		if ((END - START) / 1000 > 2)
			System.out.println((END - START) / 1000 + " seconds");
		else
			System.out.println((END - START) + " ms");
	}
}
