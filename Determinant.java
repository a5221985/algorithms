public class Determinant {
    public double compute(double[][] matrix) {
        double d = 0.0;
        double p1;
        double p2;
        for (int i = 0; i < matrix.length; i++) {
            p1 = 1.0;
            p2 = 1.0;
            for (int j = 0; j < matrix.length; j++) {
                p1 = p1 * matrix[j][(i + j) % matrix.length];
                p2 = p2 * matrix[j][(2 * matrix.length - 1 + i - j) % matrix.length];
                //System.out.println("pos: " + j + ", " + ((i + j) % matrix.length) + ", m1: " + matrix[j][(i + j) % matrix.length]);
                System.out.println("neg: " + j + ", " + ((2 * matrix.length - 1 - i - j) % matrix.length) + ", m2: " + matrix[j][(2 * matrix.length - 1 + i - j) % matrix.length]);
            }
            System.out.println("p1: " + p1 + ", p2: " + p2); 
            System.out.println();
            d = d + p1 - p2;
        }
        return d;
    }

    public static void main(String[] args) {
        Determinant determinant = new Determinant();
        double[][] matrix = new double [][] {{1, 1, 1, 1, 1}, {16, 8, 4, 2, 1}, {81, 27, 9, 3, 1}, {256, 64, 16, 4, 1}, {625, 125, 25, 5, 1}};
        System.out.println(matrix[1][0]);
        double d = determinant.compute(matrix);

        System.out.println(d);
    }
}
