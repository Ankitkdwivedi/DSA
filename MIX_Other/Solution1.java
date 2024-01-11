import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution1 {
    public static void main(String[] args) {
        System.out.println(combinationSum3(4,10));
        
    }

    static ArrayList<ArrayList<Integer>> combinationSum3(int k, int n) {
        // Write your code here.
        ArrayList<Integer> l=new ArrayList<>();
        ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
        rec(k, n, l, list, 0,n);
        return list;
    }
    static void rec(int k,int n,ArrayList<Integer> l,ArrayList<ArrayList<Integer>> list,int id,int t){
        if(n==0&&l.size()==k){
            //if(!list.contains(l)){
            list.add(new ArrayList<>(l));
            //}
            return;
        }
        if(n<0) return;
        for(int i=1;i<=t;i++){
            l.add(i);
            rec(k, n-i, l, list, i,t);
            l.remove(l.size()-1);
        }
    }
}   