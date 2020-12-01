import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.List;

public class SudokuSolver {
    public String[][] solve(String[][] sudokuBoard) {
        Queue<List<Integer>> queue = new LinkedList<>();
        Map<Integer, Map<Integer, Set<String>>> cache = constructCache(sudokuBoard, queue);
        while (!queue.isEmpty()) {
            List<Integer> item = queue.remove();
            int i = item.get(0);
            int j = item.get(1);
            Set<String> currentSet = cache.get(i).get(j);
            String value = currentSet.iterator().next();

            eliminatePossibilityFromRow(cache, i, value, currentSet, queue);
            eliminatePossibilityFromColumn(cache, j, value, currentSet, queue);
            eliminatePossibilityFromBox(cache, i, j, value, currentSet, queue);
        }
        printBoard(cache);
        return sudokuBoard;
    }

    public Map<Integer, Map<Integer, Set<String>>> constructCache(String[][] sudokuBoard, Queue<List<Integer>> queue) {
        Map<Integer, Map<Integer, Set<String>>> cache = new HashMap<>();
        for (int i = 0; i < sudokuBoard.length; i++) {
            Map<Integer, Set<String>> row = new HashMap<>();
            for (int j = 0; j < sudokuBoard[i].length; j++) {
		Set<String> cellSet = new HashSet<>();
                if (sudokuBoard[i][j] == ".") {
                    populateCellSetWithAllPossibilities(sudokuBoard, i, j, cellSet);
		    if (cellSet.size() == 1)
                        queue.add(new LinkedList<>(Arrays.asList(i, j)));
                } else {
                    cellSet.add(sudokuBoard[i][j]);
                    row.put(j, cellSet);
                }
		row.put(j, cellSet);
            }
            cache.put(i, row);
        }
        return cache;
    }

    void populateCellSetWithAllPossibilities(String[][] sudokuBoard, int i, int j, Set<String> cellSet) {
	for (int k = 1; k <= sudokuBoard.length; k++) {
	    if (!isInRow(sudokuBoard, i, k) && !isInColumn(sudokuBoard, j, k) && !isInBox(sudokuBoard, i, j, k))
		cellSet.add("" + k);
	}
    }

    void eliminatePossibilityFromRow(Map<Integer, Map<Integer, Set<String>>> cache, int i, String value, Set<String> currentSet, Queue<List<Integer>> queue) {
        Map<Integer, Set<String>> row = cache.get(i);
	int columnNum = 0;
	for (Set<String> set : row.values()) {
            handleSetOfPossibilities(set, currentSet, value, i, columnNum, queue);
	    columnNum++;
	}
    }
  
    void eliminatePossibilityFromColumn(Map<Integer, Map<Integer, Set<String>>> cache, int j, String value, Set<String> currentSet, Queue<List<Integer>> queue) {
	int rowNum = 0;
	for (Map<Integer, Set<String>> r : cache.values()) {
	    Set<String> set = r.get(j);
            handleSetOfPossibilities(set, currentSet, value, rowNum, j, queue);
	    rowNum++;
	}
    }

    void eliminatePossibilityFromBox(Map<Integer, Map<Integer, Set<String>>> cache, int i, int j, String value, Set<String> currentSet, Queue<List<Integer>> queue) {
	int boxX = (i / 3) * 3;
	int boxY = (j / 3) * 3;
	for (int p = boxX; p < boxX + 3; p++) {
	    for (int q = boxY; q < boxY + 3; q++) {
		Set<String> set = cache.get(p).get(q);
                handleSetOfPossibilities(set, currentSet, value, p, q, queue);
	    }
	}
    }

    void handleSetOfPossibilities(Set<String> set, Set<String> currentSet, String value, int row, int column, Queue<List<Integer>> queue) { 
	if (set != currentSet) {
	    if (set.contains(value)) {
		set.remove(value);
		if (set.size() == 1)
		    queue.add(new LinkedList<>(Arrays.asList(row, column)));
	    }
	}
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

    void printBoard(Map<Integer, Map<Integer, Set<String>>> cache) {
        int rowNum = 0;
        int columnNum = 0;
        System.out.println("|-----------------------|");
        for (Map<Integer, Set<String>> row : cache.values()) {
            for (Set<String> set : row.values()) {
                if (columnNum % 3 == 0)
                    System.out.print("| ");
                System.out.print(set.iterator().next() + " ");
                columnNum++;
            }
            System.out.println("|");
            rowNum++;
            if (rowNum % 3 == 0)
                System.out.println("|-----------------------|");
        }
    }

    public static void main(String[] args) {
        SudokuSolver ss = new SudokuSolver();
        String[][] sudokuBoard = {
            {"5", "3", ".", ".", "7", ".", ".", ".", "."},
            {"6", ".", ".", "1", "9", "5", ".", ".", "."},
            {".", "9", "8", ".", ".", ".", ".", "6", "."},
            {"8", ".", ".", ".", "6", ".", ".", ".", "3"},
            {"4", ".", ".", "8", ".", "3", ".", ".", "1"},
            {"7", ".", ".", ".", "2", ".", ".", ".", "6"},
            {".", "6", ".", ".", ".", ".", "2", "8", "."},
            {".", ".", ".", "4", "1", "9", ".", ".", "5"},
            {".", ".", ".", ".", "8", ".", ".", "7", "9"}
        };
        String[][] sudokuBoardSolved = ss.solve(sudokuBoard); 
    }
}
