package array_2;

public class IsEverywhere {
    /*
     * We'll say that a value is "everywhere" in an array if for every pair of
     * adjacent elements in the array, at least one of the pair is that value.
     * Return true if the given value is everywhere in the array.
     */
    public boolean isEverywhere(int[] nums, int val) {
	for (int i = 1; i < nums.length; i++) {
	    if (nums[i] != val && nums[i - 1] != val) {
		return false;
	    }
	}
	return true;
    }
}