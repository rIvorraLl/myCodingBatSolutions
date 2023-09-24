package string_2;

public class PlusOut {
    /*
     * Given a string and a non-empty word string, return a version of the original
     * String where all chars have been replaced by pluses ("+"), except for
     * appearances of the word string which are preserved unchanged.
     */
    public String plusOut(String str, String word) {
	String result = "";
	for (int i = 0; i < str.length(); i++) {
	    int len = i + 1;
	    String substring = "";
	    if (i < str.length() - word.length() + 1) {
		len = i + word.length();
		substring = str.substring(i, len);
	    }
	    if (substring.equals(word)) {
		result += word;
		i += word.length() - 1;
	    } else {
		result += '+';
	    }
	}
	return result;
    }
}