package questions401to500;
public class Problem461 {
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
		long start = System.currentTimeMillis();
		
		int n= 10000;
		double pi = Math.PI;
		int max = (int) Math.ceil(n * Math.log1p(pi))+1;
		double[] f = new double[max];
		for (int i = 0; i < max; i ++)
			f[i]=Math.pow(Math.E, i/(double)n)-1;

		double diff = 1;
		int A = 0,B = 0,C = 0,D = 0;
		
		for (int a = 0; f[a]<pi/4; a ++)
		{
			for (int b = a; f[b]<(pi-f[a])/3; b ++)
			{
				int c = b, d = max-1;
				while(c<d)
				{
						if (Math.abs( f[a]+ f[b] + f[c] + f[d] - pi)<diff)
						{
							diff = Math.abs( f[a]+ f[b] + f[c] + f[d] -  pi);
							A=a;
							B=b;
							C=c;
							D=d;
							System.out.println(A + "\t" + B + "\t" + C + "\t" + D + "\t- " + diff);
						}
						if(f[a]+ f[b] + f[c] + f[d] - pi<0)
							c++;
						else
							d--;
				}
			}
            System.out.println("a = " + a);
		}
		System.out.println(A + ", " + B + ", " + C + ", " + D + " - " + diff);
		System.out.println("g(10000) = " + (A*A+B*B+C*C+D*D));
		
		long end = System.currentTimeMillis();
		System.out.println((end-start)/1000);
	}
	
}
