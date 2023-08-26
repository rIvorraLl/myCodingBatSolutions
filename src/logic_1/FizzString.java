package logic_1;

public class FizzString {
    /*
     * Given a string str, if the string starts with "f" return "Fizz". If the
     * string ends with "b" return "Buzz". If both the "f" and "b" conditions are
     * true, return "FizzBuzz". In all other cases, return the string unchanged.
     */
    public String fizzString(String str) {
	boolean fStart = str.charAt(0) == 'f';
	boolean bStart = str.charAt(str.length() - 1) == 'b';
	if (fStart && bStart) {
	    return "FizzBuzz";
	}
	if (fStart) {
	    return "Fizz";
	}
	if (bStart) {
	    return "Buzz";
	}
	return str;
    }
}
