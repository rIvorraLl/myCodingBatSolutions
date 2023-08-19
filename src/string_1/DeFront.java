package string_1;

public class DeFront {
    /*
     * Given a string, return a version without the first 2 chars. Except keep the
     * first char if it is 'a' and keep the second char if it is 'b'. The string may
     * be any length. Harder than it looks.
     */
    public String deFront(String str) {
	if (str.length() < 3) {
	    return "";
	}
	String firstChar = str.charAt(0) + "";
	firstChar = firstChar.equals("a") ? "a" : "";
	String secondChar = str.charAt(1) + "";
	secondChar = secondChar.equals("b") ? "b" : "";
	return firstChar + secondChar + str.substring(2);
    }
}
