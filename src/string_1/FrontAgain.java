package string_1;

public class FrontAgain {
    /*
     * Given a string, return true if the first 2 chars in the string also appear at
     * the end of the string, such as with "edited".
     */
    public boolean frontAgain(String str) {
	boolean result = str.length() > 1 ? str.startsWith(str.substring(str.length() - 2, str.length())) : false;
	return result;
    }
}
