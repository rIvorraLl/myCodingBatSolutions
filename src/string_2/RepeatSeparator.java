package string_2;

public class RepeatSeparator {
    /*
     * Given two strings, word and a separator sep, return a big string made of
     * count occurrences of the word, separated by the separator string.
     */
    public String repeatSeparator(String word, String sep, int count) {
	String result = "";
	for (int i = 0; i < count; i++) {
	    if (i == count - 1) {
		result += word;
	    } else {
		result += word + sep;
	    }
	}
	return result;
    }
}
