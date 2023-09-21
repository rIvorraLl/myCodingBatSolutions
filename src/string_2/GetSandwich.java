package string_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GetSandwich {
    /*
     * A sandwich is two pieces of bread with something in between. Return the
     * string that is between the first and last appearance of "bread" in the given
     * string, or return the empty string "" if there are not two pieces of bread.
     */
    public String getSandwich(String str) {
	int firstSlice = str.indexOf("bread");
	int lastSlice = str.lastIndexOf("bread");
	if (firstSlice != -1 && lastSlice != -1 && firstSlice != lastSlice) {
	    return str.substring(firstSlice + 5, lastSlice);
	}
	return "";
    }

}
