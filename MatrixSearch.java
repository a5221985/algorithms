import java.util.*;


class MatrixSearch {
    public int solve(int[][] matrix, int n) {
        int numOfElements = (matrix.length * matrix[0].length);
        int count = 1;
        int i = 0;
        int j = 0;
        while (count < n && count < numOfElements) {
            int newLeftI = 0;
            int newLeftJ = 0;
            int newRightI = 0;
            int newrightJ = 0;
            if (i > 0)
                newLeftI = i - 1;
            else
                newLeftI = i;
            if (j < nums.length)
                newLeftJ = j + 1;
            else
                newLeftJ = j;
            if ()
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                             {1, 3, 30},
                             {2, 3, 31},
                             {5, 5, 32}
                         };

        
        System.out.println(
    }
}

