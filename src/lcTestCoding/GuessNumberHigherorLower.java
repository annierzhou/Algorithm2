package lcTestCoding;

public class GuessNumberHigherorLower {
	/*
	 * n = 10, I pick 6.
Return 6.
	 */
	public int guessNumber(int n) {
		int i = 1;
		int j = n;
		while(i < j) {
			int mid = i + (j - i) /2;
			if(guess(mid) == 0) return mid;
			if(guess(mid) == 1) {
				i = mid + 1;
			} else {
				j = mid;
			}
		}
		return i;
	}
	private int guess(int mid) {
			return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
