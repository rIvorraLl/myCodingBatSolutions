package array_3;

public class CountTriple {
    /*
     * We'll say that a "triple" in a string is a char appearing three times in a
     * row. Return the number of triples in the given string. The triples may
     * overlap.
     */
    public int countTriple(String str) {
	int counter = 0;
	if (str.length() < 4) {
	    return counter;
	}
	for (int i = 2; i < str.length(); i++) {
	    if (str.charAt(i - 2) == str.charAt(i - 1) && str.charAt(i - 1) == str.charAt(i)) {
		counter++;
	    }
	}
	return counter;
    }
}