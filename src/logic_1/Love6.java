package logic_1;

public class Love6 {
    /*
     * The number 6 is a truly great number. Given two int values, a and b, return
     * true if either one is 6. Or if their sum or difference is 6. Note: the
     * function Math.abs(num) computes the absolute value of a number.
     */
    public boolean love6(int a, int b) {
	boolean result = false;
	if (a == 6 || b == 6 || (a - b) == 6 || (b - a) == 6 || a + b == 6) {
	    result = true;
	}
	return result;
    }
}
