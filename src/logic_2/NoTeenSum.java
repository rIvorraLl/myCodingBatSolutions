package logic_2;

public class NoTeenSum {
    /*
     * Given 3 int values, a b c, return their sum. However, if any of the values is
     * a teen -- in the range 13..19 inclusive -- then that value counts as 0,
     * except 15 and 16 do not count as a teens. Write a separate helper
     * "public int fixTeen(int n) {"that takes in an int value and returns that
     * value fixed for the teen rule. In this way, you avoid repeating the teen code
     * 3 times (i.e. "decomposition"). Define the helper below and at the same
     * indent level as the main noTeenSum().
     */
    public int noTeenSum(int a, int b, int c) {
	int fixedA = fixTeen(a);
	int fixedB = fixTeen(b);
	int fixedC = fixTeen(c);
	return fixedA + fixedB + fixedC;
    }

    public int fixTeen(int n) {
	int[] teens = { 13, 14, 17, 18, 19 };
	for (int i : teens) {
	    if (i == n) {
		return 0;
	    }
	}
	return n;
    }
    

}
