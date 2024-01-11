package Sorting;

import java.util.Arrays;

public class Insertion_Sort {
    public static void main(String[] args) {
        int arr[] ={64, 25, 12, 22, 11,3,7,234,44};
        int n=arr.length;
        for(int i=1;i<n;i++){
            int j=i-1;
            int item=arr[i];
            while(j>=0&&arr[j]>item){
                arr[j+1]=arr[j];
                j--;
            }
            j++;
            arr[j]=item;
        }
        System.out.println(Arrays.toString(arr));
    }
}
