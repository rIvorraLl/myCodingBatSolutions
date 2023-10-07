package map_2;

import java.util.HashMap;
import java.util.Map;

public class WordAppend {
    /*
     * Loop over the given array of strings to build a result string like this: when
     * a string appears the 2nd, 4th, 6th, etc. time in the array, append the string
     * to the result. Return the empty string if no string appears a 2nd time.
     */
    public String wordAppend(String[] strings) {
	Map<String, Integer> h = new HashMap<String, Integer>();
	String result = "";
	for (String str : strings) {
	    h.put(str, 0);
	}
	for (String str : strings) {
	    h.put(str, h.get(str) + 1);
	    if (h.get(str) % 2 == 0) {
		result += str;
	    }
	}
	return result;
    }
}
