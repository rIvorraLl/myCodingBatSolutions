package functional_2;

import java.util.List;

public class No9 {
    /*
     * Given a list of non-negative integers, return a list of those numbers except
     * omitting any that end with 9. (Note: % by 10)
     */
    public List<Integer> no9(List<Integer> nums) {
	nums.removeIf(n -> n % 10 == 9);
	return nums;
    }
}
