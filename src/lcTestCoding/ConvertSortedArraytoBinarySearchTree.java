package lcTestCoding;

public class ConvertSortedArraytoBinarySearchTree {
	public TreeNode sortedArrayToBST(int[] nums) {
		if(nums.length == 0 ) return null;
		return toBST(nums, 0, nums.length-1);
	}

	public TreeNode toBST(int[] nums, int lo, int hi) {
		if(lo > hi) return null;
		int mid = (lo + hi)/2;
		TreeNode root = new TreeNode(nums[mid]);
		root.left = toBST(nums, lo, mid -1);
		root.right = toBST(nums, mid + 1, hi);
		return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
