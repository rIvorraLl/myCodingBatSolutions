package warmup_1;

public class IntMax {
    /*
     * Given three int values, a b c, return the largest.
     */
    public int intMax(int a, int b, int c) {
	int max = a;
	if (b > max) {
	    max = b;
	}
	if (c > max) {
	    max = c;
	}
	return max;
    }
}
