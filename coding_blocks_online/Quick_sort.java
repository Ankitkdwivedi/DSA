package coding_blocks_online;

import java.util.Arrays;

public class Quick_sort {
    public static int[] quickSort(int []arr,int low,int high){
        if(low==high){
            int[] temp=new int[1];
            temp[0]=arr[low];
            return temp;
        }
        int mid=(low+high)/2;
        int fs[]=quickSort(arr, low, mid);
        int ls[]=quickSort(arr, mid+1, high);
        return merge_two_sorted_array(fs, ls);
    } 
    public static void main(String[] args) {
        int []arr={3,1,76,4,54,9,35,2};
        arr=quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
      static int[] merge_two_sorted_array(int []arr1,int []arr2){
        int total[]=new int[arr1.length+arr2.length];
        int i=0,j=0,k=0;
        int n=arr1.length;
        int m=arr2.length;
        while(i<n&&j<m){
            if(arr1[i]<=arr2[j]){
                total[k++]=arr1[i];
                i++;
            }
            else{
                total[k++]=arr2[j];
                j++;
            }
        }
        while(i<n){
            total[k++]=arr1[i];
            i++;
        }
        while(j<m){
            total[k++]=arr2[j];
                j++;
        }
        return total;
    } 
}
