package array_2;

public class HaveThree {
    /*
     * Given an array of ints, return true if the value 3 appears in the array
     * exactly 3 times, and no 3's are next to each other.
     */
    public boolean haveThree(int[] nums) {
	if (nums.length < 5) {
	    return false;
	}
	int counter = 0;
	if (nums[0] == 3) {
	    counter++;
	}
	for (int i = 1; i < nums.length; i++) {
	    if (nums[i - 1] == 3 && nums[i] == 3) {
		return false;
	    }
	    if (nums[i] == 3) {
		counter++;
	    }
	}
	return counter == 3;
    }
}
