public class PascalTriangle {
    public Integer[][] generate(int size) {
        Integer[][] pascalTriangle = new Integer[size][];
        for (int i = 0; i < size; i++) {
            pascalTriangle[i] = new Integer[i + 1];
            for (int j = 0; j < i + 1; j++) {
                if (i == 0 || j == 0 || j == i)
                    pascalTriangle[i][j] = 1;
                else
                    pascalTriangle[i][j] = pascalTriangle[i - 1][j - 1] + pascalTriangle[i - 1][j];
            }
        }
        return pascalTriangle;
    }

    public static void main(String[] args) {
        PascalTriangle pascalTriangle = new PascalTriangle();
        int size = 10;
        Integer[][] pt = pascalTriangle.generate(size);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(pt[i][j] + " ");
            }
            System.out.println();
        }
    }
}
