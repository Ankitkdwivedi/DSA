import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;
//get-o(logn) ,put-o(logn),
public class TreeMap_Demo{              //implemented by red black tree
    public static void main(String[] args) {
        TreeMap<String,Integer> map=new TreeMap<>();
        map.put("a",1);
        map.put("bg",20);
        map.put("cy",3);                        //no null value as a key because of sorting technique 
        map.put("d",1);
        // map.put(null, 23);
        // System.out.println(map);                     //printing in keywise sorted order

        //key will be unique but value can be same

        // System.out.println(map.get("c"));                 //if key doesnot contain then it will give null
        // System.out.println(map.remove("bg"));   

        // System.out.println(map.containsKey("d"));

        // System.out.println(map.get(null));

        LinkedHashMap<String,Integer> map2=new LinkedHashMap<>();           //implemented by doubly linked list
        map2.put("a",1);
        map2.put("bg",20);
        map2.put("cy",3);
        map2.put("d",1);//          o(n) complexity

        Set<String>key=map2.keySet();
        for(String s:key){
            System.out.println(s+"   "+map.get(s));
        }
        // System.out.println(map2);

    }
}