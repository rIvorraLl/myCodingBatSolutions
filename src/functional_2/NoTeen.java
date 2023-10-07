package functional_2;

import java.util.List;

public class NoTeen {
    /*
     * Given a list of integers, return a list of those numbers, omitting any that
     * are between 13 and 19 inclusive.
     */
    public List<Integer> noTeen(List<Integer> nums) {
	nums.removeIf(n -> n > 12 && n < 20);
	return nums;
    }
}
