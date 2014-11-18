package questions001to100.questions011to020;

import java.math.BigInteger;

public class Problem016 {
	/*
	 * Problem 16 - Power digit sum
	 * 
	 * 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
	 * 
	 * What is the sum of the digits of the number 2^1000?
	 */
	public static void main(String[] args) {
		long START = System.currentTimeMillis();

		BigInteger pow = BigInteger.ONE;
		for (int i = 0; i < 1000; i++)
			pow = pow.multiply(BigInteger.valueOf(2));
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
