package recursion_1;

public class NestParen {
    /*
     * Given a string, return true if it is a nesting of zero or more pairs of
     * parenthesis, like "(())" or "((()))". Suggestion: check the first and last
     * chars, and then recur on what's inside them.
     */
    public boolean nestParen(String str) {
	if (str.length() == 0) {
	    return true;
	}
	if (!str.substring(0, 1).equals("(") && !str.substring(str.length() - 1, str.length()).equals(")")) {
	    return false;
	}
	if (!str.substring(0, 1).equals("(") && str.substring(str.length() - 1, str.length()).equals(")")) {
	    return false;
	}
	if (str.substring(0, 1).equals("(") && !str.substring(str.length() - 1, str.length()).equals(")")) {
	    return false;
	}
	return nestParen(str.substring(1, str.length() - 1));
    }
}
