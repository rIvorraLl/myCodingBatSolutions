package recursion_1;

public class CountHi2 {
    /*
     * Given a string, compute recursively the number of times lowercase "hi"
     * appears in the string, however do not count "hi" that have an 'x' immedately
     * before them.
     */
    public int countHi2(String str) {
	if (str.length() <= 0) {
	    return 0;
	}
	if (str.length() > 2 && str.substring(0, 1).equals("x") && str.substring(1, 3).equals("hi")) {
	    return countHi2(str.substring(2));
	}
	if (str.length() >= 2 && str.substring(0, 2).equals("hi")) {
	    return countHi2(str.substring(1)) + 1;
	}
	return countHi2(str.substring(1));
    }
}
