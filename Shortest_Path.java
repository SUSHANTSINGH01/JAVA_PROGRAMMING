class Solution {
    
    public int[] shortestPath(int[][] edges,int n,int m ,int src) {
        // Code here
        int[][] adj= new int[n][1005];
        Queue<Integer>q=new LinkedList<>();
        
        int[] neighborCounts=new int[10005];
        Arrays.fill(neighborCounts,0);
        int[] minPath=new int[n];
        Arrays.fill(minPath,-1);
        
        q.add(src);
        minPath[src]=0;
        
        for (int[] edge:edges) {
            int u=edge[0];
            int v=edge[1];

            adj[u][neighborCounts[u]++]=v;
            adj[v][neighborCounts[v]++]=u;
        }

        while (!q.isEmpty()) {
            int currNode=q.poll();
            for (int i=0;i<neighborCounts[currNode];i++) {
                int neighbor=adj[currNode][i];
                if(minPath[neighbor]==-1) {
                    minPath[neighbor]=minPath[currNode]+1;
                    q.add(neighbor);
                }
            }
        }

        return minPath;
    }
}
