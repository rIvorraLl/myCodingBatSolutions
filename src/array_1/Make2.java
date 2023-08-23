package array_1;

public class Make2 {
    /*
     * Given 2 int arrays, a and b, return a new array length 2 containing, as much
     * as will fit, the elements from a followed by the elements from b. The arrays
     * may be any length, including 0, but there will be 2 or more elements
     * available between the 2 arrays.
     */
    public int[] make2(int[] a, int[] b) {
	int[] concatArr = new int[a.length + b.length];
	int i = 0;
	while (i < a.length) {
	    concatArr[i] = a[i];
	    i++;
	}
	for (int j = 0; j < b.length; j++) {
	    concatArr[i] = b[j];
	    i++;
	}
	int[] result = { concatArr[0], concatArr[1] };
	return result;
    }
}
