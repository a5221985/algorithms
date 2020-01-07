import java.util.Arrays;

public class MultiplyArbitraryPrecision {
    public Integer[] multiply(Integer[] a, Integer[] b) {
        Integer[] m = new Integer[a.length + b.length];
        Arrays.fill(m, 0);
        int p = 0;
        int c = 0;
        for (int i = b.length - 1; i >= 0; i--) {
            for (int j = a.length - 1; j >= 0; j--) {
                p = b[i] * a[j] + m[i + j + 1] + c;
                m[i + j + 1] = p % 10;
                c = p / 10;
            }
        }
        return m;
    }

    public static void main(String[] args) {
        Integer[] a = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Integer[] b = new Integer[] {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5, 6, 7, 8, 9};

        MultiplyArbitraryPrecision map = new MultiplyArbitraryPrecision();

        Integer[] m = map.multiply(a, b);

        for (int i = 0; i < m.length; i++) {
            if (i == 0 && m[i] != 0 || i > 0)
                System.out.print(m[i]);
        }
        System.out.println();
    }
}
