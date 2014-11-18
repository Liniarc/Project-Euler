package questions101to200;
public class JustAMain {

	public static double f1(int n, int k)
	{
		return Math.pow(Math.E, k/(double)n)-1;
	}
	
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int n= 10000;
		
		double pi = Math.PI; //Don't judge it makes things look better.
		int max = (int) Math.ceil(n * Math.log1p(pi))+1;
		double[] f = new double[max];
		for (int i = 0; i < max; i ++)
			f[i]=f1(n,i); //trading memory for runtime

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
            System.out.println("a = " + a); //ends at a = 5796
		}
		System.out.println(A + ", " + B + ", " + C + ", " + D + " - " + diff);
		System.out.println("g(10000) = " + (A*A+B*B+C*C+D*D));
		long end = System.currentTimeMillis();
		System.out.println((end-start)/1000);
	}
	
}
