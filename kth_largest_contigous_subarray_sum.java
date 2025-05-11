class Solution {
    public static int kthLargest(int[] arr, int k) {
        // code here
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int sum=0;
        
        for(int i=0;i<arr.length;i++){
            sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                pq.add(sum);
                if(pq.size()>k)
                pq.poll();
            }
        }
        
        return pq.peek();
        
    }
}
