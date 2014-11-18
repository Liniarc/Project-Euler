package questions401to500;

public class Problem459 {
	/*
	 * Problem 459 - Almost Flipping game
	 * 
	 * The flipping game is a two player game played on a N by N square board.
	 * Each square contains a disk with one side white and one side black. The
	 * game starts with all disks showing their white side.
	 * 
	 * A turn consists of flipping all disks in a rectangle with the following
	 * properties:
	 * 
	 * the upper right corner of the rectangle contains a white disk the
	 * rectangle width is a perfect square (1, 4, 9, 16, ...) the rectangle
	 * height is a triangular number (1, 3, 6, 10, ...)
	 * 
	 * 
	 * Players alternate turns. A player wins by turning the grid all black.
	 * 
	 * Let W(N) be the number of winning moves for the first player on a N by N
	 * board with all disks white, assuming perfect play. W(1) = 1, W(2) = 0,
	 * W(5) = 8 and W(102) = 31395.
	 * 
	 * Find W(106).
	 */
	public static void main(String[] args) {
		long START = System.currentTimeMillis();

		int[] sqr = new int[1000];
		int[] tri = new int[1415];
		for (int i = 0; i * i < 1000000; i++)
			sqr[i] = i * i;
		for (int i = 0; i * (i - 1) / 2 < 1000000; i++)
			tri[i] = i * (i - 1) / 2;
		long sum = 0;

		for (int i = 0; i < sqr.length; i++) {
			if (sqr[i]>100)
				break;
			if (i%2==0)
				continue;
			for (int j = 0; j < tri.length; j++) {
				if (tri[j]>100)
					break;
				if (j%2==0)
				{
					continue;
				}
				long num = (101-sqr[i])*(101-tri[j])-15;
				sum+=num;
//				System.out.println(num + ", " + sqr[i] + );
//				if (i == 1)
//				{
//					if (j > 4)
//						num += 3;
//					if (j > 2)
//						num += 3;
//				}
//				else if (j == 1)
//				{
//					if (i > 2)
//						num += 5;
//				}
//				else if ( i > 3 && j > 5 )
//				{
//					num+=9;
//				}
//				else if ( i > 3 && j == 3 )
//				{
//					num+=8;
//				}
//				else if (j > 3 && i > 3)
//				{
//					num+=8;
//				}
			}
		}
		System.out.println("Sum - " + sum);
		
		long END = System.currentTimeMillis();
		System.out.println();
		if ((END - START) / 1000 > 2)
			System.out.println((END - START) / 1000 + " seconds");
		else
			System.out.println((END - START) + " ms");
	}

}
