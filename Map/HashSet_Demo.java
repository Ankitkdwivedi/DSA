import java.util.*;

public class HashSet_Demo {         //hashtable and hashmap mixture
    public static void main(String[] args) {
        // HashSet<Integer> set=new HashSet<>();
        // set.add(4);      //autoboxing
        // set.add(-43);                                    //o(1)
        // set.add(4);
        // System.out.println(set);
        // System.out.println(set.contains(409));
        // System.out.println(set.contains(4));




        TreeSet<Integer> set2=new TreeSet<>();
        set2.add(4);
        set2.add(-43);                                              //o(n) because of sorting technique
        set2.add(4);
        // System.out.println(set2);
        for(int i:set2){
            System.out.println(i);
        }
    }
}
