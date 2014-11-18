package questions001to100.questions031to040;

import java.util.ArrayList;

import helperClass.Helper;

public class Problem039 {
	public static void main(String[] args) {
		long START = System.currentTimeMillis();

		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int a = 0; a < 500; a++) {
			for (int b = 0; b < a; b++)
			{
				double c = Math.sqrt(a*a+b*b);
				if (Helper.isInt(c))
				{
					
					if (a+b+c<1000)
					{
						list.add((int)(a+b+c));
					}
				}
			}
		}
		int[] arr = new int[list.size()];
		for (int i = 0; i < list.size(); i++)
		{
			arr[i] = list.get(i);
		}
		System.out.println(Helper.mostCommon(arr));

		long END = System.currentTimeMillis();
		System.out.println();
		if ((END - START) / 1000 > 2)
			System.out.println((END - START) / 1000 + " seconds");
		else
			System.out.println((END - START) + " ms");
	}
}
