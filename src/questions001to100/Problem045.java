package questions001to100;

import helperClass.Helper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Problem045 {
	public static void main(String[] args) {
		long START = System.currentTimeMillis();

		File f = new File("./src/questions001to100/42.txt");

		BufferedReader read;
		String[] name = null;
		try {
			read = new BufferedReader(new FileReader(f));
			name = read.readLine().split(",");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		int i = 9;
		out: while (true)
		{
			if (Helper.isPrime(i))
			{
				i+=2;
				continue;
			}
			for (int j = 1; j < i; j++)
			{
				int p = i-j*j*2;
				if (Helper.isPrime(p))
					break;
				if (p<0)
				{
					System.out.println(i);
					break out;
				}
			}
			i+=2;
		}
		

		long END = System.currentTimeMillis();
		System.out.println();
		if ((END - START) / 1000 > 2)
			System.out.println((END - START) / 1000 + " seconds");
		else
			System.out.println((END - START) + " ms");
	}
}
