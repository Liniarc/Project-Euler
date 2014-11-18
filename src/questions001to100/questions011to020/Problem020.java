package questions001to100.questions011to020;

import java.math.BigInteger;

public class Problem020 {
	/*
	 * Problem 20 - Factorial digit sum
	 * 
	 * n! means n × (n - 1) * ... * 3 * 2 * 1
	 * 
	 * For example, 10! = 10 * 9 * ... * 3 * 2 * 1 = 3628800, and the sum of the
	 * digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
	 * 
	 * Find the sum of the digits in the number 100!
	 */
	public static void main(String[] args) {
		long START = System.currentTimeMillis();

		BigInteger pow = BigInteger.ONE;
		for (int i = 1; i < 100; i++)
			pow = pow.multiply(BigInteger.valueOf(i));
		String s = pow.toString();
		
		int sum = 0;
		for (int i = 0; i < s.length(); i++)
			sum+=Integer.parseInt(""+s.charAt(i));
		System.out.println("Sum - " + sum);
		
		long END = System.currentTimeMillis();
		System.out.println();
		if ((END - START) / 1000 > 2)
			System.out.println((END - START) / 1000 + " seconds");
		else
			System.out.println((END - START) + " ms");
	}
}
