import java.util.*;
public class cyclesort {
    public static void main(String[] args) {
        int []arr={1,3,2,6,5,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int arr[]){
        for(int i=0;i<arr.length;){
            int original=arr[i]-1;
            if(arr[i]!=arr[original]){
                swap(arr,i,original);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int[]arr,int a,int b){
            int t=arr[a];
            arr[a]=arr[b];
            arr[b]=t;
    }
}
