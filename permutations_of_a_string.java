class Solution {
    
    public void swap(int a, int b, char[] s){
        char t=s[a];
        s[a]=s[b];
        s[b]=t;
    }
    public void nextPermutation(int i, char[] charArray, ArrayList<String> arr){
        if(i==charArray.length){
            arr.add(new String(charArray));
            return ;
        }
        
        for(int j=i;j<charArray.length;j++){
            swap(i,j,charArray);
            nextPermutation(i+1,charArray,arr);
            swap(i,j,charArray);
        }
        
        return ;
    }
    public ArrayList<String> findPermutation(String s) {
        // Code here
        
          ArrayList<String> list = new ArrayList<>();
        
          if(s.length()==0)
          return list;
         
          char[] charArray = s.toCharArray();
          nextPermutation(0,charArray,list);
          
          Set<String> st = new HashSet<>();
          
          for(int i=0;i<list.size();i++)
          st.add(list.get(i));
          
          ArrayList<String> res = new ArrayList<>();
          
          for(String str:st)
          res.add(str);
          
          return res;
          
    }
}
