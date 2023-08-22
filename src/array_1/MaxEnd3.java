package array_1;

public class MaxEnd3 {
    /*
     * Given an array of ints length 3, figure out which is larger, the first or
     * last element in the array, and set all the other elements to be that value.
     * Return the changed array.
     */
    public int[] maxEnd3(int[] nums) {
	int[] result = new int[3];
	for (int i = 0; i < nums.length; i++) {
	    if (nums[0] > nums[2]) {
		result[i] = nums[0];
	    } else {
		result[i] = nums[2];
	    }
	}
	return result;
    }
}
