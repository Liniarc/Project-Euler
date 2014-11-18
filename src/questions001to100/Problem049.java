package questions001to100;

import helperClass.ArrayHelper;
import helperClass.Helper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Problem049{
	public static void main(String[] args) {
		long START = System.currentTimeMillis();
		for (int i = 1001; i < 10000; i+=2)
		{
			if (!Helper.isPrime(i))
				continue;
			for (int j = 2; j < (10000-i)/2; j+=2)
			{
				if (!Helper.isPrime(i+j))
					continue;
				if (!Helper.isPrime(i+2*j))
					continue;
				if (!ArrayHelper.compareArrElem(Helper.digitsOf(i),Helper.digitsOf(i+j)))
					continue;
				if (!ArrayHelper.compareArrElem(Helper.digitsOf(i),Helper.digitsOf(i+2*j)))
					continue;
				System.out.println("" + i + " " + (i+j) + " " + (i+2*j));
			}
		}
		
		
		long END = System.currentTimeMillis();
		System.out.println();
		if ((END - START) / 1000 > 2)
			System.out.println((END - START) / 1000 + " seconds");
		else
			System.out.println((END - START) + " ms");
	}
}
