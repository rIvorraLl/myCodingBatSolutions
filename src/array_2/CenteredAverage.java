package array_2;

public class CenteredAverage {
    /*
     * Return the "centered" average of an array of ints, which we'll say is the
     * mean average of the values, except ignoring the largest and smallest values
     * in the array. If there are multiple copies of the smallest value, ignore just
     * one copy, and likewise for the largest value. Use int division to produce the
     * final average. You may assume that the array is length 3 or more.
     */
    public int centeredAverage(int[] nums) {
	int[] maxMin = minAndMax(nums);
	int total = 0;
	for (int i = 0; i < nums.length; i++) {
	    total += nums[i];
	}
	return (total - maxMin[0] - maxMin[1]) / (nums.length - 2);
    }

    public int[] minAndMax(int[] nums) {
	int max = nums[0];
	int min = nums[0];
	for (int i = 0; i < nums.length; i++) {
	    if (nums[i] > max) {
		max = nums[i];
	    } else if (nums[i] < min) {
		min = nums[i];
	    }
	}
	int[] result = { max, min };
	return result;
    }
}
