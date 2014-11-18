package questions001to100.questions031to040;

public class Problem031 {
	/*
	 * Problem 31 - Coin sums
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
		
		int tot = 0;
		for (int i = 0; i*200<=200; i++) {
			for (int j = 0; i*200+j*100<=200; j++) {
				for (int k = 0; i*200+j*100+k*50<200; k++) {
					for (int l = 0; i*200+j*100+k*50+l*20<=200; l++) {
						for (int m = 0; i*200+j*100+k*50+l*20+m*10<=200; m++) {
							for (int n = 0; i*200+j*100+k*50+l*20+m*10+n*5<200; n++) {
								for (int o = 0; 200 - i*200+j*100+k*50+l*20+m*10+n*5+o*2<=200; o++) {
									tot++;
								}
							}
						}
					}
				}
			}
		}
		System.out.println(tot);
		
		long END = System.currentTimeMillis();
		System.out.println();
		if ((END - START) / 1000 > 2)
			System.out.println((END - START) / 1000 + " seconds");
		else
			System.out.println((END - START) + " ms");
	}
}
