package functional_2;

import java.util.List;

public class NoLong {
    /*
     * Given a list of strings, return a list of the strings, omitting any string
     * length 4 or more.
     */
    public List<String> noLong(List<String> strings) {
	strings.removeIf(s -> s.length() > 3);
	return strings;
    }
}
