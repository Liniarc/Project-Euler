package questions001to100.questions001to010;

public class Problem002 {
	/*
	 * Problem 2 - Even Fibonacci numbers
	 * 
	 * Each new term in the Fibonacci sequence is generated by adding the
	 * previous two terms. By starting with 1 and 2, the first 10 terms will be:
	 * 
	 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
	 * 
	 * By considering the terms in the Fibonacci sequence whose values do not
	 * exceed four million, find the sum of the even-valued terms.
	 */
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1, j = 1; i < 4000000; i += j, j += i) {
			if (i % 2 == 0)
				sum += i;
			if (j % 2 == 0 && j < 4000000)
				sum += j;
		}
		System.out.print("Sum - " + sum);
	}
}
