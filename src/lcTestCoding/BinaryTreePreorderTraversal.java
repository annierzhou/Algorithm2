package lcTestCoding;
import java.util.*;
public class BinaryTreePreorderTraversal {
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> res = new ArrayList<>();
		helper(root, res);
		return res;
	}
	private void helper(TreeNode root, List<Integer> res) {
		if (root != null) {
			res.add(root.val);
			if (root.left != null) {
				helper(root.left, res);
			}
			if (root.right != null) {
				helper(root.right, res);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
