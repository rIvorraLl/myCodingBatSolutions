package functional_1;

import java.util.List;

public class Lower {
    /*
     * Given a list of strings, return a list where each string is converted to
     * lower case (Note: String toLowerCase() method).
     */
    public List<String> lower(List<String> strings) {
	strings.replaceAll(s -> s.toLowerCase());
	return strings;
    }
}
