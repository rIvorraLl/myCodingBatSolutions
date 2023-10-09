package recursion_1;

public class CountHi {
    /*
     * Given a string, compute recursively (no loops) the number of times lowercase
     * "hi" appears in the string.
     */
    public int countHi(String str) {
	if (str.length() < 2) {
	    return 0;
	}
	if (str.length() == 2) {
	    if (str.substring(0, 2).equals("hi")) {
		return 1;
	    } else {
		return 0;
	    }
	}
	if (str.substring(0, 2).equals("hi")) {
	    return countHi(str.substring(1)) + 1;
	}
	return countHi(str.substring(1));
    }
}
