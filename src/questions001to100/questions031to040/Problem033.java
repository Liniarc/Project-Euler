package questions001to100.questions031to040;

public class Problem033 {
	/*
	 * Problem 33 - Digit canceling fractions
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

		int sumd = 1, sumn = 1;

		for (int i = 10; i < 100; i++) {
			for (int j = 10; j < i; j++) {
				int i2 = 10, j2 = 10;
				if (i/10 == j%10)
				{
					i2 = i%10;
					j2 = j/10;
				}
				if (i%10 == j/10)
				{
					i2 = i/10;
					j2 = j%10;
				}
				if (i2 < 10 && j2 < 10)
				{
					if ((double)j2/i2 == (double)j/i)
					{
						System.out.println(j + " / " + i + " = " + (double)j/i);
						sumd *= i2;
						sumn *= j2;
					}
				}
			}
		}
		System.out.println(sumn + " / " + sumd);

		long END = System.currentTimeMillis();
		System.out.println();
		if ((END - START) / 1000 > 2)
			System.out.println((END - START) / 1000 + " seconds");
		else
			System.out.println((END - START) + " ms");
	}
}
