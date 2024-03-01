import java.util.*;

public class Tuf_Dijakstra {

    static class Pair{
        int node;
        int dis;
        public Pair(int node,int dis){
            this.node=node;
            this.dis=dis;
        }
    }
    //Function to find the shortest distance of all the vertices
    //from the source vertex S.
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {
        // Write your code here
        
        int dis[]=new int[V];
        Arrays.fill(dis,(int)(1e9));
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->a.dis-b.dis);
        dis[S]=0;
        pq.add(new Pair(S,0));
        while(!pq.isEmpty()){
            int node=pq.peek().node;
            int d=pq.peek().dis;
            pq.poll();
            for(List<Integer> l:adj.get(node)){
                int nbrs=l.get(0);
                int weight=l.get(1);
                if(dis[node]+weight<dis[nbrs]){
                    dis[nbrs]=dis[node]+weight;
                    pq.add(new Pair(nbrs,dis[nbrs]));
                }
            }
        }
        return dis;
    }
}