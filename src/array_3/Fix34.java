package array_3;

import java.util.Arrays;

public class Fix34 {
    /*
     * Return an array that contains exactly the same numbers as the given array,
     * but rearranged so that every 3 is immediately followed by a 4. Do not move
     * the 3's, but every other number may move. The array contains the same number
     * of 3's and 4's, every 3 has a number after it that is not a 3, and a 3
     * appears in the array before any 4.
     */
    public int[] fix34(int[] nums) {
	int[] result = new int[nums.length];
	for (int i = 0; i < nums.length; i++) {
	    if (nums[i] == 3) {
		result[i] = 3;
		for (int j = 0; j < nums.length; j++) {
		    if (nums[j] == 4) {
			int temp = nums[i + 1];
			result[i + 1] = 4;
			result[j] = temp;
			nums[j] = temp;
			i++;
			j = nums.length;
		    }
		}
	    } else if (nums[i] == 4) {
		for (int j = i; j < nums.length; j++) {
		    if (nums[j] == 3) {
			result[i] = nums[j + 1];
			j = nums.length;
		    }
		}
	    } else {
		result[i] = nums[i];
	    }
	}
	return result;
    }
}