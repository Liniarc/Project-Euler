package questions001to100;


public class Problem044 {
	/*
	 * Problem 44 - Pentagonal numbers
	 * 
	 * Pentagonal numbers are generated by the formula, Pn=n(3n-1)/2. The first
	 * ten pentagonal numbers are:
	 * 
	 * 1, 5, 12, 22, 35, 51, 70, 92, 117, 145, ...
	 * 
	 * It can be seen that P4 + P7 = 22 + 70 = 92 = P8. However, their
	 * difference, 70 - 22 = 48, is not pentagonal.
	 * 
	 * Find the pair of pentagonal numbers, Pj and Pk, for which their sum and
	 * difference are pentagonal and D = |Pk - Pj| is minimised; what is the
	 * value of D?
				63 - 45 = 18 108
	 */
	public static void main(String[] args) {
		long[] pent = new long[10000];
		for (int i = 0; i < 10000; i++) {
			pent[i] = (i + 1) * (3 * (i+1) -1) / 2;
		}

		for (int i = 0; i < 10000; i++) {
			for (int j = i; j >= 0; j--) {
				int lo = 0;
				int hi = pent.length - 1;
				while (lo <= hi) {
					int mid = lo + (hi - lo) / 2;
					if ((pent[i] - pent[j]) < pent[mid]) {
						hi = mid - 1;
					} else if ((pent[i] - pent[j]) > pent[mid]) {
						lo = mid + 1;
					} else {
						lo = 0;
						hi = pent.length - 1;
						while (lo <= hi) {	
							mid = lo + (hi - lo) / 2;
							if ((pent[i] + pent[j]) < pent[mid])
								hi = mid - 1;
							else if ((pent[i] + pent[j]) > pent[mid])
								lo = mid + 1;
							else {
								System.out.println(pent[i] - pent[j] + " - "
										+ pent[i] + ", " + pent[j]);
								break;
							}
						}
						break;
					}
				}
			}
		}
	}
}
