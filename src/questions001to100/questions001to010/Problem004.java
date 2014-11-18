package questions001to100.questions001to010;

public class Problem004 {
	/*
	 * Problem 4 - Largest palindrome product
	 * 
	 * A palindromic number reads the same both ways. The largest palindrome
	 * made from the product of two 2-digit numbers is 9009 = 91 × 99.
	 * 
	 * Find the largest palindrome made from the product of two 3-digit numbers.
	 */
	public static void main(String[] args) {
		int max = 0;
		for (int i = 100; i < 1000; i++)
			for (int j = i; j < 1000; j++) {
				String val = "" + i * j;
				boolean palindrome = true;
				for (int c = 0; c < val.length() / 2; c++) {
					if (val.charAt(c) != val.charAt(val.length() - 1 - c))
						palindrome = false;
				}
				if (palindrome && i * j > max) {
					max = i * j;
				}
			}
		System.out.print("Max - " + max);
	}
}
