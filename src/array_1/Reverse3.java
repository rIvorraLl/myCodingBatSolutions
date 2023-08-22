package array_1;

public class Reverse3 {
    /*
     * Given an array of ints length 3, return a new array with the elements in
     * reverse order, so {1, 2, 3} becomes {3, 2, 1}.
     */
    public int[] reverse3(int[] nums) {
	int[] result = { nums[2], nums[1], nums[0] };
	return result;
    }
}
