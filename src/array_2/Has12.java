package array_2;

public class Has12 {
    /*
     * Given an array of ints, return true if there is a 1 in the array with a 2
     * somewhere later in the array.
     */
    public boolean has12(int[] nums) {
	boolean one = false;
	for (int i = 0; i < nums.length; i++) {
	    if (!one && nums[i] == 1) {
		one = true;
	    }
	    if (one && nums[i] == 2) {
		return true;
	    }
	}
	return false;
    }
}
