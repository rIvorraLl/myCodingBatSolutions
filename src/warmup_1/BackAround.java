package warmup_1;

public class BackAround {
    /*
     * Given a string, take the last char and return a new string with the last char
     * added at the front and back, so "cat" yields "tcatt". The original string
     * will be length 1 or more.
     */
    public String backAround(String str) {
	char lastChar = str.charAt(str.length() - 1);
	return lastChar + str + lastChar;
    }
}
