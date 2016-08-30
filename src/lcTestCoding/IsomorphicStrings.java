package lcTestCoding;
import java.util.*;
public class IsomorphicStrings {
	public boolean isIsomorphic(String s, String t) {
		//assume same length
		if(s == null || s.length() < 1) return true;
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		for(int i = 0 ; i < s.length(); i++) {
			if(map.containsKey(s.charAt(i))) {
				if(!map.get(s.charAt(i)).equals(t.charAt(i))) return false;
			} else {
				if(map.containsValue(t.charAt(i))) return false;
				map.put(s.charAt(i), t.charAt(i));
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
