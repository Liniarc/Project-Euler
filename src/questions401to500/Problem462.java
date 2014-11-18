package questions401to500;

import java.math.BigInteger;
import java.util.ArrayList;

public class Problem462 {
	/*
	 * Problem 461 - Almost Pi
	 * 
	 * Let f_n(k) = e^(k/n) - 1, for all non-negative integers k.
	 * 
	 * Remarkably, f_200(6) + f_200(75) + f_200(89) + f_200(226) = 3.141592644529… ~
	 * pi.
	 * 
	 * In fact, it is the best approximation of pi of the form fn(a) + fn(b) +
	 * f_n(c) + f_n(d) for n = 200.
	 * 
	 * Let g(n) = a^2 + b^2 + c^2 + d^2 for a, b, c, d that minimize the error: |
	 * f_n(a) + f_n(b) + f_n(c) + f_n(d) - pi| (where |x| denotes the absolute value
	 * of x).
	 * 
	 * You are given g(200) = 6^2 + 75^2 + 89^2 + 226^2 = 64658.
	 * 
	 * Find g(10000).
	 */
	public static void main(String[] args) {
		long START = System.currentTimeMillis();

		ArrayList<BigInteger> smooths2 = new ArrayList<BigInteger>(); 
		ArrayList<BigInteger> smooths3 = new ArrayList<BigInteger>(); 
		BigInteger n = new BigInteger("1000000000000000000");
		boolean[][] boxes = new boolean[100][100];
        for (int i = 0; i < Math.log(1e18)/Math.log(2); i++) { 
             BigInteger mult2 = new BigInteger("2").pow(i); 
             for (int j = 0; j < Math.log(1e18)/Math.log(3); j++) { 
                  BigInteger mult3 = new BigInteger("3").pow(j); 
                  BigInteger product = mult2.multiply(mult3); 
                  if (product.compareTo(n)<=0)
                  {
                	  smooths2.add(BigInteger.valueOf(i));
                	  smooths3.add(BigInteger.valueOf(j));
                	  boxes[i][j] = true;
                  }
             } 
        }
    	System.out.println(smooths2.size()); 
    	BigInteger s = BigInteger.ONE;
    	for (int i = 1; i <= smooths2.size(); i++)
    	{
    		s = s.multiply(BigInteger.valueOf(i));
    	}
    	System.out.println(s); 
        for (int i = 0; i < boxes.length; i++)
        {
        	for (int j = 0; j < boxes[i].length;j++)
        	{
        		if (boxes[i][j]){
					int val = 1;
					for (int k = i + 1; k < boxes.length; k++) {
						if (boxes[k][j])
							val++;
					}
					for (int k = j + 1; k < boxes[i].length; k++) {
						if (boxes[i][k])
							val++;
					}
					System.out.print(val + "\t");
					s = s.divide(BigInteger.valueOf(val));

				}
        	}
			System.out.println();
    		if (!boxes[i][0])
    		{
    			break;
    		}
        }

    	System.out.println(s); 
    	System.out.println(s.toString().length()-1);

		long END = System.currentTimeMillis();
		System.out.println();
		if ((END - START) / 1000 > 2)
			System.out.println((END - START) / 1000 + " seconds");
		else
			System.out.println((END - START) + " ms");
	}
}
