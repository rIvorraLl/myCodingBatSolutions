package warmup_2;

public class ArrayFront9 {
    /*
     * Given an array of ints, return true if one of the first 4 elements in the
     * array is a 9. The array length may be less than 4.
     */
    public boolean arrayFront9(int[] nums) {
	boolean result = false;
	for (int i = 0; i < nums.length; i++) {
	    if (nums[i] == 9) {
		result = true;
	    }
	    if (i > 2) {
		return result;
	    }
	}
	return result;
    }
}
