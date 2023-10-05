package ap_1;

public class ScoresSpecial {
    /*
     * Given two arrays, A and B, of non-negative int scores. A "special" score is
     * one which is a multiple of 10, such as 40 or 90. Return the sum of largest
     * special score in A and the largest special score in B. To practice
     * decomposition, write a separate helper method which finds the largest special
     * score in an array. Write your helper method after your scoresSpecial() method
     * in the JavaBat text area.
     */
    public int scoresSpecial(int[] a, int[] b) {
	int largestA = largestSpecialScore(a);
	int largestB = largestSpecialScore(b);
	return largestA + largestB;
    }

    public int largestSpecialScore(int[] arr) {
	int largest = 0;
	for (int i = 0; i < arr.length; i++) {
	    if (arr[i] % 10 == 0 && arr[i] > largest) {
		largest = arr[i];
	    }
	}
	return largest;
    }
}
