package ap_1;

import java.util.Arrays;

public class WordsWithout {
    /*
     * Given an array of strings, return a new array without the strings that are
     * equal to the target string. One approach is to count the occurrences of the
     * target string, make a new array of the correct length, and then copy over the
     * correct strings.
     */
    public String[] wordsWithout(String[] words, String target) {
	int countTarget = 0;
	for (int i = 0; i < words.length; i++) {
	    if (!words[i].equals(target)) {
		countTarget++;
	    }
	}
	int j = 0;
	String[] result = new String[countTarget];
	for (int k = 0; k < words.length; k++) {
	    if (!(words[k].equals(target))) {

		result[j] = words[k];
		j++;
	    }
	}
	return result;
    }
}
