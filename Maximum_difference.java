class Solution {
    public int findMaxDiff(int[] arr) {
        // code here
        
        int n=arr.length;
        int[] left = new int[n];
        int[] right = new int[n];
        
        for(int i=0;i<n;i++)
        left[i]=right[i]=0;
        
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<n;i++){
            
            while(!st.isEmpty() && st.peek()>=arr[i]) 
            st.pop();

            if(!st.isEmpty()) 
            left[i]=st.peek();
            
            st.push(arr[i]);
        }
        
        st=new Stack<>();
        
        for(int i=n-1;i>=0;i--){
            
            while(!st.isEmpty() && st.peek()>=arr[i]) 
            st.pop();
            
            if(!st.isEmpty()) 
            right[i]=st.peek();
            
            st.push(arr[i]);
        }
        
        int res=0;
        
        for(int i=0;i<n;i++)
        res=Math.max(res,Math.abs(left[i]-right[i]));
        
        return res;
    }
}
