import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Alien_Dictionary {
        public String findOrder(String[] words) {
            HashMap<Character,List<Character>> map=new HashMap<>();
            for(int i=0;i<words.length;i++){
                String w=words[i];
                for(char ch:w.toCharArray()){
                    if(!map.containsKey(ch)){
                        map.put(ch,new ArrayList<>());
                    }
                }
            }
            for(int i=0;i<words.length-1;i++){
                String s1=words[i];
                String s2=words[i+1];
                for(int j=0;j<Math.min(s1.length(),s2.length());j++){
                    if(s1.startsWith(s2)&&s1.length()>s2.length()){
                        return "";
                    }
                    if(s1.charAt(j)!=s2.charAt(j)){
                        map.get(s1.charAt(j)).add(s2.charAt(j));
                    }
                }
            }
            return Alien_Dict(map);

        }
        public int [] indegree(HashMap<Character,List<Character>> map){
        int arr[]=new int [26];
        for(char key:map.keySet()){
            for(char nbrs:map.get(key)){
                arr[nbrs-'a']++;
            }
        }
        return arr;
    }
    public String Alien_Dict(HashMap<Character,List<Character>> map){
        StringBuilder ans=new StringBuilder();
        int []inDeg=indegree(map);
        Queue<Character> q=new LinkedList<>();
        for(char ch:map.keySet()){
            if(inDeg[ch-'a']==0){
                q.add(ch);
            }
        }
        int c=0;
        while(!q.isEmpty()){
            c++;
            char v=q.poll();
            ans.append(v);
            for(char nbrs:map.get(v)){
                inDeg[nbrs-'a']--;
                if(inDeg[nbrs-'a']==0) q.add(nbrs);
            }

        }
        return c==map.size()?ans.toString():"";
    }
    public static void main(String[] args) {
        Alien_Dictionary st=new Alien_Dictionary();
        String words[]={"wrt","wrf","er","ett","rftt"};
        String s[]={"abc","ab"};
        System.out.println(st.findOrder(words));
        
    } 
}
