package questions001to100;

import helperClass.Helper;

public class Problem041 {
	public static void main(String[] args) {
		long START = System.currentTimeMillis();

		int i =  7654321;
		while ( !Helper.isPandigital(i) || !Helper.isPrime(i))
			i-=2;
		System.out.println(i);
		
		
		long END = System.currentTimeMillis();
		System.out.println();
		if ((END - START) / 1000 > 2)
			System.out.println((END - START) / 1000 + " seconds");
		else
			System.out.println((END - START) + " ms");
	}
}
