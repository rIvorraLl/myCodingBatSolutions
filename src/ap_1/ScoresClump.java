package ap_1;

public class ScoresClump {
    /*
     * Given an array of scores sorted in increasing order, return true if the array
     * contains 3 adjacent scores that differ from each other by at most 2, such as
     * with {3, 4, 5} or {3, 5, 5}.
     */
    public boolean scoresClump(int[] scores) {
	if (scores.length < 3) {
	    return false;
	}
	for (int i = 2; i < scores.length; i++) {
	    if (scores[i] - scores[i - 1] < 3 && scores[i - 1] - scores[i - 2] < 3 && scores[i] - scores[i - 2] < 3) {
		return true;
	    }
	}
	return false;
    }
}
