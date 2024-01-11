package coding_blocks_online;

import java.util.Arrays;

public class Merge_sort {
    static void quick_sort(int arr[],int l,int h){
        if(l>=h){
            return;
        }
        int pivot=partition(arr, l, h);
        quick_sort(arr, l, pivot-1);
        quick_sort(arr, pivot+1, h);
    }
    public static void main(String[] args) {
        int arr[]={3,64,64,75,565,3,2,47,4,76};
        quick_sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static int partition(int [] arr,int l,int h){
        int idx=l;
        int last=arr[h];
        for(int i=l;i<h;i++){
            if(arr[i]<=last){
                int t=arr[i];           //swap i and idx
                arr[i]=arr[idx];
                arr[idx]=t;
                idx++;
            }
        }
        int t=arr[idx];
        arr[idx]=arr[h];
        arr[h]=t;     //swap idx and h
        return idx;
    }
}
