package questions001to100;

import helperClass.Helper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Problem047{
	public static void main(String[] args) {
		long START = System.currentTimeMillis();
		int num = 644;
		out: while (true)
		{
			for (int i = 0; i < 4; i++)
			{
				if (Helper.numUniques(Helper.factor(num+i)) != 4)
				{
					num += i + 1;
					continue out;
				}
			}
			System.out.println(num);
			break;
		}

		long END = System.currentTimeMillis();
		System.out.println();
		if ((END - START) / 1000 > 2)
			System.out.println((END - START) / 1000 + " seconds");
		else
			System.out.println((END - START) + " ms");
	}
}
