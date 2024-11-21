class Solution {
    public int maximumProfit(int prices[]) {
        // code here
        int pur=prices[0];
        int res=0;
        for(int i=1;i<prices.length;i++){
            if(pur<prices[i]){
                res+=prices[i]-pur;
                pur=prices[i];
            }
            pur=Math.min(prices[i],pur);
        }
        return res;
    }
}
