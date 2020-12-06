public class MatrixProduct {
    public int[] findPathWithMaxProduct(int[][] matrix) {
        int[][][] pi = new int [matrix.length][][];
        int[][] products = new int[matrix.length][];

        for (int i = 0; i < products.length; i++) {
            products[i] = new int [matrix[i].length];
            pi[i] = new int [matrix[i].length][];
        }

        print(matrix);

        products[0][0] = matrix[0][0];
        pi[0][0] = new int [] {-1, -1};
        findPathWithMaxProduct(matrix, matrix.length - 1, matrix[matrix.length - 1].length - 1, products, pi);

        System.out.println();
        print(products);
        System.out.println();
        print(pi);

        int[] path = new int [matrix.length + matrix[matrix.length - 1].length - 1];
        int k = path.length - 1;

        path[0] = matrix[0][0];
        for (int i = matrix.length - 1, j = matrix[matrix.length - 1].length - 1; i >= 0 && j >= 0; i = pi[i][j][0], j = pi[i][j][1]) {
            path[k--] = matrix[i][j];
        }
        return path;
    }

    void findPathWithMaxProduct(int[][] matrix, int i, int j, int[][] products, int[][][] pi) {
        if (products[i][j] != 0)
            return;
        if (i == 0 && j == 0) {
            products[i][j] = matrix[i][j];
            pi[i][j] = new int [] {-1, -1};
            return;
        }
        if (i == 0) {
            products[i][j] = matrix[i][j] * matrix[i][j - 1];
            pi[i][j] = new int [] {i, j - 1};
        } else if (j == 0) {
            products[i][j] = matrix[i][j] * matrix[i - 1][j];
            pi[i][j] = new int [] {i - 1, j};
        } else {
            findPathWithMaxProduct(matrix, i, j - 1, products, pi);
            findPathWithMaxProduct(matrix, i - 1, j, products, pi);
            products[i][j] = matrix[i][j] * Math.max(products[i][j - 1], products[i - 1][j]);
            pi[i][j] = products[i][j - 1] > products[i - 1][j] ? new int [] {i, j - 1} : new int [] {i - 1, j};
        }
    }

    void print(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    void print(int[][][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("(" + array[i][j][0] + " " + array[i][j][1] + ") ");
            }
            System.out.println();
        }
    }

    void print(int[] array) {
        System.out.print(array[0]);
        for (int i = 1; i < array.length; i++)
            System.out.print(" -> " + array[i]);
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] matrix = {
                             {1, 2, 3},
                             {4, 5, 6},
                             {7, 8, 9}
                         };
        MatrixProduct mp = new MatrixProduct();
        int[] path = mp.findPathWithMaxProduct(matrix);
        System.out.println();
        mp.print(path);
    }
}
