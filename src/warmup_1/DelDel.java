package warmup_1;

public class DelDel {
    /*
     * Given a string, if the string "del" appears starting at index 1, return a
     * string where that "del" has been deleted. Otherwise, return the string
     * unchanged.
     */
    public String delDel(String str) {
	if (str.length() < 4) {
	    return str;
	}
	if (str.substring(1, 4).equals("del")) {
	    return str.substring(0, 1) + str.substring(4, str.length());
	} else {
	    return str;
	}
    }
}
