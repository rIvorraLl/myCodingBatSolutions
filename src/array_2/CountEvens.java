package array_2;

public class CountEvens {
    /*
     * Return the number of even ints in the given array. Note: the % "mod" operator
     * computes the remainder, e.g. 5 % 2 is 1.
     */
    public int countEvens(int[] nums) {
	int result = 0;
	for (int i = 0; i < nums.length; i++) {
	    if (nums[i] % 2 == 0) {
		result++;
	    }
	}
	return result;
    }
}
