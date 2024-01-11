import java.util.*;

public class combination_leetcode {
    public static void main(String []args){
        int n=4;
        int k=2;
        boolean arr[]=new boolean[n];
        List<Integer> ans=new ArrayList<>();
        rec(arr, k, 0,ans);
    }
    static void rec(boolean[]arr,int tq,int tqsp,List<Integer> ans ){
        if(tq==tqsp){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==false){
                arr[i]=true;
                ans.add(i+1);
                rec(arr, tq, tqsp+1, ans);
                ans.remove(ans.size()-1);
                arr[i]=false;
            }
        }
    }
}
