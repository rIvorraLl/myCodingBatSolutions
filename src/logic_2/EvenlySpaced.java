package logic_2;

import java.util.Arrays;

public class EvenlySpaced {
    /*
     * Given three ints, a b c, one of them is small, one is medium and one is
     * large. Return true if the three values are evenly spaced, so the difference
     * between small and medium is the same as the difference between medium and
     * large.
     */
    boolean evenlySpaced(int a, int b, int c) {
	int[] arr = { a, b, c };
	Arrays.sort(arr);
	return arr[2] - arr[1] == arr[1] - arr[0];
    }
}
