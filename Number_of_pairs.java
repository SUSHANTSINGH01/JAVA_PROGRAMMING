class Solution {
    // Function to count number of pairs such that x^y is greater than y^x.
    private static int upper_bound(double[] sortedArray, double value) {
        int l=0;
        int r=sortedArray.length;

        while(l<r){
            int m=l+(r-l)/2;
            if(sortedArray[m]<=value){
                l=m+1;
            }else{
                r=m;
            }
        }
        return l;
    }
   
    public long countPairs(int x[], int y[], int M, int N) {
        // code here
        
        int n=x.length;
        int m=y.length;
        long res=0;
        
        double[] new_arr=new double[n];
        double[] new_brr=new double[m];
        
        for(int i=0;i<n;i++)
        new_arr[i]=Math.log(x[i])/x[i];
        
        for(int i=0;i<m;i++)
        new_brr[i]=Math.log(y[i])/y[i];
        
        Arrays.sort(new_arr);
        Arrays.sort(new_brr);
        
        for(int i=0;i<m;i++){
            int ind=upper_bound(new_arr,new_brr[i]);
            if(ind!=n)
            res+=(n-ind);
        }
        
        return res;
    }
}
