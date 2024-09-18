class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
        
        int n=x.length();
        Stack<Character>st = new Stack<>();
        
        for(int i=0;i<n;i++)
        {
            if(x.charAt(i)=='('||x.charAt(i)=='{'||x.charAt(i)=='[')
            st.push(x.charAt(i));
            else if(st.size()==0)
            return false;
            else if(x.charAt(i)==')'&& st.peek()=='(')
            st.pop();
            else if(x.charAt(i)=='}'&& st.peek()=='{')
            st.pop();
            else if(x.charAt(i)==']'&& st.peek()=='[')
            st.pop();
            else 
            return false;
            
        }
        
        return st.size()==0?true:false;
    }
}
