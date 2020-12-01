import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class SudokuCache {
    public Map<Integer, Map<Integer, Set<String>>> constructCache(String[][] sudokuBoard) {
        Map<Integer, Map<Integer, Set<String>>> cache = new HashMap<>();
        for (int i = 0; i < sudokuBoard.length; i++) {
            Map<Integer, Set<String>> row = new HashMap<>();
            for (int j = 0; j < sudokuBoard[i].length; j++) {
                if (sudokuBoard[i][j] == ".") {
		    Set<String> columnSet = new HashSet<>();
		    for (int k = 1; k <= sudokuBoard.length; k++) {
			if (!isInRow(sudokuBoard, i, k) && !isInColumn(sudokuBoard, j, k) && !isInBox(sudokuBoard, i, j, k))
			    columnSet.add("" + k);
		    }
		    row.put(j, columnSet);
                }
            }
            cache.put(i, row);
        }
        return cache;
    }

    boolean isInRow(String[][] sudokuBoard, int row, int num) {
        String numStr = "" + num;
        for (int column = 0; column < sudokuBoard[row].length; column++) {
            if (sudokuBoard[row][column] != "." && numStr.equals(sudokuBoard[row][column]))
                return true;
        }
        return false;
    }

    boolean isInColumn(String[][] sudokuBoard, int column, int num) {
        String numStr = "" + num;
        for (int row = 0; row < sudokuBoard.length; row++) {
            if (sudokuBoard[row][column] != "." && numStr.equals(sudokuBoard[row][column]))
                return true;
        }
        return false;
    }

    boolean isInBox(String[][] sudokuBoard, int row, int column, int num) {
        int boxX = (row / 3 ) * 3;
        int boxY = (column / 3) * 3;
        String numStr = "" + num;
        for (int i = boxX; i < boxX + 3; i++) {
            for (int j = boxY; j < boxY + 3; j++) {
                if (sudokuBoard[i][j] != "." && numStr.equals(sudokuBoard[i][j]))
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        SudokuCache sc = new SudokuCache();
        String[][] sudokuBoard = {
            {"5", "3", ".", ".", "7", ".", ".", ".", "."},
            {"6", ".", ".", "1", "9", "5", ".", ".", "."},
            {"" , "9", "8", ".", ".", ".", ".", "6", "."},
            {"8", ".", ".", ".", "6", ".", ".", ".", "3"},
            {"4", ".", ".", "8", ".", "3", ".", ".", "1"},
            {"7", ".", ".", ".", "2", ".", ".", ".", "6"},
            {".", "6", ".", ".", ".", ".", "2", "8", "."},
            {".", ".", ".", "4", "1", "9", ".", ".", "5"},
            {".", ".", ".", ".", "8", ".", ".", "7", "9"}
        };
        Map<Integer, Map<Integer, Set<String>>> cache = sc.constructCache(sudokuBoard); 
        System.out.println(cache);
    }
}
