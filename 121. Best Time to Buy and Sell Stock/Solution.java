class Solution {
    public int maxProfit(int[] prices) {
        int max;
        int minprice = prices[0];
        max = 0;
        for(int i=1;i<prices.length;i++){
            int temp = prices[i];
            if(prices[i]<minprice){
                minprice=prices[i];
            }
            else{
                max = Math.max(max,prices[i]-minprice);
            }
        }
        if(max<0){
            return 0;
        }
        return max;
    }
}