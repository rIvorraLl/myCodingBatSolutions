package map_2;

import java.util.HashMap;
import java.util.Map;

public class WordMultiple {
    /*
     * Given an array of strings, return a Map<String, Boolean> where each different
     * string is a key and its value is true if that string appears 2 or more times
     * in the array.
     */
    public Map<String, Boolean> wordMultiple(String[] strings) {
	Map<String, Integer> h = new HashMap<String, Integer>();
	Map<String, Boolean> result = new HashMap<String, Boolean>();
	for (String str : strings) {
	    h.put(str, 0);
	}
	for (String str : strings) {
	    h.put(str, h.get(str) + 1);
	    if (h.get(str) >= 2) {
		result.put(str, true);
	    } else {
		result.put(str, false);
	    }
	}
	return result;
    }
}
