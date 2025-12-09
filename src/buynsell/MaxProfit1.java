package buynsell;

public class MaxProfit1 {

  public static void main(String[] args) {
    int[] prices = {7, 1, 5, 3, 6, 4};
    int maximumProfit = maxProfit(prices);
    System.out.println("Maximum Profit: " + maximumProfit);
  }

  public static int maxProfit(int[] prices) {
    int minPrice = prices[0];
    int maxProfit = 0;

    int buyDay = 0;
    int sellDay = 0;

    for (int i = 1; i < prices.length; i++) {

      if (prices[i] - minPrice > maxProfit) {
        maxProfit = prices[i] - minPrice;
        sellDay = i;
      }

      if (prices[i] < minPrice) {
        minPrice = prices[i];
        buyDay = i;
      }
    }

    System.out.println("Buy on Day: " + (buyDay+1) + " at price " + prices[buyDay]);
    System.out.println("Sell on Day: " + (sellDay+1) + " at price " + prices[sellDay]);

    return maxProfit;
  }
}
