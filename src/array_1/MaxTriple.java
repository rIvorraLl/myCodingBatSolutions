package array_1;

public class MaxTriple {
    /*
     * Given an array of ints of odd length, look at the first, last, and middle
     * values in the array and return the largest. The array length will be a least
     * 1.
     */
    public int maxTriple(int[] nums) {
	int result = nums[0];
	if (nums[nums.length / 2] > result) {
	    result = nums[nums.length / 2];
	}
	if (nums[nums.length - 1] > result) {
	    result = nums[nums.length - 1];
	}
	return result;
    }
}
