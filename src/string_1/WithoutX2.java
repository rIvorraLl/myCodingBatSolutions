package string_1;

public class WithoutX2 {
    /*
     * Given a string, if one or both of the first 2 chars is 'x', return the string
     * without those 'x' chars, and otherwise return the string unchanged. This is a
     * little harder than it looks.
     */
    public String withoutX2(String str) {
	if (str.length() == 0) {
	    return str;
	}
	boolean r2 = str.charAt(0) == 'x';
	if (str.length() < 2) {
	    String result = r2 ? "" : str;
	    return result;
	}
	boolean r1 = str.charAt(0) == 'x' && str.charAt(1) == 'x';
	boolean r3 = str.charAt(1) == 'x';
	if (r1) {
	    return str.substring(2);
	} else if (r2) {
	    return str.substring(1);
	} else if (r3) {
	    return str.substring(0, 1) + str.substring(2);
	}
	return str;
    }
}
