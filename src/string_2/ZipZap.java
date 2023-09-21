package string_2;

public class ZipZap {
    /*
     * Look for patterns like "zip" and "zap" in the string -- length-3, starting
     * with 'z' and ending with 'p'. Return a string where for all such words, the
     * middle letter is gone, so "zipXzap" yields "zpXzp".
     */
    public String zipZap(String str) {
	if (str.length() < 3) {
	    return str;
	}
	String result = "";
	for (int i = 0; i < str.length(); i++) {
	    String substring = "";
	    if (str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
		substring = "" + str.charAt(i) + str.charAt(i + 2);
		i += 2;
	    } else {
		substring = "" + str.charAt(i);
	    }
	    result += substring;
	}
	return result;
    }
}