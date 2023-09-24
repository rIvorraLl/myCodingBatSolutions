package array_2;

public class More14 {
    /*
     * Given an array of ints, return true if the number of 1's is greater than the
     * number of 4's
     */
    public boolean more14(int[] nums) {
	int ones = 0;
	int fours = 0;
	for (int i = 0; i < nums.length; i++) {
	    if (nums[i] == 1) {
		ones++;
	    } else if (nums[i] == 4) {
		fours++;
	    }
	}
	return ones > fours;
    }
}
