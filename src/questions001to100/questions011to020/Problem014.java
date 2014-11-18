package questions001to100.questions011to020;

public class Problem014 {
	/*
	 * Problem 14 - Longest Collatz sequence
	 * 
	 * The following iterative sequence is defined for the set of positive
	 * integers:
	 * 
	 * n -> n/2 (n is even) n -> 3n + 1 (n is odd)
	 * 
	 * Using the rule above and starting with 13, we generate the following
	 * sequence:
	 * 
	 * 13 -> 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
	 * 
	 * It can be seen that this sequence (starting at 13 and finishing at 1)
	 * contains 10 terms. Although it has not been proved yet (Collatz Problem),
	 * it is thought that all starting numbers finish at 1.
	 * 
	 * Which starting number, under one million, produces the longest chain?
	 * 
	 * NOTE: Once the chain starts the terms are allowed to go above one
	 * million.
	 */
	public static void main(String[] args) {
		long START = System.currentTimeMillis();
		
		long maxNum = 0;
		long max = 0;
		long[] lengths = new long[1000001];
		for (int i = 1; i < 1000000; i++) {
			long num = i, length = 0;
			while (num > 1) {
				num = num % 2 != 0 ? 3 * num + 1 : num / 2;
				length++;
				if (num < i)
				{
					length+= lengths[(int) num];
					break;
				}
			}
			lengths[i] = length;
			if (length > max)
			{
				max = length;
				maxNum = i;
			}
		}
		System.out.println("Num - " + maxNum);

		long END = System.currentTimeMillis();
		System.out.println();
		if ((END - START) / 1000 > 2)
			System.out.println((END - START) / 1000 + " seconds");
		else
			System.out.println((END - START) + " ms");
	}
}
