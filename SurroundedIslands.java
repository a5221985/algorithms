import java.util.*;


class SurroundedIslands {
    public int solve(int[][] matrix) {
        boolean isSurrounded = true;
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    isSurrounded = visit(matrix, i, j);
                    if (isSurrounded)
                        count++;
                }
            }
        }
        return count;
    }
    
    boolean visit(int[][] matrix, int i, int j) {
        boolean isSurrounded = true;
        if (i == 0 || i == (matrix.length - 1) || j == 0 || j == (matrix[i].length - 1))
                        isSurrounded = false;
        matrix[i][j] = -1;
        boolean isSurroundedBottom = true;
        if (i + 1 < matrix.length && matrix[i + 1][j] == 1)
            isSurroundedBottom = visit(matrix, i + 1, j);
        boolean isSurroundedLeft = true;
        if (j - 1 > 0 && matrix[i][j - 1] == 1)
            isSurroundedLeft = visit(matrix, i, j - 1);
        boolean isSurroundedRight = true;
        if (j + 1 < matrix[i].length && matrix[i][j + 1] == 1)
            isSurroundedRight = visit(matrix, i, j + 1);
        return isSurrounded && isSurroundedLeft && isSurroundedRight && isSurroundedBottom;
    }

    public void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                             {1, 1, 0, 0, 0},
                             {0, 0, 0, 0, 0},
                             {0, 1, 1, 1, 0},
                             {0, 1, 0, 1, 0},
                             {0, 1, 1, 1, 0},
                             {0, 0, 0, 0, 0}
                         };
        int[][] matrix2 = {
                              {1, 0, 1},
                              {0, 1, 1},
                              {1, 0, 0}
                          };
        SurroundedIslands surroundedIslands = new SurroundedIslands();
        System.out.println(surroundedIslands.solve(matrix));
        System.out.println(surroundedIslands.solve(matrix2));

        surroundedIslands.print(matrix);
        surroundedIslands.print(matrix2);
    }
}

