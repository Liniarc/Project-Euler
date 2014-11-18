package questions401to500;

import helperClass.Helper;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Hashtable;


public class Problem463 {
	
    public static Hashtable<BigInteger, BigInteger> fs = new Hashtable<BigInteger, BigInteger>(); 
    private static BigInteger b1 = BigInteger.ONE; 
    private static BigInteger b2 = BigInteger.valueOf(2); 
    private static BigInteger b3 = BigInteger.valueOf(3); 
    private static BigInteger b4 = BigInteger.valueOf(4); 
    
    public static BigInteger f(BigInteger n) { 
        if (n.compareTo(b1) == 0) { 
             return b1; 
        } 
        if (n.compareTo(b3) == 0) { 
             return b3; 
        } 
        if (fs.containsKey(n)) { 
             return fs.get(n); 
        } 
        if (!n.testBit(0)) { 
             BigInteger ret = f(n.divide(b2)); 
             fs.put(n, ret); 
             return ret; 
        } 
        if (n.subtract(BigInteger.valueOf(1)).mod(b4) 
                  .compareTo(BigInteger.ZERO) == 0) { 
             BigInteger ret = f(n.subtract(b1).divide(b2).add(b1)).multiply(b2) 
                       .subtract(f(n.subtract(b1).divide(b4))); 
             fs.put(n, ret); 
             return ret; 
        } 
        BigInteger ret = f(n.subtract(b3).divide(b2).add(b1)).multiply(b3) 
                  .subtract(f(n.subtract(b3).divide(b4)).multiply(b2)); 
        fs.put(n, ret); 
        return ret; 
   }
	
	public static long f(long l)
	{
		if (l == 1)
			return 1;
		if (l == 3)
			return 3;
		if (l % 2 == 0)
			return f(l/2);
		if ((l-1)%4==0)
			return 2*f(2*((l)/4)+1) - f((l-1)/4);
		return 3*f(2*((l)/4)+1) - 2*f((l-3)/4);
	}
	
	public static long s(long l)
	{
		long sum = 0;
		for (int i = 1 ; i <= l; i++)
			sum += f(i)%1000000000;
		return sum;
	}
	
	public static BigInteger s(BigInteger b)	
	{
		BigInteger n = BigInteger.ZERO;
		int gVal = 0;
		
		BigInteger sum  = BigInteger.ZERO;
		BigInteger pow2 = b2;
		int pow = 1;
		while (pow2.compareTo(b)<=0)
		{
			pow2 = pow2.multiply(b2);
			sum = sum.add(g(pow));
			pow++;
		}
//		pow--;
		pow2 = pow2.divide(b2).subtract(b1);
		
		n = pow2;
		gVal = pow;
//		System.out.print(n);
		while (n.compareTo(b)<0)
		{
			pow2 = b2;
			pow = 1;
			while (pow2.compareTo(b.subtract(n))<=0)
			{
				pow2 = pow2.multiply(b2);
				pow++;
			}
//			pow--;
			pow2 = pow2.divide(b2);
			sum = sum.add(g(gVal,pow,n.add(b1)));
//			System.out.print(gVal + ", " + pow + ", " + n+ " =  "  + g(gVal,pow,n) +"\t");
			n = n.add(pow2);
//			break;
		}
		
		return sum;
	}
	
	public static BigInteger g(int num)
	{
		BigInteger n = new BigInteger("4");
		return n.pow(num-1);
	}
	
	public static BigInteger g(int num, int len)
	{
		
		BigInteger L = b2.pow(num-1);
		BigInteger i = b2.pow(len-1);
		
		return L.multiply(i.subtract(b1)).add(i);
	}
	public static BigInteger g(int num, int len, BigInteger start)
	{
		
		BigInteger L = b2.pow(num-1);
		BigInteger i = b2.pow(len-1);
		BigInteger j = i.multiply(start);
		
		return L.multiply(i.subtract(b1)).add( i.multiply(f( j )) );
	}
	
	public static void main(String[] args) {
		long START = System.currentTimeMillis();


//		for (int i = 1; i < 1000; i++)
//			if ((i-1)%4==0)
//				System.out.println(i + "\t" + f(i) + "\t2*f(" + ((i)/4*2+1) + ")\tf(" + (i-1)/4+")");
//			else if ((i-3)%4==0)
//				System.out.println(i + "\t" + f(i) + "\t3*f(" + ((i-3)/4*2+1) + ")\tf(" + (i-1)/4+")");
		
		long n = 1;
		BigInteger b = b2;

		System.out.println(s(1));
		System.out.println(s(2));
		System.out.println(s(4));
		System.out.println(s(8));
		System.out.println(s(16));
		System.out.println(s(32));
		while (b.compareTo(new BigInteger("1000000"))<=0)
		{
//			long val2 =(long) (Math.pow(4, n));
//			System.out.print(n + "\t");
			System.out.print( b + " - " + s(b));
//			System.out.print("\t");
//			System.out.printf("%15s", (f(b)));
//			System.out.print("\t");
//			System.out.printf("%15s", (s(b)));
			System.out.println();
			b = b.multiply(new BigInteger("2"));
//			b = b.add(b1);
		}
		
		BigInteger big = b3.pow(37);
		System.out.println("s(" + big + ") =");
		System.out.println(s(big));
		
		
		long END = System.currentTimeMillis();
		System.out.println();
		if ((END - START) / 1000 > 2)
			System.out.println((END - START) / 1000 + " seconds");
		else
			System.out.println((END - START) + " ms");
	}
}
