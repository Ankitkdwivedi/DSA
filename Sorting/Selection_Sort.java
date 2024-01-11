package Sorting;

import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        int arr[]={4,12,22,1,4,7};
        for(int i=0;i<arr.length;i++){
            int minIndex = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int t=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=t;
        }
        System.out.println(Arrays.toString(arr));
    }
}
