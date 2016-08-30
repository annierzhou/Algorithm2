package lcTestCoding;

public class ValidPalindrome {
	 public static boolean isPalindrome(String s) {
		 if(s == "" || s == null) return true;
		int i = 0, j = s.length() -1 ;
		while(i <= j) {
			if(!Character.isLetterOrDigit(s.charAt(i))) {
				i++;
				continue;
			}			
			if(!Character.isLetterOrDigit(s.charAt(j))) {
				j--;
				continue;
			}
			if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	 }

	public static void main(String[] args) {
		String s = "aa";
		System.out.println(isPalindrome(s));

	}

}
