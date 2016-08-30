package lcTestCoding;
import java.util.*;
public class ValidSudoku {

	 public boolean isValidSudoku(char[][] board) {
	        for(int i = 0; i < 9; i++) {
				if(!isValid(board, i, i, 0, 8) || !isValid(board, 0, 8, i, i) || !isValid(board, i / 3 * 3, i / 3 * 3 + 2, i % 3 * 3, i % 3 * 3 + 2)) return false;			
			}
			
			return true;  
	    }
	    
	    public boolean isValid(char[][] board, int xStart, int xEnd, int yStart, int yEnd) {
			HashSet<Integer> set = new HashSet<Integer>();
			for(int x = xStart; x <= xEnd; x++) {
				for(int y = yStart; y <= yEnd; y++) {
					if(board[x][y] != '.' && !set.add(board[x][y] - '0')) return false;
				}
			}
			return true;
		}

}
