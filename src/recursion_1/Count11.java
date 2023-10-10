package recursion_1;

public class Count11 {
    /*
     * Given a string, compute recursively (no loops) the number of "11" substrings
     * in the string. The "11" substrings should not overlap.
     */
    public int count11(String str) {
	if (str.length() == 0) {
	    return 0;
	}
	if (str.length() >= 2 && str.substring(0, 2).equals("11")) {
	    return count11(str.substring(2)) + 1;
	}
	return count11(str.substring(1));
    }
}
