package lcTestCoding;
import java.util.*;
public class ValidParentheses {

	public boolean isValid(String s) {
		if(s == null) return true;
		Stack<Character> st = new Stack<Character>();
		for(int i = 0; i < s.length(); i ++) {
			if(s.charAt(i) == '(' ||s.charAt(i) == '['||s.charAt(i) == '{') st.push(s.charAt(i));
			else if(s.charAt(i) == ')' && !st.empty()&& st.peek() == '(') st.pop();
			else if(s.charAt(i) == ']' && !st.empty()&& st.peek() == '[') st.pop();
			else if(s.charAt(i) == '}' && !st.empty()&& st.peek() == '{') st.pop();
			else return false;
		}
		if(st.empty()) return true;
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
