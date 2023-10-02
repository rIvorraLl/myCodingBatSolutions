package string_3;

public class SameEnds {
    /*
     * Given a string, return the longest substring that appears at both the
     * beginning and end of the string without overlapping. For example,
     * sameEnds("abXab") is "ab".
     */
    public String sameEnds(String str) {
	String result = "";
	int j = str.length() - 1;
	for (int i = 0; i < str.length() / 2; i++) {
	    if (str.substring(0, i + 1).equals(str.substring(j, str.length()))) {
		result = str.substring(0, i + 1);
	    }
	    j--;
	}
	return result;
    }
}
