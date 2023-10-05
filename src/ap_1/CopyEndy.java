package ap_1;

import java.util.Arrays;

public class CopyEndy {
    /*
     * We'll say that a positive int n is "endy" if it is in the range 0..10 or
     * 90..100 (inclusive). Given an array of positive ints, return a new array of
     * length "count" containing the first endy numbers from the original array.
     * Decompose out a separate isEndy(int n) method to test if a number is endy.
     * The original array will contain at least "count" endy numbers.
     */
    public int[] copyEndy(int[] nums, int count) {
	int[] result = new int[count];
	int index = 0;
	for (int i = 0; i < nums.length; i++) {
	    boolean endy = isEndy(nums[i]);
	    if (endy) {
		result[index] = nums[i];
		index++;
		count--;
	    }
	    if (count == 0) {
		i = nums.length;
	    }
	}
	return result;
    }

    public boolean isEndy(int n) {
	if ((n > 0 && n < 11) || (n > 89 && n < 101)) {
	    return true;
	}
	return false;
    }
}
