package string_2;

public class DoubleChar {
    /*
     * Given a string, return a string where for every char in the original, there
     * are two chars.
     */
    public String doubleChar(String str) {
	String result = "";
	for (int i = 0; i < str.length(); i++) {
	    result += "" + str.charAt(i) + str.charAt(i);
	}
	return result;
    }
}
