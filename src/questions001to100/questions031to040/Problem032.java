package questions001to100.questions031to040;

import java.util.HashSet;
import java.util.Set;

import helperClass.Helper;

public class Problem032 {
	/*
	 * Problem 32 - Coin sums
	 * 
	 * In England the currency is made up of pound, £, and pence, p, and there
	 * are eight coins in general circulation:
	 * 
	 * 1p, 2p, 5p, 10p, 20p, 50p, £1 (100p) and £2 (200p). It is possible to
	 * make £2 in the following way:
	 * 
	 * 1×£1 + 1×50p + 2×20p + 1×5p + 1×2p + 3×1p How many different ways can £2
	 * be made using any number of coins?
	 */
	public static void main(String[] args) {
		long START = System.currentTimeMillis();

		int sum = 0;
		for (int i = 1000; i < 10000; i++) {
			for (int j = 1; j < 100; j++) {
				if (i % j == 0) {
					int[] a = Helper.digitsOf(i);
					int[] b = Helper.digitsOf(j);
					int[] c = Helper.digitsOf(i / j);
					if (a.length + b.length + c.length != 9)
						continue;
					Set<Integer> digits = new HashSet<Integer>();
					boolean unique = true;
					digits.add(0);
					for (int val : a) {
						if (digits.contains(val))
							unique = false;
						digits.add(val);
					}
					for (int val : b) {
						if (digits.contains(val))
							unique = false;
						digits.add(val);
					}
					for (int val : c) {
						if (digits.contains(val))
							unique = false;
						digits.add(val);
					}
					if (unique) {
						sum+=i;
						System.out.println(j + " * " + i / j + " = " + i);
						break;
					}
				}
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
