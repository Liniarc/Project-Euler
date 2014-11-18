package questions001to100;

import helperClass.Helper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Problem048{
	public static void main(String[] args) {
		long START = System.currentTimeMillis();
		long sum = 0;
		for (int i = 1; i <= 1000; i++)
		{
			long n = i;
			for (int j = 1; j < i; j++)
			{
				n*=i;
				n%=10000000000l;
			}
			sum += n;
		}
		System.out.println(sum%10000000000l);
		long END = System.currentTimeMillis();
		System.out.println();
		if ((END - START) / 1000 > 2)
			System.out.println((END - START) / 1000 + " seconds");
		else
			System.out.println((END - START) + " ms");
	}
}
