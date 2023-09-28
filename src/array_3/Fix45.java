package array_3;

import java.util.Arrays;

public class Fix45 {
    /*
     * (This is a slightly harder version of the fix34 problem.) Return an array
     * that contains exactly the same numbers as the given array, but rearranged so
     * that every 4 is immediately followed by a 5. Do not move the 4's, but every
     * other number may move. The array contains the same number of 4's and 5's, and
     * every 4 has a number after it that is not a 4. In this version, 5's may
     * appear anywhere in the original array.
     */
    public int[] fix45(int[] nums) {
	int[] indexes = new int[nums.length];
	if (nums.length > 0 && nums[0] == 5) {
	    indexes[0] = 0;
	}
	int increment = 0;
	for (int i = 1; i < nums.length; i++) {
	    if (nums[i] == 5 && nums[i - 1] != 4) {
		indexes[increment] = i;
		increment++;
	    }
	}
	int index = 0;
	for (int j = 0; j < nums.length; j++) {
	    if (nums[j] == 4 && nums[j + 1] != 5) {
		int temp = nums[j + 1];
		nums[indexes[index]] = temp;
		nums[j + 1] = 5;
		index++;
	    }
	}
	return nums;
    }
}
