package questions001to100.questions021to030;


public class Problem021 {
	/*
	 * Problem 21 - Amicable numbers
	 * 
	 * Let d(n) be defined as the sum of proper divisors of n (numbers less than
	 * n which divide evenly into n). If d(a) = b and d(b) = a, where a != b,
	 * then a and b are an amicable pair and each of a and b are called amicable
	 * numbers.
	 * 
	 * For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22,
	 * 44, 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1,
	 * 2, 4, 71 and 142; so d(284) = 220.
	 * 
	 * Evaluate the sum of all the amicable numbers under 10000.
	 */
	public static void main(String[] args) {
		long START = System.currentTimeMillis();

		long sum = 0;
		for (int i = 0; i < 10000; i++)
		{
			int a = 0;
			for (int div = 1; div <= Math.sqrt(i); div++)
				if (i%div==0)
				{
					a += div;
					if (i/div != div && div != 1)
						a+=i/div;
				}
			if (a == i)
				continue;
			int b = 0;
			for (int div = 1; div <= Math.sqrt(a); div++)
				if (a%div==0)
				{
					b += div;
					if (a/div != div && div != 1)
						b+=a/div;
				}
			if (b == i)
			{
				sum+=i;
			}
		}
		System.out.println("Sum - " + sum);
		long END = System.currentTimeMillis();
		System.out.println();
		if ((END - START) / 1000 > 2)
			System.out.println((END - START) / 1000 + " seconds");
		else
			System.out.println((END - START) + " ms");
	}
}
