package map_1;

import java.util.Map;

public class MapAB4 {
    /*
     * Modify and return the given map as follows: if the keys "a" and "b" have
     * values that have different lengths, then set "c" to have the longer value. If
     * the values exist and have the same length, change them both to the empty
     * string in the map.
     */
    public Map<String, String> mapAB4(Map<String, String> map) {
	if (map.containsKey("a") == false || map.containsKey("b") == false) {
	    return map;
	}
	if (map.get("a").length() == map.get("b").length()) {
	    map.put("a", "");
	    map.put("b", "");
	    return map;
	}
	if (map.get("a").length() != map.get("b").length()) {
	    String value = map.get("a").length() > map.get("b").length() ? map.get("a") : map.get("b");
	    map.put("c", value);
	}
	return map;
    }
}
