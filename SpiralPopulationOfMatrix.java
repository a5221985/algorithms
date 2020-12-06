public class SpiralPopulationOfMatrix {
    public void populate(int[][] matrix) {
        int k = 1;
        int length = matrix.length / 2 + 1;
        for (int n = 0; n < length; n++) {
	    for (int j = n; j < matrix.length - n; j++)
		matrix[n][j] = k++;
	    for (int i = n + 1; i < matrix.length - n; i++)
		matrix[i][matrix.length - 1 - n] = k++; 
	    for (int j = matrix.length - 2 - n; j >= n; j--)
		matrix[matrix.length - 1 - n][j] = k++;
	    for (int i = matrix.length - 2 - n; i >= n + 1; i--)
		matrix[i][n] = k++;
        }
    }

    public void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SpiralPopulationOfMatrix spom = new SpiralPopulationOfMatrix();
     
        int[][] matrix = new int [5][];
        for (int i = 0; i < 5; i++)
            matrix[i] = new int [5];

        spom.print(matrix);
        spom.populate(matrix);
        spom.print(matrix);
    }
}
