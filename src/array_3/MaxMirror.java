package array_3;

import java.util.Arrays;

public class MaxMirror {
    /*
     * We'll say that a "mirror" section in an array is a group of contiguous
     * elements such that somewhere in the array, the same group appears in reverse
     * order. For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is
     * length 3 (the {1, 2, 3} part). Return the size of the largest mirror section
     * found in the given array.
     */
    public int maxMirror(int[] nums) {
	if (nums.length == 0) {
	    return 0;
	}
	int provCount = 0;
	int counter = 0;
	boolean found = false;
	for (int i = 0; i < nums.length - 1; i++) {
	    for (int j = nums.length - 1; j > 0; j--) {
		if (nums[i] == nums[j] && nums[i + 1] == nums[j - 1]) {
		    found = true;
		    break;
		} else {
		    found = false;
		}
	    }
	    if (found) {
		provCount++;
	    }
	    if (provCount > counter) {
		counter = provCount;
	    }
	    if (!found) {
		provCount = 0;
	    }
	}
	return counter + 1;
    }
}