class Solution {
    // Function to find the largest number after k swaps.
    String ans="";
    private void solve(char[] charArray, int k, int pos)
    {
        if(k==0 || pos>=charArray.length)
        return;
            
        char maxx=charArray[pos];
        
        for(int i=pos+1;i<charArray.length;i++)
        {
            if(maxx<charArray[i]){
               maxx=charArray[i];
            }
        }
        
        if(maxx!=charArray[pos])
        k--;
            
        for(int i=pos;i<charArray.length;i++)
        {
            if(charArray[i]==maxx)
            {
                swap(charArray,i,pos);
                String str = new String(charArray);
                
                int res = str.compareTo(ans);
                
                if(res>0)
                ans=str;
                    
                solve(charArray,k,pos+1);
                
                swap(charArray,i,pos);
            }
        }
    }
    
    private void swap(char[] ch, int i, int j){
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
    }
    
    public String findMaximumNum(String s, int k) {
        // code here.
       char[] charArray = s.toCharArray();
       solve(charArray,k,0);
       return ans;
    }
}
