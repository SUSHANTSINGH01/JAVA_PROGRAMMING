class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    static class JobComparator implements Comparator<Job> {
        @Override
        public int compare(Job j1, Job j2) {
            return Integer.compare(j2.profit, j1.profit);
        }
    }
    
    int[] JobScheduling(Job arr[], int n)
    {
        // Your code here
        Arrays.sort(arr, new JobComparator());

        int maxDeadline=arr[0].deadline;
        
        for(int i=1;i<n;i++) 
        maxDeadline=Math.max(maxDeadline,arr[i].deadline);
        
        boolean[] isDead = new boolean[maxDeadline+1];

        int count=0;  
        int totalProfit=0; 

        for(int i=0;i<n;i++){
            for(int j=arr[i].deadline;j>0;j--){
                if(!isDead[j]) {
                    isDead[j] = true;
                    count++;
                    totalProfit+=arr[i].profit;
                    break;
                }
            }
            if(count==maxDeadline) 
            break;
        }

        return new int[]{count, totalProfit};
    }
}
