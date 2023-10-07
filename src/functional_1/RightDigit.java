package functional_1;

import java.util.List;

public class RightDigit {
    /*
     * Given a list of non-negative integers, return an integer list of the
     * rightmost digits. (Note: use %)
     */
    public List<Integer> rightDigit(List<Integer> nums) {
	nums.replaceAll(n -> n % 10);
	return nums;
    }
}
