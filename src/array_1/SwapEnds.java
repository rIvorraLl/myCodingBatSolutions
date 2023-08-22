package array_1;

public class SwapEnds {
    /*
     * Given an array of ints, swap the first and last elements in the array. Return
     * the modified array. The array length will be at least 1.
     */
    public int[] swapEnds(int[] nums) {
	int[] result = nums;
	if (result.length == 1) {
	    return result;
	} else {
	    int prov = nums[0];
	    result[0] = nums[nums.length - 1];
	    result[nums.length - 1] = prov;
	}
	return result;
    }
}
