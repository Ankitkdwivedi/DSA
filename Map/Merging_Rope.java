import java.util.PriorityQueue;

public class Merging_Rope {
    public static void main(String[] args) {
        int []arr={2,3,4,1,5,7};
        PriorityQueue<Integer> q=new PriorityQueue<>();
        for(int i:arr) q.add(i);
        int ans=0;
        while(q.size()>1){
            ans=q.poll()+q.poll();
            q.add(ans);
        }
        System.out.println(ans);
    }
}
