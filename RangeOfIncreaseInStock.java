public class RangeOfIncreaseInStock {
    public int[] computeRanges(int[] stockPrices) {
        if (stockPrices == null || stockPrices.length == 0)
            return new int [0];
        int[] ranges = new int [stockPrices.length];
        ranges[0] = 1;
        for (int i = 1, j = 0; i < stockPrices.length; i++) {
            ranges[i] = 1;
            j = i - 1;
            while (j >= 0) {
                if (stockPrices[j] <= stockPrices[i]) {
                    ranges[i] += ranges[j];
                    j -= ranges[j];
                } else {
                    j--;
                }
            } 
        }
        return ranges;
    }

    public void print(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        RangeOfIncreaseInStock roiis = new RangeOfIncreaseInStock();
        int[] stockPrices = {8, 6, 3, 4, 2, 5, 7};
        int[] ranges = roiis.computeRanges(stockPrices);
        roiis.print(stockPrices);
        roiis.print(ranges);
    }
}
