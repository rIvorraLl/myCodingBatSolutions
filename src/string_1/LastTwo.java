package string_1;

public class LastTwo {
    /*
     * Given a string of any length, return a new string where the last 2 chars, if
     * present, are swapped, so "coding" yields "codign".
     */
    public String lastTwo(String str) {
	if (str.length() < 2) {
	    return str;
	} else if (str.length() == 2) {
	    return str.substring(1, 2) + str.substring(0, 1);
	}
	return str.substring(0, str.length() - 2) + str.substring(str.length() - 1)
		+ str.substring(str.length() - 2, str.length() - 1);
    }
}
