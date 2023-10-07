package ap_1;

import java.util.Arrays;

public class CommonTwo {
    /*
     * Start with two arrays of strings, a and b, each in alphabetical order,
     * possibly with duplicates. Return the count of the number of strings which
     * appear in both arrays. The best "linear" solution makes a single pass over
     * both arrays, taking advantage of the fact that they are in alphabetical
     * order.
     */
    public int commonTwo(String[] a, String[] b) {
	int result = 0;
	String[] aa = a.length > b.length ? a : b;
	String[] bb = b.length < a.length ? b : a;
	if (aa.length < 2) {
	    if (aa[0].equals(bb[0])) {
		result++;
	    }
	    return result;
	}
	int j = 0;
	for (int i = 0; i < aa.length - 1; i++) {
	    if (aa[i] == aa[i + 1]) {
		continue;
	    }
	    if (bb[j].charAt(0) < aa[i].charAt(0)) {
		j++;
	    }
	    if (aa[i].equals(bb[j])) {
		result++;
		j++;
	    }
	}
	if ( bb.length > 1 && !bb[bb.length - 1].equals(bb[bb.length - 2]) || !aa[aa.length - 1].equals(aa[aa.length - 2])) {
	    if (aa[aa.length - 1].equals(bb[bb.length - 1])) {
		result++;
	    }
	}
	return result;
    }
}