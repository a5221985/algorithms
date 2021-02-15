public class FibOrderOneSpace {
    public int find(int n) {
        if (n < 1)
            return -1;
        System.out.print(0 + " ");
        if (n == 1)
            return 0;
        System.out.print(1 + " ");
        if (n == 2)
            return 1;
        int[] fibs = new int[] {0, 1};

        int index = 1;
        for (int i = 2; i < n; i++) {
            index ^= 1;
            fibs[index] = fibs[0] + fibs[1];
            System.out.print(fibs[index] + " ");
        }
        System.out.println();
        return fibs[index];
    }

    public static void main(String[] args) {
        FibOrderOneSpace foos = new FibOrderOneSpace();
        int n = 30;
        System.out.println(foos.find(n));
    }
}
