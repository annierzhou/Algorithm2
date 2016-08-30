package lcTestCoding;

public class RemoveElement {
	public static int removeElement(int[] nums, int val) {
		//in place algorithm
		if(nums.length == 0) return 0;
		int begin = 0;
		for(int i =0; i < nums.length; i++) {
			if(nums[i] != val) {
				nums[begin] = nums[i];
				begin++;
			}
		}
		return begin;
	}

	public static void main(String[] args) {
		int[] arr = {1,2,2,3,2};
		System.out.println(removeElement(arr, 5));

	}

}
