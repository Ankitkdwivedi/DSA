import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Topological_Sort {
    HashMap<Integer, HashMap<Integer, Integer>> map;
    public Topological_Sort(int v) {
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
    public void Topological(){
        int []inDeg=indegree();
        Queue<Integer> q=new LinkedList<>();
        for(int i=1;i<inDeg.length;i++){
            if(inDeg[i]==0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int v=q.poll();
            System.out.print(v+" ");
            for(int nbrs:map.get(v).keySet()){
                inDeg[nbrs]--;
                if(inDeg[nbrs]==0) q.add(nbrs);
            }

        }
    }
    public static void main(String[] args) {
        Topological_Sort ts = new Topological_Sort(8);
        ts.addEdge(1, 2);
		ts.addEdge(1, 4);
		ts.addEdge(4, 3);
		ts.addEdge(3, 2);
		ts.addEdge(4, 5);
		ts.addEdge(5, 7);
		ts.addEdge(6, 3);
		ts.addEdge(6,7);
        ts.Topological();
    }
}








//striver's logic is here 

//use stack and store the node in dfs 






// class Solution
// {
//     //Function to return list containing vertices in Topological order. 
//     static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
//     {
//         // add your code here
//         int []vis=new int [V];
//         Stack<Integer> st=new Stack<>();//taki ordering ulta kr sken
//         for(int i=0;i<adj.size();i++){
//             if(vis[i]==0){
//                 dfs(adj,vis,st,i);
//             }
//         }
//         int ans[]=new int[V];
//         for(int i=0;i<V;i++){
//             ans[i]=st.pop();
//         }
//         return ans;
//     }
//     static void dfs(ArrayList<ArrayList<Integer>> adj,int vis[],Stack<Integer> st,int node){
//         vis[node]=1;
//         for(int nbrs:adj.get(node)){
//             if(vis[nbrs]==0) dfs(adj,vis,st,nbrs);
//         }
//         st.push(node);
//     }
// }