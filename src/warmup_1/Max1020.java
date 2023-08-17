package warmup_1;

public class Max1020 {
    /*
     * Given 2 positive int values, return the larger value that is in the range
     * 10..20 inclusive, or return 0 if neither is in that range.
     */
    public int max1020(int a, int b) {
	boolean aInRange = a > 9 && a < 21;
	boolean bInRange = b > 9 && b < 21;
	if (aInRange && a > b || (aInRange && !bInRange)) {
	    return a;

	} else if (bInRange && b > a || (bInRange && !aInRange)) {
	    return b;
	}
	return 0;
    }
}
