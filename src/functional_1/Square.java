package functional_1;

import java.util.List;

public class Square {
    /*
     * Given a list of integers, return a list where each integer is multiplied with
     * itself.
     */
    public List<Integer> square(List<Integer> nums) {
	nums.replaceAll(n -> n * n);
	return nums;
    }
}
