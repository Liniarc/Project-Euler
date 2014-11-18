package questions001to100.questions011to020;


public class Problem017 {
	/*
	 * Problem 17 - Number letter counts
	 * 
	 * If the numbers 1 to 5 are written out in words: one, two, three, four,
	 * five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
	 * 
	 * If all the numbers from 1 to 1000 (one thousand) inclusive were written
	 * out in words, how many letters would be used?
	 * 
	 * 
	 * NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and
	 * forty-two) contains 23 letters and 115 (one hundred and fifteen) contains
	 * 20 letters. The use of "and" when writing out numbers is in compliance
	 * with British usage.
	 */
	public static void main(String[] args) {
		long START = System.currentTimeMillis();

		String[] s = { "one", "two", "three", "four", "five", "six", "seven",
				"eight", "nine", "ten", "eleven", "twelve", "thirteen",
				"fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
				"nineteen", "twenty", "thirty", "forty", "fifty", "sixty",
				"seventy", "eighty", "ninety" };
		String num = "";
		for (int i = 1; i <= 1000; i++)
		{
			String temp = "";
			if (i == 1000)
			{
				temp = "onethousand";
				num += temp;
				continue;
			}
			if (i >= 100)
			{
				temp += s[i/100-1];
				temp += "hundred";
				if (i%100==0)
				{
					num+=temp;
					continue;
				}
				temp += "and";
			}
			if (i%100 < 20)
			{
				temp +=s[i%100-1];
			}
			else
			{
				temp += s[i%100/10+17];
				if (i%10!=0)
				temp += s[i%10-1];
			}
			num+=temp;
		}
		System.out.println(num);
		System.out.println(num.length());
		
		long END = System.currentTimeMillis();
		System.out.println();
		if ((END - START) / 1000 > 2)
			System.out.println((END - START) / 1000 + " seconds");
		else
			System.out.println((END - START) + " ms");
	}
}
