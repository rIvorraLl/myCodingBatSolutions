package warmup_1;

public class PosNeg {
    /*
     * Given 2 int values, return true if one is negative and one is positive.
     * Except if the parameter "negative" is true, then return true only if both are
     * negative.
     */
    public boolean posNeg(int a, int b, boolean negative) {
	boolean isAPos = a > 0;
	boolean isBPos = b > 0;
	if (negative) {
	    return !isAPos && !isBPos;
	} else {
	    return (isAPos && !isBPos) || (!isAPos && isBPos);
	}
    }
}
