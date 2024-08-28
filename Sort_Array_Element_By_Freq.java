class Solution {
    // Function to sort the array according to frequency of elements.
    public ArrayList<Integer> sortByFreq(int arr[]) {
        // add your code here
        
        int n=arr.length;
        Map<Integer,Integer>mp=new HashMap<>();
        List<Map.Entry<Integer,Integer>>list=new ArrayList<>();
        ArrayList<Integer>res=new ArrayList<>();

        for(int i=0;i<n;i++)
        mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        

        list.addAll(mp.entrySet());

        list.sort((a,b) -> {
            if(a.getValue().equals(b.getValue())) 
            return Integer.compare(a.getKey(),b.getKey());
            
            return Integer.compare(b.getValue(),a.getValue());
        });

        for(Map.Entry<Integer,Integer>itr:list){
            int freq=itr.getValue();
            int value=itr.getKey();
            for(int j=0;j<freq;j++) {
                res.add(value);
            }
        }

        return res;
    }
}
