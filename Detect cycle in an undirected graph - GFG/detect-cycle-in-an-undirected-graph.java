//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isCycle(V, adj);
            if (ans)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
// } Driver Code Ends

  class  Pair{
     int fm=0;
     int sm=0;
    Pair(int fm,int sm){
         this.fm = fm;
         this.sm = sm;
     }
 }
class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean detect(int V,ArrayList<ArrayList<Integer>> adj,boolean[] vis,int src){
        vis[src]=true;
        Queue<Pair> queue=new LinkedList<>();
        queue.add(new Pair(src,-1));
        
        while(!queue.isEmpty()){
            int a=queue.peek().fm;
            int parent=queue.peek().sm;
            queue.poll();
            
            for(Integer it:adj.get(a)){
                if(!vis[it]){
                    queue.add(new Pair(it,a));
                    vis[it]=true;
                }
                else if(it!=parent){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean[] vis=new boolean[V];
        // Arrays.fill(vis,false);
        for(int i=0;i<V;i++){
            if(!vis[i]){
                if(detect(V,adj,vis,i)){
                    return true;
                }
            }
        }
        return false;
    }
}