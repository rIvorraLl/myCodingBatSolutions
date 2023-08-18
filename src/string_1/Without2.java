package string_1;

public class Without2 {
    /*
     * Given a string, if a length 2 substring appears at both its beginning and
     * end, return a string without the substring at the beginning, so "HelloHe"
     * yields "lloHe". The substring may overlap with itself, so "Hi" yields "".
     * Otherwise, return the original string unchanged.
     */
    public String without2(String str) {
	if (str.length() <= 1) {
	    return str;
	}
	boolean matchCondition = str.endsWith(str.substring(0, 2));
	String result = matchCondition ? str.substring(2) : str;
	return result;
    }
}
