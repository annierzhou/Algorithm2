package lcTestCoding;
import java.util.*;
public class BinaryTreePaths {
	/*
   1
 /   \
2     3
 \
  5
  ["1->2->5", "1->3"]
	 */

	public List<String> binaryTreePaths0(TreeNode root) {
		ArrayList<String> res = new ArrayList<String>();
		DFS(root, "", res);
		return res;
	}
	public void DFS(TreeNode root, String solution, ArrayList<String> res) {
		if(root == null) return;
		if(root.left == null && root.right == null) {
			solution = solution + root.val;
			res.add(solution);
			return;
		}
		DFS(root.left, solution + root.val + "->", res);
		DFS(root.right, solution +  root.val + "->", res);
	}
}
