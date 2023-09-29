package array_3;

import java.util.Arrays;

public class SeriesUp {
    /*
     * Given n>=0, create an array with the pattern {1, 1, 2, 1, 2, 3, ... 1, 2, 3
     * .. n} (spaces added to show the grouping). Note that the length of the array
     * will be 1 + 2 + 3 ... + n, which is known to sum to exactly n*(n + 1)/2.
     */
    public int[] seriesUp(int n) {
	int[] result = new int[n * (n + 1) / 2];
	int pos = 0;
	int k = 1;
	int num = 1;
	for (int i = 0; i < result.length; i += k) {
	    for (int j = 0; j < k; j++) {
		result[pos] = num;
		num++;
		pos++;
	    }
	    k++;
	    num = 1;
	}
	return result;
    }
    public static void main (String[] args) {
	SeriesUp test = new SeriesUp();
	System.out.println(Arrays.toString(test.seriesUp(4)));
    }
}
