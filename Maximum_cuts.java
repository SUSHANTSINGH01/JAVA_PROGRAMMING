class Solution
{
    //Function to find the maximum number of cuts.
    public int maximizeCuts(int n, int x, int y, int z)
    {
       //Your code here
        int[] dp=new int[n+1];
        dp[0]=0;
     
        int x_cut=Integer.MIN_VALUE;
        int y_cut=Integer.MIN_VALUE;
        int z_cut=Integer.MIN_VALUE;

        for(int i=1;i<=n;i++){
            
            if(i>=x) 
            x_cut=1+dp[i-x];
            
            if(i>=y)
            y_cut=1+dp[i-y];
            
            if(i>=z)
            z_cut=1+dp[i-z];
            
            dp[i]=Math.max(Math.max(x_cut,y_cut),z_cut);
        }
        
        return dp[n]>=0?dp[n]:0;
    }
}
