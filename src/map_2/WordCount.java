package map_2;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
    /*
     * The classic word-count algorithm: given an array of strings, return a
     * Map<String, Integer> with a key for each different string, with the value the
     * number of times that string appears in the array.
     */
    public Map<String, Integer> wordCount(String[] strings) {
	Map<String, Integer> result = new HashMap<String, Integer>();
	for (String str : strings) {
	    result.put(str, 0);
	}
	for (String str : strings) {
	    result.put(str, result.get(str) + 1);
	}
	return result;
    }
}
