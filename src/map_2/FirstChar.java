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
	    String getKey = result.get(firstC);
	    System.out.println(firstC);
	    System.out.println(getKey);
	    System.out.println(firstC.equals(getKey));
	    if (firstC.equals(getKey)) {
		result.put(firstC, str);
	    }
	}
	return result;
    }
    public static void main(String[] args) {
	FirstChar test = new FirstChar();
	String[] arr = { "salt", "tea", "soda", "toast" };
	Map<String, String> h = test.firstChar(arr);
	System.out.println(h.get("s"));
    }
    /*
     * firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
	firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
	firstChar([]) → {}
     */
}
