class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        // Your code goes here.
        List<Integer>res=new ArrayList<>();
        int n=nums.length;
        int res1=-123456789;
        int res2=-123456789;
        int c1=0;
        int c2=0;
        
        for(int i=0;i<n;i++)
        {
            if(c1==0)
            {
                res1=nums[i];
                c1=1;
            }
            
            else if(res1==nums[i]) 
            c1++;
            
            else if(c2==0)
            {
                res2=nums[i];
                c2=1;
            }
           
            else if(res2==nums[i]) 
            c2++;
            
            else{
                c1--;
                c2--;
            }
        }
        
        c1=0;
        c2=0;
        
        for(int i=0;i<n;i++)
        {
            if(res1==nums[i]) 
            c1++;
            
            else if(res2==nums[i]) 
            c2++;
        }
        
        if(res1>=res2){
            if(c2>(n/3))
            res.add(res2);
            if(c1>(n/3))
            res.add(res1);
        }else{
            if(c1>(n/3))
            res.add(res1);
            if(c2>(n/3))
            res.add(res2);
        }
        return res;
    }
}
