package functional_1;

import java.util.List;

public class AddStar {
    /*
     * Given a list of strings, return a list where each string has "*" added at its
     * end.
     */
    public List<String> addStar(List<String> strings) {
	strings.replaceAll(s -> s + "*");
	return strings;
    }
}
