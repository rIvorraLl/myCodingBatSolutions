package ap_1;

public class DividesSelf {
    /*
     * We'll say that a positive int divides itself if every digit in the number
     * divides into the number evenly. So for example 128 divides itself since 1, 2,
     * and 8 all divide into 128 evenly. We'll say that 0 does not divide into
     * anything evenly, so no number with a 0 digit divides itself. Note: use % to
     * get the rightmost digit, and / to discard the rightmost digit.
     */
    public boolean dividesSelf(int n) {
	int x = n;
	while (x > 9) {
	    int rightmost = x % 10;
	    if (rightmost == 0) {
		return false;
	    } else {
		if (n % rightmost != 0) {
		    return false;
		}
	    }
	    x = x / 10;
	}
	if (n % x != 0) {
	    return false;
	}
	return true;
    }
}
