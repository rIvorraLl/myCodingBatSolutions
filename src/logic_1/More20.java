package logic_1;

public class More20 {
    /*
     * Return true if the given non-negative number is 1 or 2 more than a multiple
     * of 20. See also: Introduction to Mod
     */
    public boolean more20(int n) {
	if ((n - 1) % 20 == 0 || (n - 2) % 20 == 0) {
	    return true;
	}
	return false;
    }
}
