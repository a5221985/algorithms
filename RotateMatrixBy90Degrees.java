public class RotateMatrixBy90Degrees {
    public void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void rotate(int[][] matrix) {
        int numLayers = matrix.length >> 1;
        int temp = 0;
        int maxI = matrix.length - 1;
        for (int layer = 0; layer < numLayers; layer++) {
            maxI -= 2 * layer;
	    for (int i = 0; i < maxI; i++) {
		temp = matrix[layer][i + layer];
		temp = swap(matrix, i + layer, matrix.length - 1 - layer, temp);
		temp = swap(matrix, matrix.length - 1 - layer, matrix.length - 1 - i - layer, temp);
		temp = swap(matrix, matrix.length - 1 - i - layer, layer, temp);
		swap(matrix, layer, i + layer, temp); 
	    }
        }
    }

    public int swap(int[][] matrix, int i, int j, int source) {
        int temp = matrix[i][j];
        matrix[i][j] = source;
        return temp;
    }

    public static void main(String[] args) {
        RotateMatrixBy90Degrees rm = new RotateMatrixBy90Degrees();
        int length = 10;
        /*
        int[][] matrix = {
                             {1,  2,  3,  4},
                             {5,  6,  7,  8},
                             {9,  10, 11, 12},
                             {13, 14, 15, 16}
                         };
        */
        int[][] matrix = new int [length][];
        for (int i = 0; i < length; i++)
            matrix[i] = new int [length];

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++)
                matrix[i][j] = length * i + j + 1;
        }

        rm.print(matrix);
        rm.rotate(matrix);
        rm.print(matrix);
    }
}
