package string_2;

public class RepeatFront {
    /*
     * Given a string and an int n, return a string made of the first n characters
     * of the string, followed by the first n-1 characters of the string, and so on.
     * You may assume that n is between 0 and the length of the string, inclusive
     * (i.e. n >= 0 and n <= str.length()).
     */
    public String repeatFront(String str, int n) {
	String result = "";
	int index = n;
	for (int i = 0; i < n; i++) {
	    // System.out.println(str.substring(i, index));
	    result += str.substring(0, index);
	    System.out.println(result + " patata " + index);
	    index--;
	}
	return result;
    }
    
    public static void main(String[] args) {
	RepeatFront test = new RepeatFront();
	System.out.println(test.repeatFront("Chocolate", 4));
    }
}


// repeatFront("Chocolate", 4) → "ChocChoChC"