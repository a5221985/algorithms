import java.util.List;
import java.util.Queue;
import java.util.Arrays;
import java.util.LinkedList;

public class ColorFigureInMatrix {
    public void print(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void colorShape(char[][] matrix, int[] position, char color) {
        if (position == null || position.length < 2) {
            System.out.println("position should provide (row, column) values");
            return;
        }
        if (position[0] < 0 || position[0] > matrix.length || position[1] < 0 || position[1] > matrix[position[0]].length) {
            System.out.println("position should be within matrix");
            return;
        }
        bfs(matrix, position, color);
    }

    void bfs(char[][] matrix, int[] position, char color) {
        char originalColor = matrix[position[0]][position[1]];
        Queue<List<Integer>> queue = new LinkedList<>();
        queue.add(Arrays.asList(position[0], position[1]));
        matrix[position[0]][position[1]] = color;
        while (!queue.isEmpty()) {
            List<Integer> currentNode = queue.remove();
            if (validNeighbour(matrix, currentNode.get(0) - 1, currentNode.get(1) - 1, originalColor)) {
                matrix[currentNode.get(0) - 1][currentNode.get(1) - 1] = color;
                queue.add(Arrays.asList(currentNode.get(0) - 1, currentNode.get(1) - 1));
            }
            if (validNeighbour(matrix, currentNode.get(0) - 1, currentNode.get(1), originalColor)) {
                matrix[currentNode.get(0) - 1][currentNode.get(1)] = color;
                queue.add(Arrays.asList(currentNode.get(0) - 1, currentNode.get(1)));
            }
            if (validNeighbour(matrix, currentNode.get(0) - 1, currentNode.get(1) + 1, originalColor)) {
                matrix[currentNode.get(0) - 1][currentNode.get(1) + 1] = color;
                queue.add(Arrays.asList(currentNode.get(0) - 1, currentNode.get(1) + 1));
            }
            if (validNeighbour(matrix, currentNode.get(0), currentNode.get(1) + 1, originalColor)) {
                matrix[currentNode.get(0)][currentNode.get(1) + 1] = color;
                queue.add(Arrays.asList(currentNode.get(0), currentNode.get(1) + 1));
            }
            if (validNeighbour(matrix, currentNode.get(0) + 1, currentNode.get(1) + 1, originalColor)) {
                matrix[currentNode.get(0) + 1][currentNode.get(1) + 1] = color;
                queue.add(Arrays.asList(currentNode.get(0) + 1, currentNode.get(1) + 1));
            }
            if (validNeighbour(matrix, currentNode.get(0) + 1, currentNode.get(1), originalColor)) {
                matrix[currentNode.get(0) + 1][currentNode.get(1)] = color;
                queue.add(Arrays.asList(currentNode.get(0) + 1, currentNode.get(1)));
            }
            if (validNeighbour(matrix, currentNode.get(0) + 1, currentNode.get(1) - 1, originalColor)) {
                matrix[currentNode.get(0) + 1][currentNode.get(1) - 1] = color;
                queue.add(Arrays.asList(currentNode.get(0) + 1, currentNode.get(1) - 1));
            }
            if (validNeighbour(matrix, currentNode.get(0), currentNode.get(1) - 1, originalColor)) {
                matrix[currentNode.get(0)][currentNode.get(1) - 1] = color;
                queue.add(Arrays.asList(currentNode.get(0), currentNode.get(1) - 1));
            }
        }
    }

    boolean validNeighbour(char[][] matrix, int row, int col, char color) {
        if (row < 0 || row >= matrix.length || col < 0 || col >= matrix[row].length || matrix[row][col] != color)
            return false;
        return true;
    }

    public static void main(String[] args) {
        ColorFigureInMatrix cfim = new ColorFigureInMatrix();
        char[][] matrix = {
                              {'B', 'B', 'W'},
                              {'W', 'W', 'W'},
                              {'W', 'W', 'W'},
                              {'B', 'B', 'B'}
                          };
        cfim.print(matrix);
        int[] position = {2, 2};
        cfim.colorShape(matrix, position, 'G');
        cfim.print(matrix);
    }
}
