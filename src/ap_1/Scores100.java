package ap_1;

public class Scores100 {
    /*
     * Given an array of scores, return true if there are scores of 100 next to each
     * other in the array. The array length will be at least 2.
     */
    public boolean scores100(int[] scores) {
	for (int i = 1; i < scores.length; i++) {
	    if (scores[i - 1] == 100 && scores[i] == 100) {
		return true;
	    }
	}
	return false;
    }
}
