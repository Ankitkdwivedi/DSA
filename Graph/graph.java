import java.util.HashMap;
import java.util.HashSet;

public class graph {
    HashMap<Integer,HashMap<Integer,Integer>>map;
    public graph(int v){
        map = new HashMap<>();
        for(int i=1;i<=v;i++){
            map.put(i,new HashMap<>());
        }
    }
    public void addEdge(int v1,int v2,int cost){
        map.get(v1).put(v2,cost);
        map.get(v2).put(v1, cost);
    }
    public boolean containsEdge(int v1,int v2){
        return map.get(v1).containsKey(v2);
    }
    public boolean containsVertex(int v1){
        return map.containsKey(v1);
    }
    public int noofEdge(){
        int ans=0;
        for(int nbrs:map.keySet()){
            ans+=map.get(nbrs).size();
        }
        return ans/2;
    }
    public void removeEdge(int v1,int v2){
        map.get(v1).remove(v2);
        map.get(v2).remove(v1);
    }
    public void removeVertex(int v){
        for(int nbrs:map.get(v).keySet()){
            map.get(nbrs).remove(v);
        }
        map.remove(v);
    }
    public void Display(){
        for(int key:map.keySet()){
            System.out.println(key+"  "+map.get(key));
        }
    }
    public boolean haspath(int src,int des,HashSet<Integer> visited){
        if(src==des) return true;
        visited.add(src);
        for(int nbrs:map.get(src).keySet()){
            if(!visited.contains(nbrs)){
            boolean ans=haspath(nbrs, des,visited);
            if(ans) return ans;
            }
        }
        return false;
    }
    public void printallpath(int s,int e,HashSet<Integer> visited,String path){
        if(s==e){
            System.out.println(path+s);
            return;
        }
        visited.add(s);
        for(int nbrs:map.get(s).keySet()){
            if(!visited.contains(nbrs)){
                printallpath(nbrs, e, visited, path+s);
            }
        }
        visited.remove(s);
    }
    

}