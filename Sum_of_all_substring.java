class Solution {
    public static int sumSubstrings(String s) {
        // code here
        int n=s.length();
        int res=s.charAt(0)-'0';
        int[] vec=new int[n];
        vec[0]=s.charAt(0) - '0';
    
        for(int i=1;i<n;i++){
            int num=s.charAt(i)-'0';
            vec[i]=vec[i-1]*10+num*(i+1);
            res=(res+vec[i]);
        }
    
        return res;
    }
}
