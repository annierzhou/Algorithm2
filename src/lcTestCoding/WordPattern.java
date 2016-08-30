package lcTestCoding;
import java.util.*;
public class WordPattern {
	public boolean wordPattern(String pattern, String str) {
		String[] words = str.split(" ");
		if(words.length != pattern.length()) return false;
		HashMap<Character, String> map = new HashMap<Character, String>();
		for(int i = 0 ; i < pattern.length(); i ++) {
			if(map.containsKey(pattern.charAt(i))) {
				if(!map.get(pattern.charAt(i)).equals(words[i])) return false;
			} else {
				if(map.containsValue(words[i])) return false;
				map.put(pattern.charAt(i), words[i]);
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
