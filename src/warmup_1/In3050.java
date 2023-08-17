package warmup_1;

public class In3050 {
    /*
     * Given 2 int values, return true if they are both in the range 30..40
     * inclusive, or they are both in the range 40..50 inclusive.
     */
    public boolean in3050(int a, int b) {
	boolean AInRange3040 = a > 29 && a < 41;
	boolean BInRange3040 = b > 29 && b < 41;
	boolean AInRange4050 = a > 39 && a < 51;
	boolean BInRange4050 = b > 39 && b < 51;
	if ((AInRange3040 && BInRange3040) || (AInRange4050 && BInRange4050)) {
	    return true;
	}
	return false;
    }
}
