package helperClass;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ModdedInt {
	
	public long base;
	public long value;
	
	public ModdedInt(long val, long base)
	{
		this.base = base;
		value = val%base;
		while (value < 0)
			value+=base;
	}
	
	
	public ModdedInt inverse()
	{
		long x = 0;
		long y = 1;
		long u = 1;
		long v = 0;
		long a = value;
		long b = base;
		
		while (a!=0)
		{
			long q = b/a;
			long r = b%a;
			long m = x-u*q;
			long n = y-v*q;
			b = a;
			a = r;
			x = u;
			y = v;
			u = m;
			v = n;
		}
		if (b != 1)
			return null;
		return new ModdedInt(x, base);
	}
	
	public String toString()
	{
		return value + " mod " + base;
	}
	
	public static void main(String[] args) {
		ModdedInt a = new ModdedInt(11,11);
		System.out.println(a);
		System.out.println(a.inverse());
	}

}
