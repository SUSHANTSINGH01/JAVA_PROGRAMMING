class Solution {
    Map<Integer, Integer> mp = new HashMap<>();
    int maxx = Integer.MIN_VALUE;
    
    void solve(Node  root, int lvl, int sum){
        
        if(root==null)
        return ;
        
        lvl++;
        sum+=root.data;
        
        if(root.left==null && root.right==null){
            maxx=Math.max(maxx,lvl);
            if(mp.containsKey(lvl)){
                mp.put(lvl, Math.max(mp.get(lvl),sum));
            }else
            mp.put(lvl,sum);
        }
        
        if(root.left!=null)
        solve(root.left,lvl,sum);
        
        if(root.right!=null)
        solve(root.right,lvl,sum);
        
        lvl--;
        sum-=root.data;
        
    }
    public int sumOfLongRootToLeafPath(Node root) {
        // code here
        int lvl=0;
        int sum=0;
        solve(root,lvl,sum);
        return mp.get(maxx);
    }
}
