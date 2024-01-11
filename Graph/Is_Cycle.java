import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Is_Cycle {
    HashMap<Integer, HashMap<Integer, Integer>> map;
    public Is_Cycle(int v) {
        map = new HashMap<>();
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void addEdge(int v1, int v2) {
        map.get(v1).put(v2, 0);
    }
    public int[] indegree(){
        int v=map.size();
        int arr[]=new int [v+1];
        for(int key:map.keySet()){
            for(int nbrs:map.get(key).keySet()){
                arr[nbrs]++;
            }
        }
        return arr;
    }
    public boolean Cycle(){
        int []inDeg=indegree();
        int c=0;
        Queue<Integer> q=new LinkedList<>();
        for(int i=1;i<inDeg.length;i++){
            if(inDeg[i]==0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            c++;
            int v=q.poll();
            // System.out.print(v+" ");
            for(int nbrs:map.get(v).keySet()){
                inDeg[nbrs]--;
                if(inDeg[nbrs]==0) q.add(nbrs);
            }

        }
        return c<map.size();
    }
    public static void main(String[] args) {
        Is_Cycle ts = new Is_Cycle(8);
        ts.addEdge(1, 2);
		ts.addEdge(1, 4);
		ts.addEdge(4, 3);
		ts.addEdge(3, 2);
		ts.addEdge(4, 5);
		ts.addEdge(5, 7);
		ts.addEdge(6, 3);
		ts.addEdge(6,7);
        System.out.println(ts.Cycle());
    }

}
