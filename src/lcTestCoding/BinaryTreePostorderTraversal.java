package lcTestCoding;
import java.util.*;
public class BinaryTreePostorderTraversal {
	public List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> res = new ArrayList<>();
		helper(root, res);
		return res;
	}
	private void helper(TreeNode root, List<Integer> res) {
		if (root != null) {
			if (root.left != null) {
				helper(root.left, res);
			}
			if (root.right != null) {
				helper(root.right, res);
			}
			res.add(root.val);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
