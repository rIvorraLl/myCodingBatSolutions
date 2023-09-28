package array_3;

public class CanBalance {
    /*
     * Given a non-empty array, return true if there is a place to split the array
     * so that the sum of the numbers on one side is equal to the sum of the numbers
     * on the other side.
     */
    public boolean canBalance(int[] nums) {
	int left = 0;
	int right = 0;
	for (int i = 0; i < nums.length - 1; i++) {
	    left += nums[i];
	    for (int j = i + 1; j < nums.length; j++) {
		right += nums[j];
	    }
	    if (left == right) {
		return true;
	    }
	    right = 0;
	}
	return false;
    }
}
