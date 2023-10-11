package recursion_1;

public class CountHi2 {
    /*
     * Given a string, compute recursively the number of times lowercase "hi"
     * appears in the string, however do not count "hi" that have an 'x' immedately
     * before them.
     */
    public int countHi2(String str) {
	if (str.length() <= 0) {
	    System.out.println(str);
	    return 0;
	}
	if (str.length() > 1 && str.substring(0, 1).equals("x")) {
	    System.out.println("x->" + str);
	    return countHi2(str.substring(2));
	}
	if (str.length() >= 2 && str.substring(0, 2).equals("hi")) {
	    System.out.println("hi->" + str);
	    return countHi2(str.substring(1)) + 1;
	}
	System.out.println(str);
	return countHi2(str.substring(1));
    }

    public static void main(String[] args) {
	CountHi2 test = new CountHi2();
	System.out.println(test.countHi2("ahibhi"));
    }
}
