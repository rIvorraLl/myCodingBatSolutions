package string_1;

public class MiddleThree {
    /*
     * Given a string of odd length, return the string length 3 from its middle, so
     * "Candy" yields "and". The string length will be at least 3.
     */
    public String middleThree(String str) {
	int middle = str.length() / 2;
	return str.charAt(middle - 1) + "" + str.charAt(middle) + str.charAt(middle + 1);
    }
}
