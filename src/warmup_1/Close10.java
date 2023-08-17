package warmup_1;

public class Close10 {
    /*
     * Given 2 int values, return whichever value is nearest to the value 10, or
     * return 0 in the event of a tie. Note that Math.abs(n) returns the absolute
     * value of a number.
     */
    public int close10(int a, int b) {
	int aDistance = Math.abs(a - 10);
	int bDistance = Math.abs(b - 10);
	if (aDistance == bDistance) {
	    return 0;
	}
	if (aDistance > bDistance) {
	    return b;
	}
	return a;
    }
}
