package array_3;

public class CountClumps {
    /*
     * Say that a "clump" in an array is a series of 2 or more adjacent elements of
     * the same value. Return the number of clumps in the given array.
     */
    public int countClumps(int[] nums) {
	int clumps = 0;
	boolean found = false;
	for (int i = 0; i < nums.length - 1; i++) {
	    for (int j = i + 1; j < nums.length; j++) {
		if (nums[i] == nums[j]) {
		    found = true;
		    i++;
		} else {
		    break;
		}
	    }
	    if (found) {
		clumps++;
		found = false;
	    }
	}
	return clumps;
    }
}
