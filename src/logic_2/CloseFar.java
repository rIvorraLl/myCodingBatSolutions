package logic_2;

public class CloseFar {
    /*
     * Given three ints, a b c, return true if one of b or c is "close" (differing
     * from a by at most 1), while the other is "far", differing from both other
     * values by 2 or more. Note: Math.abs(num) computes the absolute value of a
     * number.
     */
    public boolean closeFar(int a, int b, int c) {
	boolean bIsClose = Math.abs(a - b) <= 1;
	boolean cIsClose = Math.abs(a - c) <= 1;
	if (bIsClose) {
	    if (Math.abs(c - a) >= 2 && Math.abs(c - b) >= 2) {
		return true;
	    }
	}
	if (cIsClose) {
	    if (Math.abs(b - a) >= 2 && Math.abs(b - c) >= 2) {
		return true;
	    }
	}
	return false;
    }

}