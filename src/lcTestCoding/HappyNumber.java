package lcTestCoding;

public class HappyNumber {
	/*
	 * number 19
    12 + 92 = 82
    82 + 22 = 68
    62 + 82 = 100
    12 + 02 + 02 = 1
	 */
	public static int digitSquareSum(int n) {
		int sum = 0, tmp;
		while (n!=0) {
			tmp = n % 10;
			sum += tmp * tmp;
			n /= 10;
		}
		return sum;
	}
	// like to find cycle in linkedlist, slow and fast will be same with any number, and depends on whether equals to 1
	public static boolean isHappy(int n) {
		int slow = n;
		int fast = n;
		do {
			slow = digitSquareSum(slow);
			fast = digitSquareSum(fast);
			fast = digitSquareSum(fast);	
		} while( slow!=fast);
		if(slow != 1) return false;
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isHappy(19));
	}

}
