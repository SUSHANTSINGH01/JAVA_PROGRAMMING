class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      
        ArrayList<Integer> res = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
             
            int n=q.size();
            boolean flag=false;
             
            while((n--)>0)
            {
                Node temp=q.poll();
                
                if(!flag)
                res.add(temp.data);
                 
                if(temp.left!=null)
                q.add(temp.left);
                if(temp.right!=null)
                q.add(temp.right);
                 
                flag=true;
            }
           
        }
        return res;
    }
}
