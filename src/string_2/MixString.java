package string_2;

public class MixString {
    /*
     * Given two strings, a and b, create a bigger string made of the first char of
     * a, the first char of b, the second char of a, the second char of b, and so
     * on. Any leftover chars go at the end of the result.
     */
    public String mixString(String a, String b) {
	String result = "";
	String bigger = a.length() > b.length() ? a : b;
	String smaller = a.length() > b.length() ? b : a;
	for (int i = 0; i < smaller.length(); i++) {
	    result += a.charAt(i);
	    result += b.charAt(i);
	}
	result += bigger.substring(smaller.length(), bigger.length());
	return result;
    }
}
