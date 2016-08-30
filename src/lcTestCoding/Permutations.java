package lcTestCoding;
import java.util.*;
public class Permutations {
	/*
	 * [
  [1,2,3],
  [1,3,2],
  [2,1,3],
  [2,3,1],
  [3,1,2],
  [3,2,1]
]
	 */
	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();
		if (nums == null || nums.length == 0) return res;
		DFS_b(nums, res, list);
		return res;

	}
	private void DFS_b(int[] nums, List<List<Integer>> res, List<Integer> list) {
		if(list.size() == nums.length) {
			res.add(new ArrayList<Integer>(list));
			return;
		}
		for( int i = 0; i < nums.length ; i ++) {
			if(list.contains(nums[i])) continue;
			list.add(nums[i]);
			DFS_b(nums, res, list);
			list.remove(list.size() - 1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
