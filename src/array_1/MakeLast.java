package array_1;

public class MakeLast {
    /*
     * Given an int array, return a new array with double the length where its last
     * element is the same as the original array, and all the other elements are 0.
     * The original array will be length 1 or more. Note: by default, a new int
     * array contains all 0's.
     */
    public int[] makeLast(int[] nums) {
	int[] result = new int[nums.length * 2];
	result[result.length - 1] = nums[nums.length - 1];
	return result;
    }
}
