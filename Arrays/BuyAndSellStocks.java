package Arrays;

public class BuyAndSellStocks{

    static int buyAndSell(int[] prices){
        int min = Integer.MAX_VALUE;
        int profit = 0;
        for(int num : prices){
            if(num < min) min = num;
            else profit = Math.max(profit, num - min);
        }
        return profit;
    }
    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        int profit = buyAndSell(prices);
        System.out.println(profit);
    }
}