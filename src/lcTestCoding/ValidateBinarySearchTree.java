package lcTestCoding;

public class ValidateBinarySearchTree {

	public boolean isValidBST(TreeNode root) {
		return validBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
	}
	
	private boolean validBST(TreeNode root, long min, long max) {
		if(root == null) return true;
		if(root.val > max || root.val < min) return false;
		return validBST(root.left, min, root.val) && validBST(root.right, root.val, max);
	}

	public boolean isValidBST0(TreeNode root) {
		if(root == null) return true;
		if(root.left != null && root.val < root.left.val) return false;
		if(root.right != null && root.val > root.right.val) return false;
		return isValidBST(root.left) && isValidBST(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
