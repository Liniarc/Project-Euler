package questions001to100.questions031to040;

import helperClass.Helper;

public class Problem034 {
	/*
	 * Problem 34 - Digit factorials
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
		for (int i = 0; i < 100000; i++)
		{
			int[] dig = Helper.digitsOf(i);
			int s = 0;
			for (int j = 0; j < dig.length; j++)
			{
				s += Helper.factorial(dig[j]);
			}
			if (s == i)
			{
				sum+=i;
				System.out.println(i);
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
