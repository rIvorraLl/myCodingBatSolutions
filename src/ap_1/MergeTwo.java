package ap_1;

public class MergeTwo {
    /*
     * Start with two arrays of strings, A and B, each with its elements in
     * alphabetical order and without duplicates. Return a new array containing the
     * first N elements from the two arrays. The result array should be in
     * alphabetical order and without duplicates. A and B will both have a length
     * which is N or more. The best "linear" solution makes a single pass over A and
     * B, taking advantage of the fact that they are in alphabetical order, copying
     * elements directly to the new array.
     */
    String[] mergeTwo(String[] a, String[] b, int n) {
	String[] result = new String[n];
	int aIndex = 0;
	int bIndex = 0;
	int position = 0;
	int k = n;
	while (k > 0) {
	    if (Character.toLowerCase(a[aIndex].charAt(0)) < Character.toLowerCase(b[bIndex].charAt(0))) {
		result[position] = a[aIndex];
		aIndex++;
		position++;
		k--;
	    } else if (Character.toLowerCase(b[bIndex].charAt(0)) < Character.toLowerCase(a[aIndex].charAt(0))) {
		result[position] = b[bIndex];
		bIndex++;
		position++;
		k--;
	    } else if (Character.toLowerCase(b[bIndex].charAt(0)) == Character.toLowerCase(a[aIndex].charAt(0))) {
		result[position] = a[aIndex];
		aIndex++;
		bIndex++;
		position++;
		k--;
	    }
	}
	return result;
    }
    // mergeTwo(["a", "c", "z"], ["b", "f", "z"], 3) → ["a", "b", "c"] ["a", "f",
    // "c"]
}
