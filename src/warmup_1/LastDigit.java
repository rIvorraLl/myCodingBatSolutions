package warmup_1;

public class LastDigit {
    /*
     * Given two non-negative int values, return true if they have the same last
     * digit, such as with 27 and 57. Note that the % "mod" operator computes
     * remainders, so 17 % 10 is 7.
     */
    public int lastDigit(int n) {
	int remainder = n;
	while(remainder / 10 > 0) {
	    remainder = remainder % 10;
	}
	return remainder;
    }
    
    public boolean lastDigit (int a, int b) {
	int aLastDigit = lastDigit(a);
	int bLastDigit = lastDigit(b);
	return aLastDigit == bLastDigit;
    }
}
