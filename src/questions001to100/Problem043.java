package questions001to100;

public class Problem043 {
	public static void permutation(String done, String s) {
	    if (s.length() == 0)
	    {
	    	if (Integer.parseInt(done.substring(1,4))%2!=0)
	    		return;
	    	if (Integer.parseInt(done.substring(2,5))%3!=0)
	    		return;
	    	if (Integer.parseInt(done.substring(3,6))%5!=0)
	    		return;
	    	if (Integer.parseInt(done.substring(4,7))%7!=0)
	    		return;
	    	if (Integer.parseInt(done.substring(5,8))%11!=0)
	    		return;
	    	if (Integer.parseInt(done.substring(6,9))%13!=0)
	    		return;
	    	if (Integer.parseInt(done.substring(7,10))%17!=0)
	    		return;
	    		System.out.println(done);
	    }
	    else 
	    {
	        for (int i = 0; i < s.length(); i++)
	            permutation(done + s.charAt(i), s.substring(0, i) + s.substring(i+1, s.length()));
	    }
	}
	
	public static void main(String[] args) {
		long START = System.currentTimeMillis();
		
		String s = "0123456789";
		System.out.println("ADD THE FOLLOWING:");
		permutation("",s);

		long END = System.currentTimeMillis();
		System.out.println();
		if ((END - START) / 1000 > 2)
			System.out.println((END - START) / 1000 + " seconds");
		else
			System.out.println((END - START) + " ms");
	}
}
