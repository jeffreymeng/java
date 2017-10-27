/*
 * Programmer: Jeffrey Meng
 * Date: Oct 27, 2017
 * Purpose:
 */

package methodsWorksheet3;

public class HarmonicMean {

	public static void main(String[] args) {
		System.out.println(getHarmonicMean(39,49));

	}
	public static double getHarmonicMean(int x, int y) {
		return 1/ ((1/(double) x + 1/(double) y) / 2);
	}
}
