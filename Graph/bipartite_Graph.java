import java.util.*;
public class bipartite_Graph {
    class Solution {
        public boolean isBipartite(int[][] graph) {
            HashMap<Integer,Integer> visited=new HashMap<>();
            Queue<bipartite> q=new LinkedList<>();
            for(int i=0;i<graph.length;i++){
                if(visited.containsKey(i)){
                    continue;
                }
                q.add(new bipartite(i,0));
                while (!q.isEmpty()) {
                    bipartite rp=q.poll();
                    if(visited.containsKey(rp.vtx)){
                        if(visited.get(rp.vtx)!=rp.des){
                            return false;
                        }
                        continue;
                    }
                    visited.put(rp.vtx,rp.des);
                    for(int nbrs:graph[rp.vtx]){
                        if(!visited.containsKey(nbrs)){
                            q.add(new bipartite(nbrs, rp.des+1));
                        }
                    }
                }
            }
            return true;
        }
    }
    class bipartite{
        int vtx;
        int des;
        public bipartite(int vtx,int des){
            this.vtx = vtx;
            this.des = des;
        }
    }
}
