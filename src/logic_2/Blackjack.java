package logic_2;

public class Blackjack {
    /*
     * Given 2 int values greater than 0, return whichever value is nearest to 21
     * without going over. Return 0 if they both go over.
     */
    public int blackjack(int a, int b) {
	boolean aIsInRange = a <= 21;
	boolean bIsInRange = b <= 21;
	if (!aIsInRange && !bIsInRange) {
	    return 0;
	}
	if (aIsInRange && bIsInRange) {
	    int result = a > b ? a : b;
	    return result;
	}
	int result = !aIsInRange ? b : a;
	return result;
    }
}