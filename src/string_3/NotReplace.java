package string_3;

public class NotReplace {
    /*
     * Given a string, return a string where every appearance of the lowercase word
     * "is" has been replaced with "is not". The word "is" should not be immediately
     * preceeded or followed by a letter -- so for example the "is" in "this" does
     * not count. (Note: Character.isLetter(char) tests if a char is a letter.)
     */
    public String notReplace(String str) {
	if (str.length() < 3) {
	    if (str.equals("is")) {
		return "is not";
	    } else {
		return str;
	    }
	}
	String result = "";
	for (int i = 0; i < str.length(); i++) {
	    if (i == 0) {
		if (str.charAt(i) == 'i' && str.charAt(i + 1) == 's' && !Character.isLetter(str.charAt(i + 2))) {
		    result += "is not" + str.charAt(i + 2);
		    i += 2;
		} else {
		    result += str.charAt(i);
		}
	    } else if (i == str.length() - 2) {
		if (str.charAt(str.length() - 2) == 'i' && str.charAt(str.length() - 1) == 's'
			&& !Character.isLetter(str.charAt(str.length() - 3))) {
		    result += "is not";
		    break;
		} else {
		    result += str.charAt(i);
		}
	    } else if (str.charAt(i) == 'i' && str.charAt(i + 1) == 's' && !Character.isLetter(str.charAt(i - 1))
		    && !Character.isLetter(str.charAt(i + 2))) {
		result += "is not" + str.charAt(i + 2);
		i += 2;
	    }

	    else {
		result += str.charAt(i);
	    }
	}
	return result;
    }
}