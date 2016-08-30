package lcTestCoding;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
	public boolean containsDuplicate(int[] nums) {
		if (nums.length == 0) return false;
		Set<Integer> set = new HashSet<Integer>();
		for (int n : nums) {
			if (!set.contains(n)) set.add(n);
			if (set.contains(n)) return true;
		}
		return false;
	}

}
