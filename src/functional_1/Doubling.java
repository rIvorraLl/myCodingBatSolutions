package functional_1;

import java.util.List;

public class Doubling {
    /*
     * Given a list of integers, return a list where each integer is multiplied by
     * 2.
     */
    public List<Integer> doubling(List<Integer> nums) {
	nums.replaceAll(n -> n * 2);
	return nums;
    }
}
