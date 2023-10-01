package string_3;

public class WithoutString {
    /*
     * Given two strings, base and remove, return a version of the base string where
     * all instances of the remove string have been removed (not case sensitive).
     * You may assume that the remove string is length 1 or more. Remove only
     * non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     */
    public String withoutString(String base, String remove) {
	base = base.replaceAll(remove, "");
	base = base.replaceAll(remove.toUpperCase(), "");
	return base.replaceAll(remove.toLowerCase(), "");
    }
}
