package lcTestCoding;

public class InvertBinaryTree {
	public TreeNode invertTree(TreeNode root) {
		if(root == null) return null;
		TreeNode tmp = root.left;
		root.left = invertTree(root.right);
		root.right = invertTree(tmp);
		return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
