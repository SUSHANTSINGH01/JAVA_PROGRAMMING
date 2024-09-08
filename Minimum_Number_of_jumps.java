class Solution {
    static int minJumps(int[] arr) {
        // your code here
        
        int n=arr.length;
        int res=1;
        int maxx=0;
        int temp=arr[0];
        
        if(temp==0)
        return -1;
            
        for(int i=1;i<n-1;i++)
        {
            maxx=Math.max(maxx,arr[i]+i);
            temp--;
            
            if(temp==0 && i<n-1)
            {
                temp=(maxx-i);
                res++;
            }
            
            if(temp==0)
            return -1;
            
        }
       
        return res;
    }
}
