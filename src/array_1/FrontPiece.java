package array_1;

public class FrontPiece {
    /*
     * Given an int array of any length, return a new array of its first 2 elements.
     * If the array is smaller than length 2, use whatever elements are present.
     */
    public int[] frontPiece(int[] nums) {
	if (nums.length < 3) {
	    return nums;
	}
	int[] result = { nums[0], nums[1] };
	return result;
    }
}
