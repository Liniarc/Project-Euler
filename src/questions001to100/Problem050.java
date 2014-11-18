package questions001to100;

import helperClass.ArrayHelper;
import helperClass.Helper;

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class Problem050{
	public static void main(String[] args) {
		long START = System.currentTimeMillis();
		int sum = 0;
		int length = 0;
		for (int i = 1; sum < 1000000; i++)
		{
			if (Helper.isPrime(i))
			{
				sum += i;
				length++;
			}
		}
		
		for (int i = 20; i < length; i++)
		{
			Queue<Integer> primes = new LinkedList<Integer>();
			sum = 0;
			while (sum < 1000000 && Helper.isPrime(sum))
			sum = 0;
			
//			if (sum = 0)
		}
			
		
		
		long END = System.currentTimeMillis();
		System.out.println();
		if ((END - START) / 1000 > 2)
			System.out.println((END - START) / 1000 + " seconds");
		else
			System.out.println((END - START) + " ms");
	}
}
