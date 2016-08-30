package lcTestCoding;

public class ValidPerfectSquare {
	public boolean isPerfectSquare(int num) {
		if(num == 1) return true;
		long i = 1;
		long j = num/2;
		long mid = 0;
		long nums = (long)num;
		while( i <= j) {
		    mid = i + (j - i)/2;
			if(mid * mid == nums) return true;
			if(mid * mid < nums) i = mid + 1;
			else j = mid - 1;
		}
		return false;
	}

}
