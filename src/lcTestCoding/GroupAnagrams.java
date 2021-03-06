package lcTestCoding;
import java.util.*;

public class GroupAnagrams {

	public List<List<String>> groupAnagrams(String[] strs) {
		if (strs == null || strs.length == 0) return new ArrayList<List<String>>();
		HashMap<char[], List<String>> map = new HashMap<char[], List<String>>();
		for(int i = 0; i< strs.length; i ++) {
			char[] c = strs[i].toCharArray();
			Arrays.sort(c);
			if(!map.containsKey(c)) {
				List<String> list = new ArrayList<String>();
				list.add(strs[i]);
				map.put(c, list);
			} else {
				List<String> list = map.get(c);
				list.add(strs[i]);
				map.put(c, list);
			}
		}
		return new ArrayList<List<String>>(map.values());
	}
	
	public List<List<String>> groupAnagrams2(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<List<String>>();
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        Arrays.sort(strs);
        for (String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String keyStr = String.valueOf(ca);
            if (!map.containsKey(keyStr)) {
            	map.put(keyStr, new ArrayList<String>());
            }
            map.get(keyStr).add(s);
        }
        return new ArrayList<List<String>>(map.values());
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
