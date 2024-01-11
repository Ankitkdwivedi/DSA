import java.util.HashMap;

public class hashing_to_count_numbers {
    public static void main(String[] args) {
        int arr[]=new int[]{2,1,4,2,1,2,4,12};
        HashMap<Integer,Integer> c=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            c.put(arr[i],c.getOrDefault(arr[i],0)+1);
        }
        //System.out.println(c);
        int check[]=new int[]{1,2,4,12};
        for(int i=0;i<check.length;i++){
            if(c.containsKey(check[i])){
                System.out.println(c.get(check[i]));
            }
            else System.out.println("nhi chl rha");
        }
    }
    
}
