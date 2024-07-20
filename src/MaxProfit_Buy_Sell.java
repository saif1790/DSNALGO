public class MaxProfit_Buy_Sell {

    public static void main(String[] args) {

        int[] prices = {7,6,5,4,3,45};

       maxProfit(prices);
    }

    public static void maxProfit(int[] prices)
    {
        int buyPrice = prices[0];
        int maxProfit = 0;
        int currentProfit = 0;
        int buyDay = 1;
        int sellDay = 1;

        for(int i = 1; i < prices.length; i++)
        {
            if(prices[i] < buyPrice)
            {
                buyPrice = prices[i];
                //if(maxProfit > 0)
                buyDay = i+1;
            }
            else{
                currentProfit = prices[i] - buyPrice;
                maxProfit = Math.max(currentProfit,maxProfit);
               // if(maxProfit > 0)
                sellDay = i+1;
            }
        }
          maxProfitBuyNSellDay(maxProfit,buyDay,sellDay);
    }

    public static void maxProfitBuyNSellDay(int maxProfit,int buyDay, int sellDay)
    {
        System.out.println("Maximum Profit :" + maxProfit +" Buy at day "+buyDay + " and sell on day "+sellDay);
    }
}
