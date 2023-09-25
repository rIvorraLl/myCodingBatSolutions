package array_2;

public class TripleUp {
    /*
     * Return true if the array contains, somewhere, three increasing adjacent
     * numbers like .... 4, 5, 6, ... or 23, 24, 25.
     */
    public boolean tripleUp(int[] nums) {
	for (int i = 2; i < nums.length; i++) {
	    if ((nums[i - 1] == nums[i - 2] + 1) && (nums[i] == nums[i - 1] + 1)) {
		return true;
	    }
	}
	return false;
    }
}