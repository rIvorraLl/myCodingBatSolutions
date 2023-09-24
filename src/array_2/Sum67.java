package array_2;

public class Sum67 {
    /*
     * Return the sum of the numbers in the array, except ignore sections of numbers
     * starting with a 6 and extending to the next 7 (every 6 will be followed by at
     * least one 7). Return 0 for no numbers.
     */
    public int sum67(int[] nums) {
	int result = 0;
	boolean add = true;
	int i = 0;
	while (i < nums.length) {
	    if (nums[i] == 6) {
		add = false;
	    }
	    if (add) {
		result += nums[i];
	    }
	    if (nums[i] == 7) {
		add = true;
	    }
	    i++;
	}
	return result;
    }
}
