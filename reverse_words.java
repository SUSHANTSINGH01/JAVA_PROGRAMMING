class Solution {
    // Function to reverse words in a given string.
    String reverseWords(String str) {
        // code here
        String res="";
        String temp_str="";
        int n=str.length();
        
        for(int i=n-1;i>=0;i--){
            if(str.charAt(i)=='.')
            {
                temp_str = new StringBuilder(temp_str).reverse().toString();
                res+=temp_str;
                res+=".";
                temp_str="";
            }
            else
            temp_str+=str.charAt(i);
            
            
        }
        
        temp_str = new StringBuilder(temp_str).reverse().toString();
        res+=temp_str;
        return res;
    }
}
