package string_3;

public class GHappy {
    /*
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g'
     * immediately to its left or right. Return true if all the g's in the given
     * string are happy.
     */
    public boolean gHappy(String str) {
	if (str.length() == 0) {
	    return true;
	}
	if (str.length() < 2) {
	    return false;
	}
	if (str.length() > 1 && str.charAt(str.length() - 1) == 'g' && str.charAt(str.length() - 2) != 'g') {
	    return false;
	}
	for (int i = 1; i < str.length() - 1; i++) {
	    if (str.charAt(i) == 'g' && (str.charAt(i - 1) != 'g' && str.charAt(i + 1) != 'g')) {
		return false;
	    }
	}
	return true;
    }
}
