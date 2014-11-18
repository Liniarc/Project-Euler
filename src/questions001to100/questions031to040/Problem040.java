package questions001to100.questions031to040;

public class Problem040 {
	public static void main(String[] args) {
		long START = System.currentTimeMillis();

		StringBuilder champ = new StringBuilder();
		for (int i = 0; champ.length()<1000001;i++)
			champ.append(i);
		int val = 1;
		for (int i = 0; i < 6; i++)
			val*=champ.charAt((int)(Math.pow(10, i)))-'0';
		System.out.println(val);

		long END = System.currentTimeMillis();
		System.out.println();
		if ((END - START) / 1000 > 2)
			System.out.println((END - START) / 1000 + " seconds");
		else
			System.out.println((END - START) + " ms");
	}
}
