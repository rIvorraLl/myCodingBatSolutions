package recursion_1;

public class AllStar {
    /*
     * Given a string, compute recursively a new string where all the adjacent chars
     * are now separated by a "*".
     */
    public String allStar(String str) {
	if (str.length() == 1) {
	    	return str.substring(0,1) + allStar(str.substring(1));
	}
	if (str.length() == 0) {
	  return str;
	}
	return str.substring(0,1) + "*" + allStar(str.substring(1));
    }
}
