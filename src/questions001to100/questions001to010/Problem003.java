package questions001to100.questions001to010;

public class Problem003 {
	/*
	 * Problem 3 - Largest prime factor
	 * 
	 * The prime factors of 13195 are 5, 7, 13 and 29.
	 * 
	 * What is the largest prime factor of the number 600851475143?
	 */
	public static void main(String[] args) {
		int max = 0;
		long n = 600851475143l;
		for (int i = 2; n != 1; i++) {
			if (n % i == 0) {
				n /= i;
				max = i;
				i--;
			}
		}
		System.out.print("Max - " + max);
	}
}
