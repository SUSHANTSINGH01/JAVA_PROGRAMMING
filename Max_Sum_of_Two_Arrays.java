class Solution {
    public int maxPathSum(List<Integer> arr1, List<Integer> arr2) {
        // code here
        
        int i=0;
        int j=0;
        int n=arr1.size();
        int m=arr2.size();
        int res=0;
        long sum1=0;
        long sum2=0;
        
        while(i<n && j<m){
            
            if(arr1.get(i)<arr2.get(j))
            sum1+=arr1.get(i++);
            
            else if(arr1.get(i)>arr2.get(j))
            sum2+=arr2.get(j++);
            
            else if(arr1.get(i).equals(arr2.get(j))){
                res+=Math.max(sum1,sum2)+arr1.get(i);
                i++;
                j++;
                sum1=0;
                sum2=0;
            }
            
        }
        
        while(i<n)
        sum1+=arr1.get(i++);
        
        
        while(j<m)
        sum2+=arr2.get(j++);

        
        res+=Math.max(sum1,sum2);
        
        return res;
    }
}
