package lcTestCoding;
public class MoveZeroes {
	public void moveZeroes(int[] nums) {
		if(nums.length == 0) return;
		int current = 0;
		for (int i = 0; i < nums.length; ++i) {
			if (nums[i] != 0) {
				//if not 0, current is the same as i; if 0; current stays
				nums[current++] = nums[i];
			}
		}
		//make all element after current to 0
		for (int i = current; i < nums.length; ++i) {
			nums[i] = 0;
		}		
	}

	public static void main(String[] args) {


	}

}
