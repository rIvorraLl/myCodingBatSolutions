package warmup_1;

public class MixStart {
    /*
     * Return true if the given string begins with "mix", except the 'm' can be
     * anything, so "pix", "9ix" .. all count.
     */
    public boolean mixStart(String str) {
	if (str.length() < 3) {
	    return false;
	}
	if (str.substring(1, 3).equals("ix")) {
	    return true;
	}
	return false;
    }
}
