package string_2;

public class StarOut {
    /*
     * Return a version of the given string, where for every star (*) in the string
     * the star and the chars immediately to its left and right are gone. So "ab*cd"
     * yields "ad" and "ab**cd" also yields "ad".
     */
    public String starOut(String str) {
	String result = str.replaceAll("[\\w?]{0,1}\\*[\\w]{0,1}", "");

	return result;
    }
}