package logic_1;

public class ShareDigit {
    /*
     * Given two ints, each in the range 10..99, return true if there is a digit
     * that appears in both numbers, such as the 2 in 12 and 23. (Note: division,
     * e.g. n/10, gives the left digit while the % "mod" n%10 gives the right
     * digit.)
     */
    public static boolean shareDigit(int a, int b) {
	int leftA = a / 10;
	int rightA = a % 10;
	int leftB = b / 10;
	int rightB = b % 10;
	System.out.println(rightA);
	System.out.println(leftB);
	System.out.println(rightA == leftA);
	if (leftA == leftB || leftA == rightB || rightA == leftB || rightA == rightB) {
	    return true;
	}
	return false;
    }
}

// 12, 44