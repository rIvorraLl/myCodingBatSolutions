package warmup_1;

public class IoneTeen {
    /*
     * We'll say that a number is "teen" if it is in the range 13..19 inclusive.
     * Given 2 int values, return true if one or the other is teen, but not both.
     */
    public boolean isloneTeen(int n) {
	if (n > 12 && n < 20) {
	    return true;
	}
	return false;
    }

    public boolean loneTeen(int a, int b) {
	boolean isALT = isloneTeen(a);
	boolean isBLT = isloneTeen(b);
	return (isALT || isBLT) && !(isALT && isBLT);
    }
}
