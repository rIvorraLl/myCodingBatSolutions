package logic_1;

public class TeaParty {
    /*
     * We are having a party with amounts of tea and candy. Return the int outcome
     * of the party encoded as 0=bad, 1=good, or 2=great. A party is good (1) if
     * both tea and candy are at least 5. However, if either tea or candy is at
     * least double the amount of the other one, the party is great (2). However, in
     * all cases, if either tea or candy is less than 5, the party is always bad
     * (0).
     */
    public int teaParty(int tea, int candy) {
	boolean notEnoughTea = tea < 5;
	boolean notEnoughCandy = candy < 5;
	boolean teaDouble = tea >= 2 * candy;
	boolean candyDouble = candy >= tea * 2;
	if (notEnoughTea || notEnoughCandy) {
	    return 0;
	}
	if (teaDouble || candyDouble) {
	    return 2;
	}
	return 1;
    }
}
