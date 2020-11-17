import java.util.MultiMap;
import java.util.MultiHashMap;
import java.util.List;

class SudokuValidator {
    public boolean isValidSudoku(char[][] board) {
        if (board == null || board.length < 9 || board[0].length < 9)
            return false;
        Map<Character, List<Integer>>[] cache = new Map<>[board.length];
        for (int i = 0; i < cache.length; i++)
            cache[i] = new HashMap<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] >= '1' && board[i][j] <= '9') {
                    if (cache[i].containsKey(board[i][j])) {
                        List<List<Integer>> indicesList = (List) cache.get(board[i][j]);
                        for (List<Integer> indices : indicesList) {
			    if (indices.get(0) == i)
				return false;
			    else if (indices.get(1) == j)
				return false;
			    else {
				int prevBoxRowIndex = indices.get(0) / 3;
				int prevBoxColumnIndex = indices.get(1) / 3;
				int boxRowIndex = i / 3;
				int boxColumnIndex = j / 3;
				if (prevBoxRowIndex == boxRowIndex && prevBoxColumnIndex == boxColumnIndex)
				    return false;
			    }
                        }
                        cache.put(board[i][j], Arrays.asList(i, j));
                    } else {
                        cache.put(board[i][j], Arrays.asList(i, j));
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] board = {
		     {'5','3','.','.','7','.','.','.','.'}
		    ,{'6','.','.','1','9','5','.','.','.'}
		    ,{'.','9','8','.','.','.','.','6','.'}
		    ,{'8','.','.','.','6','.','.','.','3'}
		    ,{'4','.','.','8','.','3','.','.','1'}
		    ,{'7','.','.','.','2','.','.','.','6'}
		    ,{'.','6','.','.','.','.','2','8','.'}
		    ,{'.','.','.','4','1','9','.','.','5'}
		    ,{'.','.','.','.','8','.','.','7','9'}
                };

        SudokuValidator sv = new SudokuValidator();
        System.out.println(sv.isValidSudoku(board));
    }
}
