package map_2;

import java.util.HashMap;
import java.util.Map;

public class WordLen {
    /*
     * Given an array of strings, return a Map<String, Integer> containing a key for
     * every different string in the array, and the value is that string's length.
     */
    public Map<String, Integer> wordLen(String[] strings) {
	Map<String, Integer> result = new HashMap<String, Integer>();
	for (String str : strings) {
	    result.put(str, str.length());
	}
	return result;
    }
}
