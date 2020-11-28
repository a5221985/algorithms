public class SpiralMatrix {
    public int[] generateSpiralArray(int[][] matrix) {
        int i = 0;
        int j = 0;
        int rows = matrix.length;
        int columns = matrix[0].length;
        int k = 0;
        int[] spiralArray = new int [matrix.length * matrix[0].length];
        int layers = matrix.length >> 1;
        for (int p = 0; p <= layers; p++) {
	    for (int m = j; k < spiralArray.length && m < columns; m++)
		spiralArray[k++] = matrix[i][m];
	    for (int m = i + 1; k < spiralArray.length && m < rows; m++)
		spiralArray[k++] = matrix[m][columns - 1];
	    for (int m = columns - 2; k < spiralArray.length && m >= j; m--)
		spiralArray[k++] = matrix[rows - 1][m];
	    for (int m = rows - 2; k < spiralArray.length && m > i; m--)
		spiralArray[k++] = matrix[m][j];
            i++;
            j++;
            rows--;
            columns--;
        }
        print(spiralArray);
        return spiralArray;
    }

    public void print(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }
   
    public void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SpiralMatrix sm = new SpiralMatrix();
        //int[][] matrix = {
        //              {1, 2, 3},
        //              {4, 5, 6},
        //              {7, 8, 9}
        //          };
        /*
        int[][] matrix = {
                      {1,  2,  3,  4 },
                      {5,  6,  7,  8 },
                      {9,  10, 11, 12},
                      {13, 14, 15, 16}
                  };
        */
        int rows = 5;
        int columns = 5;
        int[][] matrix = new int[rows][];
        for (int i = 0; i < rows; i++)
            matrix[i] = new int [columns];
        for (int i = 0; i < rows; i++) 
            for (int j = 0; j < columns; j++)
                matrix[i][j] = 10 * i + j + 1;

        sm.print(matrix);
        int[] spiralArray = sm.generateSpiralArray(matrix);
    }
}
