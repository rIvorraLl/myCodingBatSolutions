package warmup_2;

public class CountXx {
    /*
     * Count the number of "xx" in the given string. We'll say that overlapping is
     * allowed, so "xxx" contains 2 "xx".
     */
    public int countXX(String str) {
	int counter = 0;
	for (int i = 0; i < str.length() - 1; i++) {
	    if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'x') {
		counter++;
	    }
	}
	return counter;
    }
}
