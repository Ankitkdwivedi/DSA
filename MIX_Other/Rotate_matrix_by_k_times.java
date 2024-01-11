import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Rotate_matrix_by_k_times {

    public static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> arr, int k) {

        // Write your code here
        k=k%arr.get(0).size();
        int n=arr.get(0).size();
        List<Integer> l=new ArrayList<>();
        while(k!=0){
            for(int i=0;i<n;i++){
                l.add(arr.get(i).get(n-1));
                arr.get(i).remove(n-1);
            }
            for(int i=n-1;i>=0;i--){
                arr.get(i).add(0,l.get(i));
                l.remove(i);
            }
            k--;
        }
        return arr;

    }
}