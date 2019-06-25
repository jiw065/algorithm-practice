package algorithemMethod.DP;

public class BuyStockUnlimitedTime {
	// buy sell everyday, count those profit > 0 
	 public int maxProfit(int[] prices) {
         if (prices.length < 2){
            return 0; 
        }
        int amount = 0;
        for (int i = 0;i<prices.length-1;i++){
            if(prices[i+1]-prices[i] > 0){
                amount +=prices[i+1]-prices[i]; 
            }
        }
        
        return amount; 
    }
}
