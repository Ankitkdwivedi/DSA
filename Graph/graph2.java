import java.util.*;
public class graph2 {
    HashMap<Integer,HashMap<Integer,Integer>>map;
    public graph2(int v){
        map = new HashMap<>();
        for(int i=1;i<=v;i++){
            map.put(i,new HashMap<>());
        }
    }
    public void addEdge(int v1,int v2,int cost){
        map.get(v1).put(v2,cost);
        map.get(v2).put(v1, cost);
    }
    public boolean BFS(int src,int des){
        Queue<Integer> q=new LinkedList<>();
        HashSet<Integer> visited=new HashSet<>();
        q.add(src);
        while(!q.isEmpty()){
            //1.remove
            int rv=q.poll();
            //2.if already visited then ignore
            if(visited.contains(rv)){
                continue;
            }
            //3.mark visited
            visited.add(rv);
            //4.self work
            if(rv==des){
                return true;
            }
            //5.add nbrs
            for(int i:map.get(rv).keySet()){
                if(!visited.contains(i)) q.add(i);
            }
        }
        return false;
    }

    public boolean DFS(int src,int des){
        Stack<Integer> st=new Stack<>();
        HashSet<Integer> visited=new HashSet<>();
        st.push(src);
        while(!st.isEmpty()){
            //1.remove
            int rv=st.pop();
            //2.if already visited then ignore
            if(visited.contains(rv)){
                continue;
            }
            //3.mark visited
            visited.add(rv);
            //4.self work
            if(rv==des){
                return true;
            }
            //5.add nbrs
            for(int i:map.get(rv).keySet()){
                if(!visited.contains(i)) st.push(i);
            }
        }
        return false;
    }

    public void BFT(){
        Queue<Integer> q=new LinkedList<>();
        HashSet<Integer> visited=new HashSet<>();
        for(int src:map.keySet()){
            if(visited.contains(src)) continue;
            q.add(src);
            while(!q.isEmpty()){
                //1.remove
                int rv=q.poll();
                //2.if already visited then ignore
                if(visited.contains(rv)){
                    continue;
                }
                //3.mark visited
                visited.add(rv);
                //4.self work
                System.out.println(rv+" ");
                //5.add nbrs
                for(int i:map.get(rv).keySet()){
                    if(!visited.contains(i)) q.add(i);
                }
            }
        }
    }

    public void DFT(){
        Stack<Integer> st=new Stack<>();
        HashSet<Integer> visited=new HashSet<>();
        for(int src:map.keySet()){
            if(visited.contains(src)) continue;
            st.push(src);
            while(!st.isEmpty()){
                //1.remove
                int rv=st.pop();
                //2.if already visited then ignore
                if(visited.contains(rv)){
                    continue;
                }
                //3.mark visited
                visited.add(rv);
                //4.self work
                System.out.println(rv+" ");
                //5.add nbrs
                for(int i:map.get(rv).keySet()){
                    if(!visited.contains(i)) st.push(i);
                }
            }
        }
    }
}
