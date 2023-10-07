package map_2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AllSwap {
    /*
     * We'll say that 2 strings "match" if they are non-empty and their first chars
     * are the same. Loop over and then return the given array of non-empty strings
     * as follows: if a string matches an earlier string in the array, swap the 2
     * strings in the array. When a position in the array has been swapped, it no
     * longer matches anything. Using a map, this can be solved making just one pass
     * over the array. More difficult than it looks.
     */
    public String[] allSwap(String[] strings) {
	HashMap<String, Integer> hm = new HashMap<String, Integer>();
	for (int i = 0; i < strings.length; i++) {
	    if (strings[i] != null) {
		String s = "" + strings[i].charAt(0);
		if (hm.containsKey(s)) {
		    String prov = strings[i];
		    strings[i] = strings[hm.get(s)];
		    strings[hm.get(s)] = prov;
		    hm.remove(s);
		} else {
		    hm.put(s, i);
		}
	    }
	}
	return strings;
    }
}
