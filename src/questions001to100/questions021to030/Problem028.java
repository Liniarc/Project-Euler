package questions001to100.questions021to030;

public class Problem028 {
	/*
	 * Problem 28 - Number spiral diagonals
	 * 
	 * Starting with the number 1 and moving to the right in a clockwise
	 * direction a 5 by 5 spiral is formed.
	 * 
	 * It can be verified that the sum of the numbers on the diagonals is 101.
	 * 
	 * What is the sum of the numbers on the diagonals in a 1001 by 1001 spiral
	 * formed in the same way?
	 */
	public static void main(String[] args) {
		long START = System.currentTimeMillis();

	      int sum = 1;
	      int val = 1;
	      for (int i = 1; i <= 500; i++) {
	         for (int j = 0; j < 4; j++) {
	            val += i*2;
	            sum += val;
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
