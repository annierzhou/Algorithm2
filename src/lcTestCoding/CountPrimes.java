package lcTestCoding;

public class CountPrimes {
	public int countPrimes(int n) {
		int count = 0;
		boolean[] notPrime = new boolean[n + 1];
		for( int i = 2; i < n; i ++) {			 
			if(notPrime[i] == false) {
				count++;
				for( int j = 2; j * i < n; j ++) {
					notPrime[j*i] = true;
				}
			}
		}
		return count;		 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
