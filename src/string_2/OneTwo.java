package string_2;

public class OneTwo {
    /*
     * Given a string, compute a new string by moving the first char to come after
     * the next two chars, so "abc" yields "bca". Repeat this process for each
     * subsequent group of 3 chars, so "abcdef" yields "bcaefd". Ignore any group of
     * fewer than 3 chars at the end.
     */
    public String oneTwo(String str) {
	String result = "";
	for (int i = 0; i < str.length() - 2; i += 3) {
	    String substring = "" + str.charAt(i + 1) + str.charAt(i + 2) + str.charAt(i);
	    result += substring;
	}
	return result;
    }
}