package questions001to100;

import helperClass.Helper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Problem042 {
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

		long tot = 0;
		for (int i = 0; i < name.length; i++) {
			int val = 0;
			for (int j = 1; j < name[i].length() - 1; j++) {
				val += name[i].charAt(j) - 'A' + 1;
			}
			if (Helper.isInt(Math.sqrt(8 * val + 1))) {
				tot++;
			}
		}
		System.out.println("Tot - " + tot);

		long END = System.currentTimeMillis();
		System.out.println();
		if ((END - START) / 1000 > 2)
			System.out.println((END - START) / 1000 + " seconds");
		else
			System.out.println((END - START) + " ms");
	}
}
