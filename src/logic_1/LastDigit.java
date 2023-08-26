package logic_1;

public class LastDigit {
    /*
     * Given three ints, a b c, return true if two or more of them have the same
     * rightmost digit. The ints are non-negative. Note: the % "mod" operator
     * computes the remainder, e.g. 17 % 10 is 7.
     */
    public int getLastDigit(int n) {
	int lastDigit = n;
	while (lastDigit > 9) {
	    lastDigit = lastDigit % 10;
	}
	return lastDigit;
    }
    public boolean lastDigit(int a, int b, int c) {
	int lastA = getLastDigit(a);
	int lastB = getLastDigit(b);
	int lastC = getLastDigit(c);
	if (lastA == lastB || lastA == lastC || lastB == lastC) {
	    return true;
	}
	return false;
    }
}
