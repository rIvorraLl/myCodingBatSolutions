package ap_1;

public class BigHeights {
    /*
     * (A variation on the sumHeights problem.) We have an array of heights,
     * representing the altitude along a walking trail. Given start/end indexes into
     * the array, return the number of "big" steps for a walk starting at the start
     * index and ending at the end index. We'll say that step is big if it is 5 or
     * more up or down. The start end end index will both be valid indexes into the
     * array with start <= end.
     */
    public int bigHeights(int[] heights, int start, int end) {
	int changesSum = 0;
	for (int i = start; i < end; i++) {
	    int step = Math.abs(heights[i] - heights[i + 1]);
	    if (step >= 5) {
		changesSum += 1;
	    }
	}
	return changesSum;
    }
}
