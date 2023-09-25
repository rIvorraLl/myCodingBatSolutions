package array_2;

public class TenRun {
    /*
     * For each multiple of 10 in the given array, change all the values following
     * it to be that multiple of 10, until encountering another multiple of 10. So
     * {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.
     */
    public int[] tenRun(int[] nums) {
	boolean isMultiple = false;
	int prov = 0;
	int[] result = new int[nums.length];
	for (int i = 0; i < nums.length; i++) {
	    if (!isMultiple) {
		result[i] = nums[i];
	    }
	    if (nums[i] % 10 == 0) {
		prov = nums[i];
		isMultiple = true;
	    }
	    if (isMultiple) {
		result[i] = prov;
	    }
	}
	return result;
    }
}
