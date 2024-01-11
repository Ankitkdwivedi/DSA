import java.util.*;

public class KrusKal_algo {
    HashMap<Integer, HashMap<Integer, Integer>> map;

	public KrusKal_algo(int v) {
		this.map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());

		}   

	}

	public void addEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);

	}
    class EdgePair{
        int e1;
        int e2;
        int cost;
        public EdgePair(int e1,int e2,int cost){
            this.e1=e1;
            this.e2=e2;
            this.cost=cost;
        }
        public String toString(){
            return this.e1+" "+this.e2+" @ "+this.cost;
        }
    }
    public List<EdgePair> GetAllEdge(){
        List<EdgePair> ll=new ArrayList<>();
        for(int e1:map.keySet()){
            for(int e2:map.get(e1).keySet()){
                int cost=map.get(e1).get(e2);
                ll.add(new EdgePair(e1,e2,cost));
            }
        }
        return ll;
    }

    public void KrusKal(){
        List<EdgePair> ll=GetAllEdge();
        Collections.sort(ll,new Comparator<EdgePair>() {
            public int compare(EdgePair o1,EdgePair o2){
                return o1.cost-o2.cost;
            }
        });
        DSU dsu=new DSU();
        for(int v:map.keySet()){
            dsu.create(v);
        }
        for(EdgePair e:ll){
            int re1=dsu.find(e.e1);
            int re2=dsu.find(e.e2);
            if(re1==re2){

            }
            else{
                dsu.union(e.e1,e.e2, re2);
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        KrusKal_algo g=new KrusKal_algo(7);
        g.addEdge(1, 4, 6);
        g.addEdge(1, 2, 10);
        g.addEdge(2, 3, 7);
        g.addEdge(3, 4, 5);
        g.addEdge(4, 5, 1);
        g.addEdge(5, 6, 4);
        g.addEdge(7, 5, 2);
        g.addEdge(6, 7, 3);
        g.KrusKal();
    }
}
