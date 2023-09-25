package array_2;

public class NotAlone {
    /*
     * We'll say that an element in an array is "alone" if there are values before
     * and after it, and those values are different from it. Return a version of the
     * given array where every instance of the given value which is alone is
     * replaced by whichever value to its left or right is larger.
     */
    public int[] notAlone(int[] nums, int val) {
	if (nums.length < 3) {
	    return nums;
	}
	int[] result = new int[nums.length];
	result[0] = nums[0];
	result[nums.length - 1] = nums[nums.length - 1];
	for (int i = 1; i < nums.length - 1; i++) {
	    if (nums[i] == val && nums[i - 1] != nums[i] && nums[i + 1] != nums[i]) {
		int bigger = nums[i - 1] >= nums[i + 1] ? nums[i - 1] : nums[i + 1];
		result[i] = bigger;
	    } else {
		result[i] = nums[i];
	    }
	}
	return result;
    }
}
