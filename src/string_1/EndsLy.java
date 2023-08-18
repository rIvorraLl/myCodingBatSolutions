package string_1;

public class EndsLy {
    /*
     * Given a string, return true if it ends in "ly".
     */
    public boolean endsLy(String str) {
	if (str.length() < 2) {
	    return false;
	}
	boolean ly = str.substring(str.length() - 2, str.length()).equals("ly") ? true : false;
	return ly;
    }
}
