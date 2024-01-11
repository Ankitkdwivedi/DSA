import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Course_Schedule {
    class Solution {
        public boolean canFinish(int numCourses, int[][] prerequisites) {
           HashMap<Integer, List<Integer>> map=new HashMap<>();
        for (int i = 1; i <= numCourses; i++) {
            map.put(i, new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++){
            map.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        return Cycle(map);
    } 
    public int[] indegree(HashMap<Integer, List<Integer>> map){
        int v=map.size();
        int arr[]=new int [v+1];
        for(int key:map.keySet()){
            for(int nbrs:map.get(key)){
                arr[nbrs]++;
            }
        }
        return arr;
    }
    public boolean Cycle(HashMap<Integer, List<Integer>> map){
        int []inDeg=indegree(map);
        int c=0;
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<inDeg.length;i++){
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
        return c==map.size();
    }
    }
}
