package array_1;

public class FirstLast6 {
    /*
     * Given an array of ints, return true if 6 appears as either the first or last
     * element in the array. The array will be length 1 or more.
     */
    public boolean firstLast6(int[] nums) {
	boolean result = false;
	if (nums.length == 1) {
	    result = nums[0] == 6;
	} else {
	    if (nums[0] == 6 || nums[nums.length - 1] == 6) {
		result = true;
	    }
	}
	return result;
    }
}
