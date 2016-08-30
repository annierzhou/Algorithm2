package lcTestCoding;
import java.util.*;
public class PathSumII {
	public boolean hasPathSum(TreeNode root, int sum) {
		if(root == null) return false;
		if(root.left == null && root.right == null && root.val == sum) return true;
		return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
	}

	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();
		DFS_b(root, sum, res, list);
        return res;
	}
	private void DFS_b(TreeNode root, int sum, List<List<Integer>> res,
			List<Integer> list) {
		if(root == null) return;
		list.add(root.val);
		if(root.left == null && root.right == null&& root.val == sum ) {
			res.add(new ArrayList<Integer>(list));
			list.remove(list.size() - 1);
			return;
		}
		DFS_b(root.left, sum - root.val, res, list);
		DFS_b(root.right, sum - root.val, res, list);
		list.remove(list.size() - 1);
	}
}
