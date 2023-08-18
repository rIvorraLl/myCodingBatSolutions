package string_1;

public class ConCat {
    /*
     * Given two strings, append them together (known as "concatenation") and return
     * the result. However, if the concatenation creates a double-char, then omit
     * one of the chars, so "abc" and "cat" yields "abcat".
     */
    public String conCat(String a, String b) {
	String first = a;
	boolean control = a.length() > 0 && b.length() > 0;
	if (control && first.charAt(a.length() - 1) == b.charAt(0)) {
	    first = first.substring(0, first.length() - 1);
	}
	return first + b;
    }
}
