package recursion_1;

public class ChangePi {
    /*
     * Given a string, compute recursively (no loops) a new string where all
     * appearances of "pi" have been replaced by "3.14".
     */
    public String changePi(String str) {
	if (str.length() < 2) {
	    return str;
	}
	if (str.length() == 2) {
	    if (str.equals("pi")) {
		return "3.14" + str.substring(2);
	    } else {
		return str;
	    }
	}
	String s = str.substring(0, 2);
	if (s.equals("pi")) {
	    return "3.14" + changePi(str.substring(2));
	}
	return changePi(str.substring(1));
    }
    
    public static void main(String[] args) {
	ChangePi test = new ChangePi();
	System.out.println(test.changePi("xpix"));
    }
}
