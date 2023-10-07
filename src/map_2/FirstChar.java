package map_2;

import java.util.HashMap;
import java.util.Map;

public class FirstChar {
    /*
     * Given an array of non-empty strings, return a Map<String, String> with a key
     * for every different first character seen, with the value of all the strings
     * starting with that character appended together in the order they appear in
     * the array.
     */
    public Map<String, String> firstChar(String[] strings) {
	Map<String, String> result = new HashMap<String, String>();
	if (strings.length == 0) {
	    return result;
	}
	for (String str : strings) {
	    result.put("" + str.charAt(0), "");
	}
	for (String str : strings) {
	    String firstC = "" + str.charAt(0);
	    result.put(firstC, result.get(firstC) + str);

	}
	return result;
    }
}
