package warmup_2;

public class ArrayCount9 {
    /*
     * Given an array of ints, return the number of 9's in the array.
     */
    public int arrayCount9(int[] nums) {
	int counter = 0;
	for (int i = 0; i < nums.length; i++) {
	    if (nums[i] == 9) {
		counter++;
	    }
	}
	return counter;
    }
}
