package logic_1;

public class NearTen {
    /*
     * Given a non-negative number "num", return true if num is within 2 of a
     * multiple of 10. Note: (a % b) is the remainder of dividing a by b, so (7 % 5)
     * is 2.
     */
    public boolean nearTen(int n) {
	int[] checkModulo = { 0, 1 , 2, 8, 9 };
	for (int i = 0; i < checkModulo.length; i++) {
	    if (n % 10 == checkModulo[i]) {
		return true;
	    }
	}
	return false;
    }
}
