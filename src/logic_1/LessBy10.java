package logic_1;

public class LessBy10 {
    /*
     * Given three ints, a b c, return true if one of them is 10 or more less than
     * one of the others.
     */
    public boolean lessBy10(int a, int b, int c) {
	if (a - b >= 10 || a - c >= 10 || b - c >= 10 || b - a >= 10 || c - a >= 10 || c - b >= 10) {
	    return true;
	}
	return false;
    }
}
