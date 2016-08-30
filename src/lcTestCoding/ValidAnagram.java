package lcTestCoding;
import java.util.*;

public class ValidAnagram {
	public static boolean isAnagram(String s, String t) {
		StringBuilder s1 = new StringBuilder(s);
		StringBuilder t1 = new StringBuilder(t);
		s1 = s1.reverse();
		if(s1.toString().equals(t1.toString())) return true;
		else return false;
	}

	public static boolean isAnagram2(String s, String t) {
		char[] sa = s.toCharArray();
		char[] ta = t.toCharArray();
		Arrays.sort(sa);
		Arrays.sort(ta);
		return Arrays.equals(sa, ta);
	}

	public static void main(String[] args) {
		String s = "";
		String t = "";
		System.out.println(isAnagram2(s,t));
	}



}
