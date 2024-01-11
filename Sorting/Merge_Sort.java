package Sorting;
//O(nlogn) space is O(n)
import java.util.Arrays;

public class Merge_Sort {
    public static void main(String[] args) {
        int arr[] ={12, 43, 56, 78, 90};
        arr=merge(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static int[] merge(int arr[],int l,int h){
        if(l==h){
            return new int[]{arr[l]};
        }
        int mid=(h+l)/2;
        int []fs=merge(arr, l, mid);
        int []ss=merge(arr, mid+1, h);
        return mergeTwo(fs,fs.length,ss,ss.length);
    }
    static int []mergeTwo(int[] nums1, int m, int[] nums2, int n) {
        int ans[]=new int[m+n];
        int ci=0;
        int i=0;
        int j=0;
        while(i<m&&j<n){
            if(nums1[i]<=nums2[j]){
                ans[ci++]=nums1[i];
                i++;
            }
            else{
                ans[ci++]=nums2[j];
                j++;
            }
        }
        while(i<m){
            ans[ci++]=nums1[i++];
        }
        while(j<n){
            ans[ci++]=nums2[j++];
        }
        return ans;
    }
}
