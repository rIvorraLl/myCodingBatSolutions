package array_2;

public class No14 {
    /*
     * Given an array of ints, return true if it contains no 1's or it contains no
     * 4's.
     */
    public boolean no14(int[] nums) {
	boolean containsOne = false;
	boolean containsFour = false;
	for (int i = 0; i < nums.length; i++) {
	    if (nums[i] == 1) {
		containsOne = true;
	    } else if (nums[i] == 4) {
		containsFour = true;
	    }
	}
	return !containsOne || !containsFour;
    }
}
