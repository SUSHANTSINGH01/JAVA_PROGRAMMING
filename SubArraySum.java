class Solution {

    static int sameOccurrence(int arr[], int x, int y) {
        // write code here
        
       
        HashMap<Integer, Integer> mp = new HashMap<>();
        int res=0;
        int sum=0;
        mp.put(0,1);
        for(int ele:arr)
        {
            if(ele==x)
            sum++;
            
            else if(ele==y)
            sum--;
            
            res+=mp.getOrDefault(sum,0);
            mp.put(sum,mp.getOrDefault(sum,0)+1);
        }
        
        return res;
    }
}
