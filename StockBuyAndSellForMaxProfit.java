public class StockBuyAndSellForMaxProfit {
    public int maxProfit(int[] stockPrices) {
        int minPrice = stockPrices[0];
        int maxProfit = Integer.MIN_VALUE;
        int currentProfit = 0;
        for (int i = 1; i < stockPrices.length; i++) {
            currentProfit = stockPrices[i] - minPrice;
            if (maxProfit < currentProfit)
                maxProfit = currentProfit;
            if (minPrice > stockPrices[i])
                minPrice = stockPrices[i];
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        StockBuyAndSellForMaxProfit sbasfmp = new StockBuyAndSellForMaxProfit();
        int[] stockPrices = new int [] {10, 7, 5, 8, 11, 9};
        System.out.println(sbasfmp.maxProfit(stockPrices));
    }
}
