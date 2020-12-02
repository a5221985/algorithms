import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.LinkedList;

public class NQueens {
    public Map<Integer, List<Map<Integer, Map<Integer, String>>>> constructCache(int n) {
        Map<Integer, List<Map<Integer, Map<Integer, String>>>> cache = new HashMap<>();
        Map<Integer, Map<Integer, String>> board = new HashMap<>();
        for (int i = 0; i < n; i++) {
	    Map<Integer, String> row = new HashMap<>();
	    for (int j = 0; j < n; j++)
		row.put(j, " ");
            board.put(i, row);
        }
        List<Map<Integer, Map<Integer, String>>> boards = new LinkedList<>();
        boards.add(board);
        cache.put(0, boards);
        return cache;
    }

    public void placeQueens(Map<Integer, List<Map<Integer, Map<Integer, String>>>> cache, int queenNum, int boardSize) {
        if (queenNum == 0)
            return;
        if (queenNum == 1) {
            addBoardWithNewQueenPlacement(cache, queenNum, boardSize);
            return;
        }
        placeQueens(cache, queenNum - 1, boardSize);
        addBoardWithNewQueenPlacement(cache, queenNum, boardSize); 
//        printAllPlacements(cache, queenNum);
    }

    void addBoardWithNewQueenPlacement(Map<Integer, List<Map<Integer, Map<Integer, String>>>> cache, int queenNum, int boardSize) {
	List<Map<Integer, Map<Integer, String>>> cloneBoards = new LinkedList<>();
	List<Map<Integer, Map<Integer, String>>> boards = cache.remove(queenNum - 1);
        if (boards != null) {
	    for (Map<Integer, Map<Integer, String>> board : boards) {
		for (int i = 0; i < boardSize; i++) {
		    Map<Integer, Map<Integer, String>> cloneBoard = clone(board);
		    Map<Integer, String> row = cloneBoard.get(queenNum - 1);
		    if (row.get(i) != "x") {
			row.replace(i, "Q");
			markAttackPositions(cloneBoard, queenNum - 1, i, boardSize);
			printBoard(cloneBoard);
			cloneBoards.add(cloneBoard);
		    }
		}
	    }
	    cache.put(queenNum, cloneBoards);
        }
    }

    void printAllPlacements(Map<Integer, List<Map<Integer, Map<Integer, String>>>> cache, int queenNum) {
        List<Map<Integer, Map<Integer, String>>> boards = cache.get(queenNum - 1);
        if (boards != null) {
	    for (Map<Integer, Map<Integer, String>> board : boards)
		printBoard(board);
        }
    }

    void printBoard(Map<Integer, Map<Integer, String>> board) {
        System.out.println();
        for (Map<Integer, String> row : board.values()) {
            for (String cell : row.values()) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    void markAttackPositions(Map<Integer, Map<Integer, String>> board, int i, int j, int boardSize) {
        for (int column = 0; column < boardSize; column++) {
            if (column != j && board.get(i).get(column) != "x")
                board.get(i).replace(column, "x");
        }

        for (int row = 0; row < boardSize; row++) {
            if (row != i && board.get(row).get(j) != "x")
                board.get(row).replace(j, "x");
        }

        for (int row = 0; row < boardSize; row++) {
            if (row != i && (row + j - i) >= 0 && (row + j - i) < boardSize && board.get(row).get(row + j - i) != "x")
               board.get(row).replace(row + j - i, "x");
        }

        for (int row = 0;row < boardSize; row++) {
            if (row != i &&  (j - row + i) >= 0 && (j - row + i) < boardSize && board.get(row).get(j - row + i) != "x")
               board.get(row).replace(j - row + i, "x");
        }

    }

    Map<Integer, Map<Integer, String>> clone(Map<Integer, Map<Integer, String>> board) {
        Map<Integer, Map<Integer, String>> cloneBoard = new HashMap<>();
        for (Integer rowNum : board.keySet()) {
            Map<Integer, String> row = new HashMap<>();
            row.putAll(board.get(rowNum));
            cloneBoard.put(rowNum, row);
        }
        return cloneBoard;
    }

    public static void main(String[] args) {
        NQueens nQueens = new NQueens();
        int n = 8;
        Map<Integer, List<Map<Integer, Map<Integer, String>>>> cache = nQueens.constructCache(n);
//        System.out.println(cache);
        nQueens.placeQueens(cache, n, n);
//        System.out.println(cache);
    }
}
