package recursion_1;

public class ChangeXY {
    /*
     * Given a string, compute recursively (no loops) a new string where all the
     * lowercase 'x' chars have been changed to 'y' chars.
     */
    public String changeXY(String str) {
	if (str.length() < 1) {
	    return str;
	}
	String s = str.substring(0, 1);
	if (s.equals("x")) {
	    return "y" + changeXY(str.substring(1));
	}

	return s + changeXY(str.substring(1));
    }
}
