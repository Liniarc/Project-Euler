package questions001to100.questions031to040;

import helperClass.Helper;

public class Problem036 {
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

		int sum = 0;
		for (int i = 0; i < 999; i++) {
			int a = (int) (i * Math.pow(10,(""+i).length()));;
			int b = (int)Helper.reverseDigits(i);
			if (Helper.isPalindrome(Integer.toBinaryString(a+b)))
			{
				sum += a+b;
				System.out.println(a+b + " - " + Integer.toBinaryString(a+b));
			}
		}
		
		for (int i = 0; i < 999; i++) {
			int a = (int) (i * Math.pow(10,(""+i).length()-1));;
			int b = (int)(Helper.reverseDigits(i)%Math.pow(10,(""+i).length()-1));
			if (Helper.isPalindrome(Integer.toBinaryString(a+b)))
			{
				sum += a+b;
				System.out.println(a+b + " - " + Integer.toBinaryString(a+b));
			}
		}
		System.out.println(sum);

		long END = System.currentTimeMillis();
		System.out.println();
		if ((END - START) / 1000 > 2)
			System.out.println((END - START) / 1000 + " seconds");
		else
			System.out.println((END - START) + " ms");
	}
}
