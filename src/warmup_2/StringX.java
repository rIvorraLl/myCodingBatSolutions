package warmup_2;

public class StringX {
    /*
     * Given a string, return a version where all the "x" have been removed. Except
     * an "x" at the very start or end should not be removed.
     */
    public String stringX(String str) {
	if (str.length() < 2) {
	    return str;
	}
	String result = str.substring(0, 1);
	for (int i = 1; i < str.length() - 1; i++) {
	    if (str.charAt(i) != 'x') {
		result += str.charAt(i);
	    }
	}
	result += str.charAt(str.length() - 1);
	return result;
    }
}
