package array_2;

import java.util.Arrays;

public class ZeroMax {
    /*
     * Return a version of the given array where each zero value in the array is
     * replaced by the largest odd value to the right of the zero in the array. If
     * there is no odd value to the right of the zero, leave the zero as a zero.
     */
    public int[] zeroMax(int[] nums) {
	int[] result = new int[nums.length];
	for (int i = 0; i < nums.length; i++) {
	    if (nums[i] == 0) {
		int largest = largestOdd(nums, i + 1);
		if (largest != -1) {
		    result[i] = largest;
		}
	    } else {
		result[i] = nums[i];
	    }
	}
	return result;
    }

    public int largestOdd(int[] slice, int index) {
	int largest = -1;
	for (int i = index; i < slice.length; i++) {
	    if (slice[i] % 2 != 0 && slice[i] > largest) {
		largest = slice[i];
	    }
	}
	return largest;
    }
}