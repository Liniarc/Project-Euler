package questions001to100.questions021to030;

public class Problem023 {
	/*
	 * Problem 23 - Non-abundant sums
	 * 
	 * A perfect number is a number for which the sum of its proper divisors is
	 * exactly equal to the number. For example, the sum of the proper divisors
	 * of 28 would be 1 + 2 + 4 + 7 + 14 = 28, which means that 28 is a perfect
	 * number.
	 * 
	 * A number n is called deficient if the sum of its proper divisors is less
	 * than n and it is called abundant if this sum exceeds n.
	 * 
	 * As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16, the
	 * smallest number that can be written as the sum of two abundant numbers is
	 * 24. By mathematical analysis, it can be shown that all integers greater
	 * than 28123 can be written as the sum of two abundant numbers. However,
	 * this upper limit cannot be reduced any further by analysis even though it
	 * is known that the greatest number that cannot be expressed as the sum of
	 * two abundant numbers is less than this limit.
	 * 
	 * Find the sum of all the positive integers which cannot be written as the
	 * sum of two abundant numbers.
	 */
	public static void main(String[] args) {
		long START = System.currentTimeMillis();

		long sum = 0;
		int[] nums = new int[7000];
		int abundant = 0;
		for (int i = 0; i < 28123; i++)
		{
			int a = 0;
			for (int div = 1; div <= Math.sqrt(i); div++)
				if (i%div==0)
				{
					a += div;
					if (i/div != div && div != 1)
						a+=i/div;
				}
			if (a > i )
			{
				nums[abundant] = i;
				abundant++;
			}
		}
		boolean[] abundantSum = new boolean[28123];
		for (int i = 0; i < abundant; i++)
			for (int j = 0; j < abundant; j++)
				if (nums[i]+nums[j]<28123)
					abundantSum[nums[i]+nums[j]] = true;
		for (int i = 0; i < 28123; i++)
			if (!abundantSum[i])
				sum += i;

		System.out.println("Sum - " + sum);
		
		
		long END = System.currentTimeMillis();
		System.out.println();
		if ((END - START) / 1000 > 2)
			System.out.println((END - START) / 1000 + " seconds");
		else
			System.out.println((END - START) + " ms");
	}
}
