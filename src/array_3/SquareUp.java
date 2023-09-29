package array_3;

public class SquareUp {
    /*
     * Given n>=0, create an array length n*n with the following pattern, shown here
     * for n=3 : {0, 0, 1, 0, 2, 1, 3, 2, 1} (spaces added to show the 3 groups).
     */
    public int[] squareUp(int n) {
	int position = 0;
	int a = n - 1;
	int[] result = new int[n * n];
	for (int i = 0; i < n * n; i += n) {
	    int num = n;
	    for (int j = 0; j < n; j++) {
		if (j >= a) {
		    result[position] = num;
		}
		position++;
		num--;
	    }
	    a--;
	}
	return result;
    }

}