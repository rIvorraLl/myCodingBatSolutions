package array_1;

public class Front11 {
    /*
     * Given 2 int arrays, a and b, of any length, return a new array with the first
     * element of each array. If either array is length 0, ignore that array.
     */
    public int[] front11(int[] a, int[] b) {
	boolean aZero = a.length == 0;
	boolean bZero = b.length == 0;
	if (aZero && bZero) {
	    return new int[0];
	} else if (aZero) {
	    int[] bFirst = { b[0] };
	    return bFirst;
	} else if (bZero) {
	    int[] aFirst = { a[0] };
	    return aFirst;
	}
	int[] result = { a[0], b[0] };
	return result;
    }
}
