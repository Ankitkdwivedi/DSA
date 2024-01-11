import java.util.*;

public class Prims_Algo {
    HashMap<Integer,HashMap<Integer,Integer>> map;
    public Prims_Algo(int v){
        map=new HashMap<>();
        for(int i=1;i<=v;i++){
            map.put(i,new HashMap<>());
        }
    }
    public void addEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);

	}
    class PrimsPair{
        int e1;
        int acqv;//acquire
        int cost;
        public PrimsPair(int e1,int acqv,int cost){
            this.e1=e1;
            this.acqv=acqv;
            this.cost=cost;
        }
        public String toString(){
            return this.e1+" "+this.acqv+" @ "+this.cost;
        }
    }
    public void Prims(){
        PriorityQueue<PrimsPair> pq=new PriorityQueue<>(new Comparator<PrimsPair>() {
            public int compare(PrimsPair o1,PrimsPair o2){
                return o1.cost-o2.cost;//min heap 
            }
        });
        pq.add(new PrimsPair(3,3,0));    //curr,parent,cost 
        HashSet<Integer> visited=new HashSet<>();
        while(!pq.isEmpty()){
            PrimsPair rp=pq.poll();
            if(visited.contains(rp.e1)){
                continue;
            }
            visited.add(rp.e1);
            System.out.println(rp);
            for(int nbrs:map.get(rp.e1).keySet()){
                if(!visited.contains(nbrs) ){
                    int cost=map.get(rp.e1).get(nbrs);
                    pq.add(new PrimsPair(nbrs, rp.e1, cost));
                }
            }
        }
    }
    public static void main(String[] args) {
        Prims_Algo g=new Prims_Algo(7);
        g.addEdge(1, 4, 6);
        g.addEdge(1, 2, 10);
        g.addEdge(2, 3, 7);
        g.addEdge(3, 4, 5);
        g.addEdge(4, 5, 1);
        g.addEdge(5, 6, 4);
        g.addEdge(7, 5, 2);
        g.addEdge(6, 7, 3);
        g.Prims();
    }
}
