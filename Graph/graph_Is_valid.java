import java.util.*;

public class graph_Is_valid {
    public class Solution {
        public boolean valid(int n,int [][]edges){
            HashMap<Integer,List<Integer>> map=new HashMap<>();
            for(int i=0;i<n;i++){
                map.put(i,new ArrayList<>());
            }
            for(int i=0;i<edges.length;i++){
                int a=edges[i][0];
                int b=edges[i][1];
                map.get(a).add(b);
                map.get(b).add(a);
            }
            return DFT(map);
        }
        public boolean DFT(HashMap<Integer,List<Integer>> map){
            Stack<Integer> st=new Stack<>();
            HashSet<Integer> visited=new HashSet<>();
            int c=0;
            for(int src:map.keySet()){
                if(visited.contains(src)) continue;
                c++;
                st.push(src);
                while(!st.isEmpty()){
                    //1.remove
                    int rv=st.pop();
                    //2.if already visited then ignore
                    if(visited.contains(rv)){
                        return false;
                    }
                    //3.mark visited
                    visited.add(rv);
                    //4.self work
                    System.out.println(rv+" ");
                    //5.add nbrs
                    for(int i:map.get(rv)){
                        if(!visited.contains(i)) st.push(i);
                    }
                }
            }
            return c==1;
        }
        
    }
}
