package array_1;

public class No23 {
    /*
     * Given an int array length 2, return true if it does not contain a 2 or 3.
     */
    public boolean no23(int[] nums) {
	boolean checkNo2 = nums[0] != 2 && nums[1] != 2;
	boolean checkNo3 = nums[0] != 3 && nums[1] != 3;
	return checkNo2 && checkNo3;
    }
}
