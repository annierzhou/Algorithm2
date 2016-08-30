package lcTestCoding;

public class ConstructBinaryTreefromInorderandPostorderTraversal {
	int pIn;
	int pPost;
	public TreeNode buildTree(int[] inorder, int[] postorder) {
		pPost = postorder.length - 1;
		pIn = inorder.length - 1;
		return build(inorder, postorder, null);
	}
	private TreeNode build(int[] inorder, int[] postorder, TreeNode node) {
		if(pPost < 0) return null;
		//create from the tail of post order, the root
		TreeNode root = new TreeNode(postorder[pPost]);
		pPost--;
		if(inorder[pIn] != root.val) {
			root.right = build(inorder, postorder, root);
		}
		pIn--;
		if(node==null||inorder[pIn]!=node.val) {
			root.left = build(inorder, postorder, node);
		}
		return root;
	}

}
