package lcTestCoding;

public class SingleNumber {
	public int singleNumber(int[] nums) {
		if(nums.length == 0) return 0;
		int result = nums[0];
		for( int i = 1; i < nums.length; i ++) {
			result=result ^ nums[i];
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
