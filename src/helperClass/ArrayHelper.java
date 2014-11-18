package helperClass;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ArrayHelper
{
	public static <T> boolean compareArrElem(T[] arr1, T[] arr2)
	{
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		return Arrays.equals(arr1, arr2);
	}
	public static boolean compareArrElem(int[] arr1, int[] arr2)
	{
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		return Arrays.equals(arr1, arr2);
	}
	public static boolean compareArrElem(long[] arr1, long[] arr2)
	{
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		return Arrays.equals(arr1, arr2);
	}
	public static boolean compareArrElem(char[] arr1, char[] arr2)
	{
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		return Arrays.equals(arr1, arr2);
	}

	public static void main(String[] args)
	{
		int[] a = {1,2,3,4,5,6};
		int[] b = {1,6,5,4,3,3};
		System.out.println(compareArrElem(a, b));
	}

}
