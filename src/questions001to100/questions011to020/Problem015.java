package questions001to100.questions011to020;

public class Problem015 {
	/*
	 * Problem 15 - Lattice paths
	 * 
	 * Starting in the top left corner of a 2×2 grid, and only being able to
	 * move to the right and down, there are exactly 6 routes to the bottom
	 * right corner.
	 * 
	 * How many such routes are there through a 20×20 grid?
	 */
	public static void main(String[] args) {
		long START = System.currentTimeMillis();

		long product = 1;
		for (int i = 40; i > 20; i --)
		{
			product*=i;
			product/=41-i;
		}
		System.out.println((long)product);

		long END = System.currentTimeMillis();
		System.out.println();
		if ((END - START) / 1000 > 2)
			System.out.println((END - START) / 1000 + " seconds");
		else
			System.out.println((END - START) + " ms");
	}
}
