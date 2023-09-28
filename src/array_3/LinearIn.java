package array_3;

public class LinearIn {
    /*
     * Given two arrays of ints sorted in increasing order, outer and inner, return
     * true if all of the numbers in inner appear in outer. The best solution makes
     * only a single "linear" pass of both arrays, taking advantage of the fact that
     * both arrays are already in sorted order.
     */
    public boolean linearIn(int[] outer, int[] inner) {
	int index = 0;
	boolean found = false;
	for (int i = 0; i < inner.length; i++) {
	    for (int j = index; j < outer.length; j++) {
		if (inner[i] == outer[j]) {
		    found = true;
		    index = j;
		}
	    }
	    if (!found) {
		return false;
	    }
	    found = false;
	}
	return true;
    }
}
