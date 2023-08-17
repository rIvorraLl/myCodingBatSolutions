package warmup_1;

public class HasTeen {
    /*
     * We'll say that a number is "teen" if it is in the range 13..19 inclusive.
     * Given 3 int values, return true if 1 or more of them are teen.
     */
    public boolean hasTeen(int a, int b, int c) {
	int[] arr = { a, b, c };
	for (int i = 0; i < arr.length; i++) {
	    if (arr[i] > 12 && arr[i] < 20) {
		return true;
	    }
	}
	return false;
    }
}
