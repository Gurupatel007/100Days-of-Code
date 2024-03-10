package Day59;

public class bestTime_to_Sell {
    public static int maxProfit(int[] prices){
        int maxProfit = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < prices.length; i++){
            min = Math.min(min, prices[i-1]);
            maxProfit = Math.max(maxProfit, prices[i] - min);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
