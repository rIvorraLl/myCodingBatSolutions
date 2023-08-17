package warmup_1;

public class NotString {
    /*
     * Given a string, return a new string where "not " has been added to the front.
     * However, if the string already begins with "not", return the string
     * unchanged. Note: use .equals() to compare 2 strings.
     */
    public String notString(String str) {
	String threeFirstChars = "";
	String result = "";
	if (str.length() > 2) {
	    threeFirstChars = str.substring(0, 3);
	}
	if (threeFirstChars.equals("not")) {
	    result = str;
	} else {
	    result = "not " + str;
	}
	return result;
    }
}
