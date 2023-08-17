package warmup_2;

public class StringBits {
    /*
     * Given a string, return a new string made of every other char starting with
     * the first, so "Hello" yields "Hlo".
     */
    public String stringBits(String str) {
	String result = "";
	for (int i = 0; i < str.length(); i++) {
	    if (i % 2 == 0) {
		result += str.charAt(i);
	    }
	}
	return result;
    }
}
