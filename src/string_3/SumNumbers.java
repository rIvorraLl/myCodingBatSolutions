package string_3;

public class SumNumbers {
    /*
     * Given a string, return the sum of the numbers appearing in the string,
     * ignoring all other characters. A number is a series of 1 or more digit chars
     * in a row. (Note: Character.isDigit(char) tests if a char is one of the chars
     * '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)
     */
    public int sumNumbers(String str) {
	int result = 0;
	String prov = "";
	for (int i = 0; i < str.length(); i++) {
	    if (Character.isDigit(str.charAt(i))) {
		prov += str.charAt(i);
	    } else {
		if (prov.length() > 0) {
		    int n = Integer.parseInt(prov);
		    result += n;
		    prov = "";
		}
	    }
	}
	if (prov.length() > 0) {
	    int n = Integer.parseInt(prov);
	    result += n;
	}
	return result;
    }
}
