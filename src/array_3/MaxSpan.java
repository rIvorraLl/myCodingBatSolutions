package array_3;

public class MaxSpan {
    /*
     * Consider the leftmost and righmost appearances of some value in an array.
     * We'll say that the "span" is the number of elements between the two
     * inclusive. A single value has a span of 1. Returns the largest span found in
     * the given array. (Efficiency is not a priority.)
     */
    public int maxSpan(int[] nums) {
	int maxDistance = 0;
	boolean equalFound = false;
	for (int i = 0; i < nums.length; i++) {
	    for (int j = i + 1; j < nums.length; j++) {
		if (nums[j] == nums[i]) {
		    equalFound = true;
		    int distance = j - i + 1;
		    if (distance > maxDistance) {
			maxDistance = distance;
		    }
		}
	    }
	}
	if (!equalFound) {
	    int result = nums.length > 0 ? 1 : 0;
	    return result;
	}
	return maxDistance;
    }
}