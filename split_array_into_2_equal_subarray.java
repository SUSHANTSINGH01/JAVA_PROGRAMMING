class Solution {
    public boolean canSplit(int arr[]) {
        // code here
        
        int total_sum=0;
        int n=arr.length;
        
        for(int i=0;i<n;i++)
        total_sum+=arr[i];
       
        if(total_sum%2==1)
        return false;
        
        int half_sum=total_sum/2;
        int current_sum=0;
        int i=0;
        
        while(i<n && current_sum<=half_sum)
        {
            if(current_sum==half_sum)
            return true;
            else
            current_sum+=arr[i];
            i++;
        }
        
        return false;
    }
}
