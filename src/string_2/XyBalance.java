package string_2;

public class XyBalance {
    /*
     * We'll say that a String is xy-balanced if for all the 'x' chars in the
     * string, there exists a 'y' char somewhere later in the string. So "xxy" is
     * balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return true if
     * the given string is xy-balanced.
     */
    public boolean xyBalance(String str) {
	int xIndex = -2;
	int yIndex = -1;
	boolean controlX = true;
	boolean controlY = true;
	for (int i = str.length() - 1; i >= 0; i--) {
	    if (str.charAt(i) == 'y' && controlX) {
		yIndex = i;
		controlY = false;
	    } else if (str.charAt(i) == 'x' && controlY) {
		xIndex = i;
		controlX = false;
	    }
	}
	if (yIndex > xIndex) {
	    return true;
	}
	return false;
    }
}
