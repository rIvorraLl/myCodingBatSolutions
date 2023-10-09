package recursion_1;

public class CountX {
    /*
     * Given a string, compute recursively (no loops) the number of lowercase 'x'
     * chars in the string.
     */
    public int countX(String str) {
	if (str.length() == 0) {
	    return 0;
	}
	String s = str.substring(0, 1);
	if (s.equals("x")) {
	    return countX(str.substring(1)) + 1;
	}
	return countX(str.substring(1));
    }
}