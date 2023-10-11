package recursion_1;

public class ParenBit {
    /*
     * Given a string that contains a single pair of parenthesis, compute
     * recursively a new string made of only of the parenthesis and their contents,
     * so "xyz(abc)123" yields "(abc)".
     */
    public String parenBit(String str) {
	if (str.length() == 0) {
	    return str;
	}
	if (str.substring(0, 1).equals("(")) {
	    return str.substring(0, 1) + parenBit(str.substring(1));
	}
	if (str.substring(0, 1).equals(")")) {
	    return str.substring(0, 1) + parenBit(str.substring(1));
	}
	if (str.contains(")") && !str.contains("(")) {
	    return str.substring(0, 1) + parenBit(str.substring(1));
	}
	return parenBit(str.substring(1));
    }
}
