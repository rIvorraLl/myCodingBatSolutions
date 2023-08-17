package warmup_1;

public class Near10 {
    /*
     * Given an int n, return true if it is within 10 of 100 or 200. Note:
     * Math.abs(num) computes the absolute value of a number.
     */
    public boolean nearHundred(int n) {
	boolean inRange1 = n > 89 && n < 111;
	boolean inRange2 = n > 189 && n < 211;
	return inRange1 || inRange2;
    }
}
