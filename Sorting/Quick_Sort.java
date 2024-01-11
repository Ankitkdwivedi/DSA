package Sorting;

import java.util.Arrays;
//nlogn 
public class Quick_Sort {
    public static void main(String[] args) {
        int [] arr={5,2,8,1,32,56,90};
        qs(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void qs(int arr[],int low,int high){
        if(low==high) return;
        if(low<high){
            int pivot=ps(arr,low,high); //near about o(n) in first step and it will keep on decreasing in further stepw
            qs(arr, low, pivot); //these two calls will take logn
            qs(arr, pivot+1, high);
        }
    }
    static int ps(int[]arr,int low,int high){
        int pivot=low;
        int i=low;
        int j=high;
        while (i<j) {
            while(arr[i]<=arr[pivot]&&i<=high-1) i++;
            while(arr[j]>arr[pivot]&&j>=low+1) j--;
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int t=arr[j];
        arr[j]=arr[pivot];
        arr[pivot]=t;
        return pivot;
    }
}
