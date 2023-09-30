package string_3;

public class CountYz {
    /*
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y'
     * in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow" (not case
     * sensitive). We'll say that a y or z is at the end of a word if there is not
     * an alphabetic letter immediately following it. (Note:
     * Character.isLetter(char) tests if a char is an alphabetic letter.)
     */
    public int countYZ(String str) {
	int counter = 0;
	str = str.toLowerCase();
	if (str.charAt(str.length() - 1) == 'y' || str.charAt(str.length() - 1) == 'z') {
	    counter++;
	}
	for (int i = 1; i < str.length(); i++) {
	    if (!Character.isLetter(str.charAt(i)) && (str.charAt(i - 1) == 'z' || str.charAt(i - 1) == 'y')) {
		counter++;
	    }
	}
	return counter;
    }
}