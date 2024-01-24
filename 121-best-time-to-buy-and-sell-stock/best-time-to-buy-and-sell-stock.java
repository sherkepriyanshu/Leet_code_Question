class Solution {
    public int maxProfit(int[] price) {
        int max =0,mini=price[0];
        for(int i=1;i<price.length;i++)
        {
            int maxprofit = price[i] - mini;
            max = Math.max(max,maxprofit);
            mini = Math.min(mini,price[i]);
            
        }
        return max;
    }
}