class Solution {
    // Function to find three numbers such that arr[smaller[i]] < arr[i] <
    // arr[greater[i]]
    public List<Integer> find3Numbers(int[] arr) {
        // code here
        
        int n=arr.length;
        int[] left = new int[n];
        int[] right = new int[n];
        
        left[0]=arr[0];
        right[n-1]=arr[n-1];
        
        for(int i=1;i<n;i++)
        left[i]=Math.min(left[i-1],arr[i]);
        
        for(int i=n-2;i>=0;i--)
        right[i]=Math.max(right[i+1],arr[i]);
        
        for(int i=1;i<n-1;i++)
        if(arr[i]<right[i+1] && arr[i]>left[i-1])
        return new ArrayList<>(Arrays.asList(left[i-1],arr[i],right[i+1]));
            
        return new ArrayList<>();
        
    }
}
