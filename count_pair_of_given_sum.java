class Solution {

    int countPairs(int arr[], int target) {
        // Your code here
        Map<Integer, Integer> mp = new HashMap<>();
        int n=arr.length;
        mp.put(arr[0],1);
        int res=0;
        for(int i=1;i<n;i++){
            if(mp.containsKey(target-arr[i]))
            res+=mp.get(target-arr[i]);
            
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }
        
        return res;
    }
}
