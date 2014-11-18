package questions001to100.questions031to040;

import helperClass.Helper;

public class Problem038 {
	public static void main(String[] args) {
		long START = System.currentTimeMillis();

		int max = 0;
		for (int i = 9001; i < 9999; i++) {
			int val = (i*100000+i*2);
			int[] digits = Helper.digitsOf(val);
			boolean isPandigital = true;
			outerLoop: for (int j = 0; j < digits.length; j++) {
				if (digits[j] == 0)
				{
					isPandigital = false;
					break outerLoop;
				}
				for (int k = 0; k < j; k++) {
					if (digits[j] == digits[k])
					{
						isPandigital = false;
						break outerLoop;
					}
				}
			}
			if (isPandigital)
			{
				max = val;
			}
		}
		 System.out.println(max);

		long END = System.currentTimeMillis();
		System.out.println();
		if ((END - START) / 1000 > 2)
			System.out.println((END - START) / 1000 + " seconds");
		else
			System.out.println((END - START) + " ms");
	}
}
