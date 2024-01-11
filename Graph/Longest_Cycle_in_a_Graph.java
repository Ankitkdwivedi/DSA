import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Longest_Cycle_in_a_Graph {
    public int longestCycle(int[] edges) {
        int inDeg[]=new int[edges.length];
        for(int i:edges){
            if(i!=-1){
                inDeg[i]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<inDeg.length;i++){
            if(inDeg[i]==0) q.add(i);
        }
        int []visited=new int[edges.length];
        while(!q.isEmpty()){
            int v=q.poll();
            visited[v]=1;
            int nbrs=edges[v];
            if(nbrs!=-1){
                inDeg[nbrs]--;
                if(inDeg[nbrs]==0) q.add(nbrs);
            }
        }
        int ans=-1;
        for(int i=0;i<visited.length;i++){
            if(visited[i]==0){
                int c=1;
                visited[i]=1;
                int nbrs=edges[i];
                while(nbrs!=i){
                    c++;
                    visited[nbrs]=1;
                    nbrs=edges[nbrs];
                }
                ans=Math.max(ans,c);
            }
        }
        return ans;
    }
}
