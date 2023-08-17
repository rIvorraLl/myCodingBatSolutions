package warmup_2;

public class AltPairs {
    /*
     * Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9
     * ... so "kittens" yields "kien".
     */
    public String altPairs(String str) {
	String result = "";
	for (int i = 0; i < str.length(); i++) {
	    if (i % 2 != 0) {
		result += str.charAt(i);
		i += 2;
	    } else {
		result += str.charAt(i);
	    }
	}
	return result;
    }
}
