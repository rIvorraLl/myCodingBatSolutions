package recursion_1;

public class CountPairs {
    /*
     * We'll say that a "pair" in a string is two instances of a char separated by a
     * char. So "AxA" the A's make a pair. Pair's can overlap, so "AxAxA" contains 3
     * pairs -- 2 for A and 1 for x. Recursively compute the number of pairs in the
     * given string.
     */
    public int countPairs(String str) {
	if (str.length() == 0) {
	    return 0;
	}
	if (str.length() >= 3 && str.substring(0, 1).equals(str.substring(2, 3))) {
	    return countPairs(str.substring(1)) + 1;
	}
	return countPairs(str.substring(1));
    }
}
