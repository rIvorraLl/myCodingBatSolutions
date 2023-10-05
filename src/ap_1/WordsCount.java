package ap_1;

public class WordsCount {
    /*
     * Given an array of strings, return the count of the number of strings with the
     * given length.
     */
    int wordsCount(String[] words, int len) {
	int counter = 0;
	for (int i = 0; i < words.length; i++) {
	    if (words[i].length() == len) {
		counter++;
	    }
	}
	return counter;
    }
}
