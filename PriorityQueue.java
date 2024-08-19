class Solution {
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
        
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->b-a);
        int n=arr.length;
        for(int i=0;i<n;i++){
            pq.offer(arr[i]);
            if(pq.size()>k) 
            pq.poll();
        }
        return pq.peek();
    }
}
