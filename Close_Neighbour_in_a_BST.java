class Solution {
    int res=-1;
    
    void solve(Node root, int k){
        if(root==null)
        return ;
        
        if(root.data<=k){
            res=Math.max(root.data, res);
        }
        
        if(root.left!=null)
        solve(root.left,k);
        
        if(root.right!=null)
        solve(root.right,k);
    }
    public int findMaxFork(Node root, int k) {
        // code here.
        solve(root,k);
        return res;
        
    }
}
