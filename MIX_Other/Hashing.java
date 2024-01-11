import java.util.HashMap;
import java.util.Map;

public class Hashing {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        //Insertion
        map.put("ankit",1);
        map.put("nidhi", 2);
        map.put("dwivedi", 8);
        map.put("ankit", 5);
        map.put("thi", 90);
        map.put(null, 78);
        //it allows one null keys 
        map.put("ankit",map.get("ankit")+1);
        // System.out.println(map.get("ankit"));
        System.out.println(map);

        //search
        if(map.containsKey("ankit")){
            // System.out.println(map.get("dwivedi"));
        }

        //print

        // for (Map.Entry<String,Integer>e:map.entrySet()) {
        //     System.out.print(e.getKey()+"   ");
        //     System.out.println(e.getValue());
            
        // }
    }
}
