package array_2;

public class ShiftLeft {
    /*
     * Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2,
     * 5, 3, 6}. You may modify and return the given array, or return a new array.
     */
    public int[] shiftLeft(int[] nums) {
	if (nums.length <= 1) {
	    return nums;
	}
	int[] result = new int[nums.length];
	result[nums.length - 1] = nums[0];
	for (int i = 0; i < nums.length - 2; i++) {
	    result[i + 1] = nums[i + 2]; 
	}
	result[0] = nums[1];
	return result;
    }
}
