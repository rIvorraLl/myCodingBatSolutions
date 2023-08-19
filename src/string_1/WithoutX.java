package string_1;

public class WithoutX {
    /*
     * Given a string, if the first or last chars are 'x', return the string without
     * those 'x' chars, and otherwise return the string unchanged.
     */
    public String withoutX(String str) {
	if (str.length() < 1) {
	    return "";
	} else if (str.length() == 1) {
	    String result = str.substring(0, 1).equals("x") ? "" : str;
	    return result;
	}
	boolean first = str.substring(0, 1).equals("x");
	boolean last = str.substring(str.length() - 1, str.length()).equals("x");
	if (first && last) {
	    return str.substring(1, str.length() - 1);
	} else if (first) {
	    return str.substring(1);

	} else if (last) {
	    return str.substring(0, str.length() - 1);
	} else
	    return str;
    }

    public static void main(String[] args) {
	System.out.println(withoutX("xHi"));
    }
}
