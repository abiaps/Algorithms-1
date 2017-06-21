/**
 * Created by abiaps on 6/20/2017.
 */
public class BestTimetoBuyandSellStockII {
    public static int maxProfit(int[] prices) {
        if (prices.length <= 1) return 0;
        int min = prices[0], max = prices[0], maxprofit = 0;
        boolean bought = true;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > max && bought == true)
                max = prices[i];
            else if (prices[i] < max && bought == false) {
                min = prices[i];
                bought = true;
                max = min;
            } else if (prices[i] < max && bought == true) {
                maxprofit += max - min;
                min = prices[i];
                max = min;
            }
        }
        if (bought == true) return maxprofit + (max - min);
        return maxprofit;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3};
        System.out.print(maxProfit(input));
    }
}
