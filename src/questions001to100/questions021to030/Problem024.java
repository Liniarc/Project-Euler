package questions001to100.questions021to030;

public class Problem024 {
	/*
	 * Problem 24 - Lexicographic permutations
	 * 
	 * A permutation is an ordered arrangement of objects. For example, 3124 is
	 * one possible permutation of the digits 1, 2, 3 and 4. If all of the
	 * permutations are listed numerically or alphabetically, we call it
	 * lexicographic order. The lexicographic permutations of 0, 1 and 2 are:
	 * 
	 * 012 021 102 120 201 210
	 * 
	 * What is the millionth lexicographic permutation of the digits 0, 1, 2, 3,
	 * 4, 5, 6, 7, 8 and 9?
	 */
	public static void main(String[] args) {
		long START = System.currentTimeMillis();

		long p = 10*9*8*7*6*5*4*3*2*1;
		int n = 1000000;
		boolean[] d = new boolean[10];
		
		n--;
		for (int i = 10; i > 0; i--)
		{
			p/=i;
			long digit = n/p;
			for (int j = 0; j <= digit; j ++)
				if (d[j])
				{
					digit++;
				}
			System.out.print(digit);
			d[(int) digit] = true;
			n-=(n/p)*p;
		}
		System.out.println();
		
		long END = System.currentTimeMillis();
		System.out.println();
		if ((END - START) / 1000 > 2)
			System.out.println((END - START) / 1000 + " seconds");
		else
			System.out.println((END - START) + " ms");
	}
}
