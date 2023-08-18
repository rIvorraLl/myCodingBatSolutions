package warmup_2;

public class FirstHalf {
    /*
     * Given a string of even length, return the first half. So the string "WooHoo"
     * yields "Woo".
     */
    public String firstHalf(String str) {
	int half = str.length() / 2;
	return str.substring(0, half);
    }
}
