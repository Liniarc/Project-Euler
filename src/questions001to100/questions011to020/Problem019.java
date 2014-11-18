package questions001to100.questions011to020;


public class Problem019 {
	/*
	 * Problem 19 - Counting Sundays
	 * 
	 * You are given the following information, but you may prefer to do some
	 * research for yourself.
	 * 
	 * 1 Jan 1900 was a Monday. Thirty days has September, April, June and
	 * November. All the rest have thirty-one, Saving February alone, Which has
	 * twenty-eight, rain or shine. And on leap years, twenty-nine. A leap year
	 * occurs on any year evenly divisible by 4, but not on a century unless it
	 * is divisible by 400.
	 * 
	 * How many Sundays fell on the first of the month during the twentieth
	 * century (1 Jan 1901 to 31 Dec 2000)?
	 */
	public static void main(String[] args) {
		long START = System.currentTimeMillis();



		long END = System.currentTimeMillis();
		System.out.println();
		if ((END - START) / 1000 > 2)
			System.out.println((END - START) / 1000 + " seconds");
		else
			System.out.println((END - START) + " ms");
	}
}
