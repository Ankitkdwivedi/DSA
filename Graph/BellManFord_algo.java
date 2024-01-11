import java.util.*;

public class BellManFord_algo {
    HashMap<Integer, HashMap<Integer, Integer>> map;

    public BellManFord_algo(int v) {
        map = new HashMap<>();
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void addEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);
        // map.get(v2).put(v1,           cost);

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
    }
     public List<EdgePair> GetAllEdge(){
        List<EdgePair> ll =new ArrayList<>();
        for(int e1 : map.keySet()){
            for(int e2:map.get(e1).keySet()){
                int cost = map.get(e1).get(e2);
                ll.add(new EdgePair(e1, e2, cost));
            }
        }

        return ll;
    }
    public void BellMan(){
        List<EdgePair> ll=GetAllEdge();
        int v=map.size();
        int []dis=new int[v+1];//distance
        Arrays.fill(dis,(int)Math.pow(10,7));
        dis[1]=0;
        for(int i=1;i<=v;i++){
            for(EdgePair e:ll){
                if(i==v&&dis[e.e2]>dis[e.e1]+e.cost){
                    System.out.println("negative cycle is here");
                    return;
                }
                if(dis[e.e2]>dis[e.e1]+e.cost){
                    dis[e.e2]=dis[e.e1]+e.cost;
                }
            }
        }
        for(int i=1;i<dis.length;i++){
            System.out.println(dis[i]+" ");
        }
    }
    public static void main(String[] args) {
        BellManFord_algo bfd = new BellManFord_algo(5);
        bfd.addEdge(1, 2, 8);
		// bfd.addEdge(2, 5, -2);
		bfd.addEdge(2, 5, 2);
		bfd.addEdge(5, 2, 1);
		bfd.addEdge(4, 5, 4);
		bfd.addEdge(3, 4, -3);
		bfd.addEdge(1, 3, 4);
		bfd.addEdge(1, 4, 5);
        bfd.BellMan();
    }
}
