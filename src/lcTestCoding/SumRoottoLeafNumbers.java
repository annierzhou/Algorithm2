package lcTestCoding;

public class SumRoottoLeafNumbers {
	 public int sumNumbers(TreeNode root) {
		 int sum = 0;
		 return DFS(root, sum);
	 }

	private int DFS(TreeNode root, int sum) {
		if(root == null) return 0;
		if(root.left == null && root.right == null) return sum * 10 + root.val;
		return DFS(root.left, sum * 10 + root.val) + DFS(root.right, sum * 10 + root.val);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
