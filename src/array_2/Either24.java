package array_2;

public class Either24 {
    /*
     * Given an array of ints, return true if the array contains a 2 next to a 2 or
     * a 4 next to a 4, but not both.
     */
    public boolean either24(int[] nums) {
	boolean contains22 = false;
	boolean contains44 = false;
	for (int i = 1; i < nums.length; i++) {
	    if (nums[i - 1] == 4 && nums[i] == 4) {
		contains44 = true;
	    } else if (nums[i - 1] == 2 && nums[i] == 2) {
		contains22 = true;
	    }
	}
	System.out.println(contains22);
	System.out.println(contains44);
	return (contains22 || contains44) && !(contains22 && contains44);
    }
}
