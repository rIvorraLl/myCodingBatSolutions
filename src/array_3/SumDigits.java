package array_3;

public class SumDigits {
    /*
     * Given a string, return the sum of the digits 0-9 that appear in the string,
     * ignoring all other characters. Return 0 if there are no digits in the string.
     * (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1',
     * .. '9'. Integer.parseInt(string) converts a string to an int.)
     */
    public int sumDigits(String str) {
	int sum = 0;
	for (int i = 0; i < str.length(); i++) {
	    if (Character.isDigit(str.charAt(i))) {
		int n = Integer.parseInt("" + str.charAt(i));
		sum += n;
	    }
	}
	return sum;
    }
}
