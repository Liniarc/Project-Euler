package questions001to100.questions001to010;

public class Problem008 {
	/*
	 * Problem 8 - Special Pythagorean triplet
	 * 
	 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for
	 * which,
	 * 
	 * a^2 + b^2 = c^2 For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
	 * 
	 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
	 * Find the product abc.
	 */
	public static void main(String[] args) {

		for (int a = 0; a < 333; a++) {
			for (int b = a; b < 500; b++) {
				int c = (int)Math.sqrt(a * a + b * b);
				if (c == Math.sqrt(a * a + b * b)) {
					if (a + b + c == 1000)
						System.out.println("[" + a + " " + b + " " + c + "] - "
								+ a * b * c);
					if (a + b + c > 1000)
						break;
				}
			}
		}
	}
}
