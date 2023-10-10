package recursion_1;

public class CountAbc {
    /*
     * Count recursively the total number of "abc" and "aba" substrings that appear
     * in the given string.
     */
    public int countAbc(String str) {
	if (str.length() == 0) {
	    return 0;
	}
	if (str.length() >= 3 && (str.substring(0, 3).equals("abc") || str.substring(0, 3).equals("aba"))) {
	    return countAbc(str.substring(1)) + 1;
	}
	return countAbc(str.substring(1));
    }
}
