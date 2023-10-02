package string_3;

public class EqualIsNot {
    /*
     * Given a string, return true if the number of appearances of "is" anywhere in
     * the string is equal to the number of appearances of "not" anywhere in the
     * string (case sensitive).
     */
    public boolean equalIsNot(String str) {
	int counterN = 0;
	int counterI = 0;
	for (int i = 0; i < str.length() - 1; i++) {
	    if(str.substring(i, i + 2).equals("is")) {
		counterI++;
	    }
	}
	for (int i = 0; i < str.length() - 2; i++) {
	    if(str.substring(i, i + 3).equals("not")) {
		counterN++;
	    }
	}
	return counterI == counterN;
    }
}
