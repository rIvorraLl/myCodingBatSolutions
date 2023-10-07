package functional_1;

import java.util.List;

public class Math1 {
    /*
     * Given a list of integers, return a list where each integer is added to 1 and
     * the result is multiplied by 10.
     */
    public List<Integer> math1(List<Integer> nums) {
	nums.replaceAll(n -> (n + 1) * 10);
	return nums;
    }
}
