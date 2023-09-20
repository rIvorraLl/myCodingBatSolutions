package string_2;

public class EndOther {
    /*
     * Given two strings, return true if either of the strings appears at the very
     * end of the other string, ignoring upper/lower case differences (in other
     * words, the computation should not be "case sensitive"). Note:
     * str.toLowerCase() returns the lowercase version of a string.
     */
    public boolean endOther(String a, String b) {
	String longerOrEqual = a.length() > b.length() ? a : b;
	String shorter = a.length() > b.length() ? b : a;
	if (longerOrEqual.substring(longerOrEqual.length() - shorter.length(), longerOrEqual.length()).toLowerCase()
		.equals(shorter.toLowerCase())) {
	    return true;

	}
	return false;
    }
}