package questions001to100.questions021to030;



public class Problem030 {
	/*
	 * Problem 30 - Digit fifth powers
	 * 
	 * Surprisingly there are only three numbers that can be written as the sum
	 * of fourth powers of their digits:
	 * 
	 * 1634 = 1^4 + 6^4 + 3^4 + 4^4
	 * 8208 = 8^4 + 2^4 + 0^4 + 8^4
	 * 9474 = 9^4 + 4^4 + 7^4 + 4^4
	 * As 1 = 1^4 is not a sum it is not included.
	 * 
	 * The sum of these numbers is 1634 + 8208 + 9474 = 19316.
	 * 
	 * Find the sum of all the numbers that can be written as the sum of fifth
	 * powers of their digits.
	 */
	public static void main(String[] args) {
		long START = System.currentTimeMillis();
		
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k < 10; k++) {
					for (int l = 0; l < 10; l++) {
						for (int m = 0; m < 10; m++) {
							for (int n = 0; n < 10; n++) {
							if (i*i*i*i*i+j*j*j*j*j+k*k*k*k*k+l*l*l*l*l+m*m*m*m*m+n*n*n*n*n == n*100000+i*10000+j*1000+k*100+l*10+m)
								sum += n*100000+i*10000+j*1000+k*100+l*10+m;
							}
						}
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
