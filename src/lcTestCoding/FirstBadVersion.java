package lcTestCoding;

public class FirstBadVersion {
	public int firstBadVersion(int n) {
		int start = 1;
		int end = n;
		while(start < end) {
			int mid = start + ( end - start) / 2;
			if(!isBadVersion(mid)) start = mid + 1;
			else end = mid;
		}
		return start;	
	}

	private boolean isBadVersion(int mid) {
		// TODO Auto-generated method stub
		return false;
	}

}
