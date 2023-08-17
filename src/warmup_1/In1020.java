package warmup_1;

public class In1020 {
    /*
     * Given 2 int values, return true if either of them is in the range 10..20
     * inclusive.
     */
    public boolean in1020(int a, int b) {
	return (a > 9 && a < 21) || (b > 9 && b < 21);
    }
}
