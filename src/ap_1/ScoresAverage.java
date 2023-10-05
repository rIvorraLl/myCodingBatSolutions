package ap_1;

public class ScoresAverage {
    /*
     * Given an array of scores, compute the int average of the first half and the
     * second half, and return whichever is larger. We'll say that the second half
     * begins at index length/2. The array length will be at least 2. To practice
     * decomposition, write a separate helper method int average(int[] scores, int
     * start, int end) { which computes the average of the elements between indexes
     * start..end. Call your helper method twice to implement scoresAverage(). Write
     * your helper method after your scoresAverage() method in the JavaBat text
     * area. Normally you would compute averages with doubles, but here we use ints
     * so the expected results are exact.
     */
    public int scoresAverage(int[] scores) {
	if (scores.length == 2) {
	    int result = scores[0] > scores[1] ? scores[0] : scores[1];
	    return result;
	}
	int firstAv = average(scores, 0, scores.length / 2);
	int secondAv = average(scores, scores.length / 2, scores.length - 1);
	int bigger = firstAv > secondAv ? firstAv : secondAv;
	return bigger;
    }

    int average(int[] scores, int start, int end) {
	int total = 0;
	for (int i = start; i < end; i++) {
	    total += scores[i];
	}
	return total / (end - start);
    }
}
