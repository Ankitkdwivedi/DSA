//fail in negative cost 

import java.util.*;

public class Dijakstra_algo {
    HashMap<Integer, HashMap<Integer, Integer>> map;

    public Dijakstra_algo(int v) {
        map = new HashMap<>();
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void addEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);

    }

    class DijakstraPair {
        int vtx;
        String acqpath;
        int cost;

        public DijakstraPair(int vtx, String acqpath, int cost) {
            this.vtx = vtx;
            this.acqpath = acqpath;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return this.vtx + " " + this.acqpath + " @ " + this.cost;
        }
    }

    public void Dijakstra() {
        PriorityQueue<DijakstraPair> pq = new PriorityQueue<>((a,b)->a.cost-b.cost);
        HashSet<Integer> visited = new HashSet<>();
        pq.add(new DijakstraPair(1, "1", 0));
        while (!pq.isEmpty()) {
            DijakstraPair rp = pq.poll();
            if (visited.contains(rp.vtx))
                continue;
            visited.add(rp.vtx);
            System.out.println(rp);
            for (int nbrs : map.get(rp.vtx).keySet()) {
                if (!visited.contains(nbrs)) {
                    int cost = rp.cost + map.get(rp.vtx).get(nbrs);
                    pq.add(new DijakstraPair(nbrs, rp.acqpath + nbrs, cost));
                }
            }
        }
    }

    public static void main(String[] args) {
        Dijakstra_algo g = new Dijakstra_algo(7);
        g.addEdge(1, 4, 6);
        g.addEdge(1, 2, 10);
        g.addEdge(2, 3, 7);
        g.addEdge(3, 4, 5);
        g.addEdge(4, 5, 1);
        g.addEdge(5, 6, 4);
        g.addEdge(7, 5, 2);
        g.addEdge(6, 7, 3);
        g.Dijakstra();
    }

}
