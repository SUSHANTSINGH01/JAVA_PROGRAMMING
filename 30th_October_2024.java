class Solution {
    int countPairsWithDiffK(int[] arr, int k) {
        // code here
        int res=0;
        HashMap<Integer, Integer> mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }
        for(int itr:arr){
            if(mp.containsKey(itr+k)){
                res+=mp.get(itr+k);
            }
            if(mp.containsKey(itr-k)){
                res+=mp.get(itr-k);
            }
            mp.put(itr,mp.get(itr)-1); 
        }
        return res;
    }
}
