package logic_2;

public class MakeChocolate {
    /*
     * We want make a package of goal kilos of chocolate. We have small bars (1 kilo
     * each) and big bars (5 kilos each). Return the number of small bars to use,
     * assuming we always use big bars before small bars. Return -1 if it can't be
     * done.
     */
    public int makeChocolate(int small, int big, int goal) {
	int diffBigToGoal = goal - big * 5;
	if (diffBigToGoal <= 0) {
	    int resultA = goal % 5 <= small ? goal % 5 : -1;
	    return resultA;
	}
	int resultB = big * 5 + small >= goal ? goal - (big * 5) : -1;
	return resultB;
    }
}