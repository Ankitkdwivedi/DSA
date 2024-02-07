import java.util.*;
class SortFreq {
    public static void main(String[] args) {
        List<Integer> nums=new ArrayList<>();
        nums.add(1);
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(1);
        nums.add(2);
        nums.add(2);
        nums.add(2);
        nums.add(9);
        nums.add(9);
        nums.add(5);
        System.out.println(nums);
        f(nums);
    }
    public static void f(List<Integer> nums) {
       HashMap<Integer,Integer> m=new HashMap<>();
       for(int i:nums) m.put(i,m.getOrDefault(i,0)+1);
       Collections.sort(nums,(a,b)->{
           if(m.get(a)==m.get(b)){
               return a-b;
           }
           return m.get(a)-m.get(b);
       }) ;
       System.out.println(nums);
    }
}