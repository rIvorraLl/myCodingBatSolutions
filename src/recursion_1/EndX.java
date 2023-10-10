package recursion_1;

public class EndX {
    /*
     * Given a string, compute recursively a new string where all the lowercase 'x'
     * chars have been moved to the end of the string.
     */
    public String endX(String str) {
	if (str.length() == 0) {
	    return str;
	}
	if (str.substring(0, 1).equals("x")) {
	    return endX(str.substring(1)) + "x";
	}
	return str.substring(0, 1) + endX(str.substring(1));
    }
}
