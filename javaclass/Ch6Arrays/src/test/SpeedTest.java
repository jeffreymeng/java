/*
 * Programmer: Jeffrey Meng
 * Date: Nov 17, 2017
 * Purpose:
 */

package test;

public class SpeedTest {

	public static void test() {
		// code to test here.
		
		String[] array = { "bananna", "orange", "blueberry", "orange", "blackberry", "dragonfruit", "apple", "apricot", "mango", "coconut"};
		String key = "orange";
		int count = 0;
		for (int i = 0; i < array.length; i ++) {
			if (array[i] == key) {
				count ++;
			}
		}
		System.out.println(count);
		
	}

	public static void main(String[] args) {
		System.out.println("****** Basic Runtime Tester ******");
		// very basic tester.
		int iterations = 20;
		long start, end, duration;
		long sum = 0,  min, max, minIndex, maxIndex;
		long[] durations = new long[iterations];
		long average, median;
		
		for (int i = 0; i < iterations; i++) {
			System.out.println("Test " + i + ":");
			start = System.nanoTime();
			test();
			end = System.nanoTime();
			duration = end - start;
			System.out.println("End test " + i + ". Ran in " + duration + "ns");
			durations[i] = duration;
		}
		System.out.println("Testing Over. Calculating Data");
		//gets data for the array.
		min = durations[0];
		max = durations[0];
		minIndex = 0;
		maxIndex = 0;
		for (int i = 0; i < durations.length; i ++) {
			System.out.println("Test " + i + ": " + durations[i] + "ns.");
			//sum for average
			sum += durations[i];
			//min
			if (min > durations[i]) {
				min = durations[i];
				minIndex = i;
			}
			//max
			if (max < durations[i]) {
				max = durations[i];
				maxIndex = i;
			}
		}
		//median
		//if even get average of middle two, else get middle.
		if (durations.length % 2 == 0) {
			median = (durations[durations.length / 2] + durations[(durations.length / 2) + 1]) / 2;
		} else {
			median = durations[durations.length / 2];//integer division will round.
		}
		average = (long) ((double) sum / durations.length);
		System.out.println("***** Data *****");
		System.out.println("Average: " + average + "ns");
		System.out.println("Min: " + min + "ns");
		System.out.println("Index of min: " + minIndex);
		System.out.println("Max: " + max + "ns");
		System.out.println("Index of max: " + maxIndex);
		System.out.println("Median: " + median + "ns");

	}
	public static long toMs(long ns) {
		return (ns/1000000);
	}
}
