package warmup_2;

public class TheEnd {
    /*
     * Given a string, return a string length 1 from its front, unless front is
     * false, in which case return a string length 1 from its back. The string will
     * be non-empty.
     */
    public String theEnd(String str, boolean front) {
	String result = front ? str.charAt(0) + "" : str.charAt(str.length() - 1) + "";
	return result;
    }
}
