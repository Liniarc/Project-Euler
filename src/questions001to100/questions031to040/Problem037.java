package questions001to100.questions031to040;

import helperClass.Helper;

public class Problem037 {
	public static void main(String[] args) {
		long START = System.currentTimeMillis();

		int sum = 0;
		int tot = 0;
		for (int i = 10; tot < 11; i ++)
		{
			if (!Helper.isPrime(i))
				continue;
			int[] digits = Helper.digitsOf(i);
			boolean isTrun = true;
			for (int j = 1; j < digits.length; j++) {
				if (digits[j]%2==0 || digits[j]%5 == 0)
				{
					isTrun = false;
					break;
				}
			}
			if (!isTrun)
				continue;
			for (int j = 1; j < digits.length; j++) {
				if (!Helper.isPrime(i/(int)Math.pow(10, j)))
				{
					isTrun = false;
					break;
				}
				if (!Helper.isPrime(i%(int)Math.pow(10, j)))
				{
					isTrun = false;
					break;
				}
			}
			if (!isTrun)
				continue;
			tot++;
			sum+=i;
		}
		System.out.println(sum);

		long END = System.currentTimeMillis();
		System.out.println();
		if ((END - START) / 1000 > 10)
			System.out.println((END - START) / 1000 + " seconds");
		else
			System.out.println((END - START) + " ms");
	}
}
