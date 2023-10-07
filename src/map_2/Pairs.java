package map_2;

import java.util.HashMap;
import java.util.Map;

public class Pairs {
    /*
     * Given an array of non-empty strings, create and return a Map<String, String>
     * as follows: for each string add its first character as a key with its last
     * character as the value.
     */
    public Map<String, String> pairs(String[] strings) {
	Map<String, String> result = new HashMap<>();
	for (String str : strings) {
	    result.put("" + str.charAt(0), "" + str.charAt(str.length() - 1));
	}
	return result;
    }
}
