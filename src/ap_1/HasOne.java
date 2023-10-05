package ap_1;

public class HasOne {
    /*
     * Given a positive int n, return true if it contains a 1 digit. Note: use % to
     * get the rightmost digit, and / to discard the rightmost digit.
     */
    public boolean hasOne(int n) {
	int x = n;
	while (x > 9) {
	    int rightmost = x % 10;
	    if (rightmost == 1) {
		return true;
	    }
	    x = x / 10;
	}
	if (x == 1) {
	    return true;
	}
	return false;
    }
}
