package lcTestCoding;
import java.util.*;
public class MajorityElement {
	public int majorityElement(int[] num) {
		int major=num[0], count = 1;
		for(int i=1; i<num.length;i++){
			if(count==0){
				count++;
				major=num[i];
			}else if(major==num[i]){
				count++;
			}else count--;

		}
		return major;
	}
	
	public int majorityElement2(int[] nums) {
		Arrays.sort(nums);
	    return nums[nums.length/2];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
