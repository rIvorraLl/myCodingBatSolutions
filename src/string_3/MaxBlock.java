package string_3;

public class MaxBlock {
    /*
     * Given a string, return the length of the largest "block" in the string. A
     * block is a run of adjacent chars that are the same.
     */
    public int maxBlock(String str) {
	int counter = 0;
	int prov = 0;
	for (int i = 1; i < str.length(); i++) {
	    if (str.charAt(i - 1) == str.charAt(i)) {
		prov++;
		if (prov > counter) {
		    counter = prov;
		}
	    } else {
		prov = 0;
	    }
	}
	if (str.length() > 0) {
	    counter++;
	}
	return counter;
    }
}