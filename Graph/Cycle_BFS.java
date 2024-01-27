import java.util.ArrayList;

class Pair {
    int first;
    int second;

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}
class Solution {
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> map) {
        return IsCycle(map); 
    }
    public boolean IsCycle(ArrayList<ArrayList<Integer>> map){
        boolean vis[]=new boolean[map.size()];

        for(int i=0;i<map.size();i++){
            if(vis[i]==false){
                if(checkCycle(map,vis,i)) return true;
            } 
        }
        return false;
    }
    public boolean checkCycle(ArrayList<ArrayList<Integer>> map,boolean[] vis,int node){
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(node,-1));
        vis[node]=true;
        while(!q.isEmpty()){
            Pair p=q.poll();
            int currNode=p.first;
            int parent=p.second;
            
            for(int nbrs:map.get(currNode)){
                if(vis[nbrs]==false){
                    vis[nbrs]=true;
                    q.add(new Pair(nbrs, currNode));
                }
                else if(nbrs!=parent) return true;
            }
        }
        return false;
    }
}