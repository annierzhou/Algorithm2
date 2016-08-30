package lcTestCoding;

public class FlattenBinaryTreetoLinkedList {
	public void flatten(TreeNode root) {
		if(root == null) return ;
		flatten(root.left);
		flatten(root.right);
		TreeNode left = root.left;
		TreeNode right = root.right;
		root.left = null;
		root.right = left;
		//go left first, than combine the right one
		while(root.right != null) {
			root = root.right;
		}
		root.right = right;
	}
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
 