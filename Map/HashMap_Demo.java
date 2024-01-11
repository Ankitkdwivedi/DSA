import java.util.HashMap;
//get-o(n) ,put-o(n),
public class HashMap_Demo{              //implemented by linkedlist
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("a",1);
        map.put("bg",20);
        map.put("cy",3);
        map.put("d",1);
        map.put(null, 23);
        // System.out.println(map);                     //printing in random order

        //key will be unique but value can be same

        //System.out.println(map.get("c"));                 //if key doesnot contain then it will give null
        // System.out.println(map.remove("bg"));   

        // System.out.println(map.containsKey("d"));

        System.out.println(map.get(null));

    }
}