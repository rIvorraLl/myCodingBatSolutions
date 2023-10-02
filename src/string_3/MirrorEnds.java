package string_3;

public class MirrorEnds {
    /*
     * Given a string, look for a mirror image (backwards) string at both the
     * beginning and end of the given string. In other words, zero or more
     * characters at the very begining of the given string, and at the very end of
     * the string in reverse order (possibly overlapping). For example, the string
     * "abXYZba" has the mirror end "ab".
     */
    public String mirrorEnds(String str) {
	String result = "";
	int j = str.length() - 1;
	for (int i = 0; i < str.length(); i++) {
	    if (str.charAt(i) == str.charAt(j)) {
		result += str.charAt(i);
	    } else {
		break;
	    }
	    j--;
	}
	return result;
    }
}
