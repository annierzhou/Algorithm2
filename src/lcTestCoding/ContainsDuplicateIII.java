package lcTestCoding;
import java.util.*;
public class ContainsDuplicateIII {
	//HashSet
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < nums.length; i ++) {
			if(map.containsKey(nums[i])) {
				if(i - map.get(nums[i]) <= k) return true; 
			}
				map.put(nums[i], i);
			
		}
		return false;
    }
	
	 public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
		 Map<Integer, Integer> map = new HashMap<Integer, Integer> ();
		 for(int i =0; i < nums.length; i ++) {
			 
		 }
		return false;
	 }
	//sliding window
}
