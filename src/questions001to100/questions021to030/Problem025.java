package questions001to100.questions021to030;

import java.math.BigInteger;

public class Problem025 {
	/*
	 * Problem 25 - 1000-digit Fibonacci number
	 * 
	 * The Fibonacci sequence is defined by the recurrence relation:
	 * 
	 * F_n = F_(n-1) + F_(n-2), where F_1 = 1 and F_2 = 1.
	 * 
	 * What is the first term in the Fibonacci sequence to contain 1000 digits?
	 */
	public static void main(String[] args) {
		long START = System.currentTimeMillis();

		BigInteger i = BigInteger.ONE;
		BigInteger j = BigInteger.ONE;
		int n = 2;
		while ( j.toString().length()<1000) {
			i = i.add(j);
			j = j.add(i);
			n+=2;
		}
		
		System.out.println(i.toString().length()<1000?n:n-1);

		long END = System.currentTimeMillis();
		System.out.println();
		if ((END - START) / 1000 > 2)
			System.out.println((END - START) / 1000 + " seconds");
		else
			System.out.println((END - START) + " ms");
	}
}
