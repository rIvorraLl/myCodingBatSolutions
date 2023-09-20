package string_2;

public class CatDog {
    /*
     * Return true if the string "cat" and "dog" appear the same number of times in
     * the given string.
     */
    public boolean catDog(String str) {
	int catCounter = 0;
	int dogCounter = 0;
	for (int i = 0; i < str.length() - 2; i++) {
	    if (str.substring(i, i + 3).equals("cat")) {
		catCounter++;
	    } else if (str.substring(i, i + 3).equals("dog")) {
		dogCounter++;
	    }
	}
	return catCounter == dogCounter;
    }
}
