package string_2;

public class PrefixAgain {
    /*
     * Given a string, consider the prefix string made of the first N chars of the
     * string. Does that prefix string appear somewhere else in the string? Assume
     * that the string is not empty and that N is in the range 1..str.length().
     */
    public boolean prefixAgain(String str, int n) {
	String substr = str.substring(0, n);
	String slice = str.substring(1, str.length());
	return slice.contains(substr);
    }
}
