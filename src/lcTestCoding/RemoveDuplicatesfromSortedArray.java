package lcTestCoding;

public class RemoveDuplicatesfromSortedArray {
	public int removeDuplicates(int[] nums) {
		if(nums.length == 0) return 0;
		int begin = 1;
		for(int i = 1; i < nums.length; i ++) {
			if (nums[i] != nums[i - 1]) {
				nums[begin] = nums[i];		
				begin++;
			}
		}
		return begin;
	}

}
