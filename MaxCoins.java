public class MaxCoins {
    public int findMaxCollection(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return 0;
        int[][] cache = new int[matrix.length][matrix[matrix.length - 1].length];
        return findMaxCollection(matrix, matrix.length - 1, matrix[matrix.length - 1].length - 1, cache);
    }

    int findMaxCollection(int[][] matrix, int i, int j, int[][] cache) {
        if (cache[i][j] != 0)
            return cache[i][j];
        if (i == 0 && j == 0) {
            cache[0][0] = matrix[0][0];
            return matrix[0][0];
        }
        int maxFromTop = 0;
        int maxFromLeft = 0;
        if (i > 0)
            maxFromTop = findMaxCollection(matrix, i - 1, j, cache);
        if (j > 0)
            maxFromLeft = findMaxCollection(matrix, i, j - 1, cache);
        cache[i][j] = Math.max(maxFromTop, maxFromLeft) + matrix[i][j];
        return cache[i][j];
    }

    public static void main(String[] args) {
        MaxCoins mc = new MaxCoins();
        int[][] matrix = {
                      {0, 3, 1, 1},
                      {2, 0, 0, 4},
                      {1, 5, 3, 1}
                  };

        System.out.println(mc.findMaxCollection(matrix));
    }
}
