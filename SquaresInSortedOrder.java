public class SquaresInSortedOrder {
    public int[] computeSortedSquares(int[] sorted) {
        if (sorted == null || sorted.length == 0)
            return new int [0];
        int [] sortedSquares = new int [sorted.length];
        int i = 0;
        int j = sorted.length - 1;
        int k = sortedSquares.length - 1;
        while (i <= j) {
            int sum = sorted[i] + sorted[j];
            if (sum <= 0) {
                sortedSquares[k] = sorted[i] * sorted[i];
                i++;
            } else {
                sortedSquares[k] = sorted[j] * sorted[j];
                j--;
            }
            k--;
        }
        return sortedSquares;
    }

    public void print(int[] array) {
        if (array == null || array.length == 0) {
            System.out.println("");
            return;
        }
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        SquaresInSortedOrder siso = new SquaresInSortedOrder();
        int[] sorted = {-9, -2, 0, 2, 3};
        int[] sortedSquares = siso.computeSortedSquares(sorted);
        siso.print(sorted);
        siso.print(sortedSquares);
    }
}
