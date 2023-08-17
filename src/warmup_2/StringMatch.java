package warmup_2;

public class StringMatch {
    /*
     * Given 2 strings, a and b, return the number of the positions where they
     * contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3,
     * since the "xx", "aa", and "az" substrings appear in the same place in both
     * strings.
     */
    public int stringMatch(String a, String b) {
	int counter = 0;
	if ((a.length() < 2 || b.length() < 2)) {
	    return counter;
	}
	String shorter =  a.length() < b.length() ? a : b;
	for (int i = 0; i < shorter.length() - 1; i++) {
	    if (a.charAt(i) == b.charAt(i) && a.charAt(i+ 1) == b.charAt(i + 1)) {
		counter ++;
	    }
	}
	return counter;
    }
}
